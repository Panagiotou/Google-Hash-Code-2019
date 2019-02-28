import java.io.*;
import java.util.*;
public class Input{



  public ArrayList<Photo> horiz;
  public ArrayList<Photo> vertic;

  public void readPhotos(String filename)throws Exception {

    File file = new File(filename);


    BufferedReader br = new BufferedReader(new FileReader(file));
    this.horiz = new ArrayList<Photo>();
    this.vertic = new ArrayList<Photo>();
    Long numofpics;
    String st;
    String[] Curr_line;
    Character c;
    int id,numoftags;
    ArrayList<String> curr_tags;
    st = br.readLine();
    numofpics = Long.parseLong(st);
    id = 0;

    while ((st = br.readLine()) !=null) {
        System.out.println(st);

        Curr_line = st.split(" ");
        c = Curr_line[0].charAt(0);
        numoftags = Integer.parseInt(Curr_line[1]);
        curr_tags = new ArrayList<String>();
        System.out.println(c);
        System.out.println(Curr_line.length-2);
        for (int i=2;i<Curr_line.length;i++){
            System.out.println(Curr_line[i]);
            curr_tags.add(Curr_line[i]);
        }
        Photo new_ph = new Photo(c,id,Curr_line.length-2,curr_tags);
        if(c.equals('H'))
          this.horiz.add(new_ph);
        else
          this.vertic.add(new_ph);

    }

  }

  public ArrayList<Photo> getVertic(){
    return this.vertic;
  }

  public ArrayList<Photo> getHoriz(){
    return this.horiz;
  }
  public ArrayList<Slide> makeSlideArray(){
    ArrayList<Slide> res = new ArrayList<Slide>();
    for(int i=0; i<horiz.size(); i++){
      Slide temp = new Slide(horiz.get(i));
      res.add(temp);

    }
    Collections.shuffle(vertic);
    HashSet<Integer> mySet = new HashSet<Integer>();
    for(int i=0; i<vertic.size(); i++){
      if(i+1 < vertic.size()){
        Slide temp = new Slide(vertic.get(i), vertic.get(i+1));
        res.add(temp);
      }
    }
    Collections.shuffle(res);
    return res;
  }

  public static void main(String[] args)throws Exception {
    Input inp = new Input();
    inp.readPhotos("a_example.txt");
    ArrayList<Slide> mySlides = new ArrayList<Slide>();
    mySlides = inp.makeSlideArray();
    for(int i=0; i<mySlides.size(); i++){
      mySlides.get(i).printTags();
    }
  }

}

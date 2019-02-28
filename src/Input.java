import java.io.*; 
import java.util.*;
public class Input{



  ArrayList<Photo> horiz;
  ArrayList<Photo> vertic;

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

  public static void main(String[] args)throws Exception { 
    Input inp = new Input();
    inp.readPhotos("a_example.txt");
  }

} 
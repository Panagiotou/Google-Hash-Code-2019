import java.io.*; 
import java.util.*;
public class Input{

  public ArrayList<Photo> readPhotos(String filename)throws Exception 
  { 
  
    File file = new File(filename); 
    
    BufferedReader br = new BufferedReader(new FileReader(file)); 
    
    Long numofpics;
    String st;
    String[] Curr_line; 
    char c;
    int id,numoftags;
    ArrayList<String> curr_tags;
    st = br.readLine();
    numofpics = Long.parseLong(st);
    id = 0;
    ArrayList<Photo> photo_list = new ArrayList<Photo>();
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
        photo_list.add(new_ph);
    }
    return photo_list;
  }  
  public static void main(String[] args)throws Exception { 
    Input inp = new Input();
    inp.readPhotos("a_example.txt");
  }

} 
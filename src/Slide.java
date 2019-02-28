import java.util.*;
public class Slide {

	public char type;
	public ArrayList<Integer> ids;
	public HashSet<String> tagsSet;
	public ArrayList<String> tagsArray;

	public Slide(Photo p){
    // Horizontal
		type = p.type;
    ids = new ArrayList<Integer>();
		ids.add(p.id);
		tagsArray = p.tags;
	}
	public Slide(Photo p1, Photo p2){
    // Vertical
		type = p1.type;
    ids = new ArrayList<Integer>();
		ids.add(p1.id);
		ids.add(p2.id);
    String temp;
    HashSet<String> h = new HashSet<String>();
    ArrayList<String> t = new ArrayList<String>();
    for(int i=0; i<p1.N; i++){
      temp = p1.tags.get(i);
      if(! h.contains(temp)){
        h.add(temp);
        t.add(temp);
      }
    }
    for(int i=0; i<p2.N; i++){
      temp = p2.tags.get(i);
      if(! h.contains(temp)){
        h.add(temp);
        t.add(temp);
      }
    }
		tagsSet = h;
    tagsArray = t;
	}
  public void printTags(){
    System.out.println("Slide has tags: ");
    for(int i=0; i<tagsArray.size(); i++){
      System.out.println("	" + tagsArray.get(i));
    }
  }




}

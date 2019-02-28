import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Slide {

	public char type;
	public ArrayList<Integer> ids;
	public HashSet<String> tags;
	public ArrayList<String> tagsarray;

	public Slide(Photo p){
    // Horizontal
		type = p.type;
		ids.add(p.id);
		tags = p.tags;
	}
	public Slide(Photo p1, Photo p2){
    // Vertical
		type = p1.type;
		ids.add(p1.id);
		ids.add(p2.id);
    String temp;
    Hashet<String> h = new Hashset<String>();
    ArrayList<String> t = new ArrayList<Sring>();
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
		tags = h;
    tagsarray = t;
	}

	public void print() {
		System.out.println("Photo is  " + String.valueOf(type) + " and has " + String.valueOf(N) + " tags:");
		for(int i=0; i<N; i++){
			System.out.println("	" + tags.get(i));
		}
	}
}

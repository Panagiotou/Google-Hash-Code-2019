import java.util.ArrayList;
public class Photo {

	public char type;
	public int N;
	public ArrayList<String> tags;

	public Photo(char c, int n, ArrayList<String> t) {
		type = c;
		N = n;
		tags = t;
	}

	public void Photo() {
		System.out.println("Photo is  " + String.valueOf(type) + " and has " + String.valueOf(N) + " tags:");
		for(int i=0; i<N; i++){
			System.out.println("	" + tags.get(i));
		}
	}
}

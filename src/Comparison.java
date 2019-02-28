import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//import java.util.Math;

public class Comparison{


   	public int getScoreBetween2(Slide s1, Slide s2) {
   		//min among T1/2,T2/1,T12
   		int common=0;
   		int tags1=0;

   		for(String str : s1.tagsarray){ 
		    
   			if((s1.tagsSet).contains(str)){
   				common++;
   			}
   			else{
   				tags1++;
   			}
		}

		return Math.min(Math.min(common,tags1),(s1.tagsarray).size()+(s2.tagsarray).size()-2*common-tags1) ;
    }
}
import java.util.ArrayList;
import java.util.HashSet;

public class ListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> p= new ArrayList<String>();
		p.add("jinga");
		p.add("amn");p.add("klop");
		p.add("amn");
		System.out.println(p);
		
		HashSet<String> p1= new HashSet<String>();
		p1.add("jinga");
		p1.add("amn");p1.add("klop");
		p1.add("amn");
		System.out.println("here"+p1);
		/***
		 *  comparator concpt 
		 *  when to go for comparator concept?
		 *   when we want customized sorting
		 *   
		 *   
		 *   public int compare(obj1,obj2)
		 *   return -ve if obj1 has to come before obj2
		 *   return +v if obj1 has to come after obj2
		 *   return 0 ob1 and obj2 are equal
		 */
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

class MyCompartool implements Comparator{
	@Override
	public int compare(Object arg0, Object arg1) {
		Integer I1=(Integer)arg0;
		Integer I2=(Integer)arg1;
		 
		return (I1<I2)? 1:(I1>I2)? -1:0;
	}
	
}
public class TestcomparatorwitLamda {

	public static void main(String[] args) {
		// 
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(989);
		ts.add(378);
		ts.add(738);
		ts.add(7);
		ts.add(90);
		/**
		 * using comparator without generics will use casting 
		 * below output for basic comparator for descending order and treeset 
		 * for ascending order
		 * */
		System.out.println(" treeset NOGENERICS :"+ts);
		TreeSet<Integer> t=new TreeSet<Integer>((I1,I2)-> (I1<I2)? 1:(I1>I2)? -1:0);
		t.add(989);
		t.add(378);
		t.add(738);
		t.add(7);
		t.add(90);
		
		System.out.println("comparator with generics"+t );
		/***
		 * Implement Map using comparator 
		 * */
		TreeMap<Integer,String> mp=new TreeMap<Integer,String>((I1,I2) -> (I1<I2)? 1:(I1>I2)? -1:0); 
		mp.put(891, "amplli");
		mp.put(451, "doll");
		mp.put(1, "tiktok");
		mp.put(145, "palli");
		mp.put(156, "dip");
		mp.put(148, "cake");
		mp.put(146, "jk");
		mp.put(41, "dog");
		System.out.println("Treemap output plain :"+mp);
		/**
		 *sorting using List collections.sort 
		 ***/
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(787);
		al.add(8);
		al.add(923);
		al.add(369);
		al.add(90);
		System.out.println("before plain :"+al);
		Collections.sort(al);
		System.out.println("After sorting List :"+al);
		Collections.sort(al,(I1,I2)->(I1<I2)? 1:(I1>I2)? -1:0);
		System.out.println("After sorting List :"+al);
	}

}

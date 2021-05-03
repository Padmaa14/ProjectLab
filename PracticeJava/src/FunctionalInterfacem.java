import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface 
interface padma {
	abstract int callfunc(int i);
}
class student{
	String name;
	int marks;
	student(String _name,int mark){
		this.marks=mark;
		this.name=_name;
	}
}
public class FunctionalInterfacem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		padma p=i-> i+i;
		System.out.println(p.callfunc(6));
		/**
		 * predicate used example 1  for conditional checks */
		Predicate<Integer> pd= x -> x > 8;
		System.out.println("100 is greater :"+pd.test(100));
		/**
		 * predicate used example for 2 */
		String[] s= {"padma","lovly","kunam"};
		Predicate<String> st= L ->L.charAt(2) =='v';
		for(String s1:s){
			System.out.println(st.test(s1));
		}
		/**
		 * Function fI example*/
		Function<student,String> fn= v->{
		int marks=v.marks;
		String g="";
		if(marks < 50) g="C";
		else if(marks < 80)g="B";
		if(marks > 85)g="A";
		return g;
		};
		student[] sam= {new student("rita",50),new student("padma",86),
				new student("dope",70),new student("ritaasda",10)};
		for(student s1 :sam) {
			System.out.println("Name :"+s1.name+" grade :"+fn.apply(s1));
		}
		
	}
}

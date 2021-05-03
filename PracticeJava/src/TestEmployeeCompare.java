import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int empno;
	private String empname;
	Employee(int empno,String empname){
		this.empno=empno;
		this.empname=empname;
	}
	@Override
	public String toString() {
		return "empno:" + empno + ", empname:" + empname ;
	}
}
public class TestEmployeeCompare {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(100,"swati"));
		al.add(new Employee(101,"kareena"));
		al.add(new Employee(210,"suraj"));
		al.add(new Employee(1900,"katrin"));
		al.add(new Employee(4130,"depika"));
		al.add(new Employee(120,"alia"));
		System.out.println("Before sorting :"+al);
		Collections.sort(al,(e1,e2)-> (e1.empno <e2.empno)? 1:(e1.empno>e2.empno)? -1:0);
		System.out.println("After sorting :"+al);
		
		/***
		 * al.add(787); al.add(8); al.add(923); al.add(369); al.add(90);
		 **/

	}

}

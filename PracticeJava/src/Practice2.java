
abstract class Test {
	Test() {
		System.out.println("abstrtat constructor");
	}

	final static void method1() {
		System.out.println("final method");
	}
	abstract void blue();
}
@FunctionalInterface
interface Interf{
	abstract void m1() ;
}
public class Practice2  extends Test {
	public void method2() {
		System.out.println("final method");
	}

	public static void main(String[] args) {//why static s executed 2 times
		Test a=new Practice2();
		Test.method1();
		Practice2 p=new Practice2();
		p.method2();
		//p.blue();
		
		//lambda expression
		Interf i=() -> System.out.println("ia ma lamba");
		i.m1();
	//	System.out.println();
		};
	

	@Override
	void blue() {
		// TODO Auto-generated method stub
		System.out.println(" abstrat methd here");
	}

}

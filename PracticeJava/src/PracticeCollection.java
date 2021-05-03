interface I{
	public void m1() ; 
	default void pink() {
		System.out.println("xtra m"); 
		}
}
interface B{
	public void m5();
	default void method2() {
		System.out.println("xtra");
	}
	default void pink() {
		System.out.println("xtra"); 
		}
}
class xyz implements B{

	@Override
	public void m5() {
		System.out.println("mai hu ab class  mai");
		
	}
	public void methodbcls()
	{System.out.println("i am b class rsonal mthod");}	
}

public class PracticeCollection extends xyz{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B i=new PracticeCollection();
		i.m5();
	
		/*
		 * PracticeCollection p=new PracticeCollection(); p.methodbcls(); p.m5();
		 */
		

	}

	
	public void m1() {} //implementation
public void method2() {
	System.out.println("here override default method");
}

	


	
}

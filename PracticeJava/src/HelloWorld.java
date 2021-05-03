

public  class HelloWorld {
	static {
		System.out.println("deaf static block");
	}
	
	  
	   
	   public  static void hello() {
		   System.out.println("hello method from class helloworld");
	   }
	   
	}
class Disp extends HelloWorld{
	
	Disp(){
		System.out.println("disp constructor");
	}
	static {
		System.out.println("Disp class static block");
	}
	
	public  static void hello() {
		
		System.out.println("disp class hello method");
	}
}
class Display {
	
	
	public static void main(String args[] ) {
	//	HelloWorld h=new HelloWorld();
		HelloWorld h=new Disp();
		//HelloWorld.hello();
		//h.hello();
		//h=new Disp();
		//h.hello();
		//Disp ds=new Disp();
		//ds.hello();
	}
}
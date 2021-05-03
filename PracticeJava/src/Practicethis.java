 class A1{
	 int p;
	 A1(){
		
		 p=p;
	 }
	 
	public void method(int p) {
		
		System.out.println(" A1 method call"+p);
	}
}
 class B1 extends A1{
	 int p;
	 public void method( int p) {
		this.p=p;
			System.out.println(" B1 method call"+p);
		}
 }
 class cc{//for constructor chaining
	 cc(){
		 this("expl");
		 System.out.println("i am defaut constuuctr");
	 }
	 cc(String b){
		
		 System.out.println("paraeter costrusct"+b);
	 }
 }
public class Practicethis {
	
	public static void main(String[] args) {
		A1 x=new A1();
		x.method(8);
		B1 x2 =new  B1();
		x2.method(989);
		cc c=new cc();

	}

}

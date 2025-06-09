package Automation_45;

class access_access
{
	public  void m1() {  //non static
		
		System.out.println("public");
		
	}
	private static void m2() {  //static
		System.out.println("private");
	}
	protected static void m3() {
		System.out.println("protected");
	
	}
	static void m4() {
		System.out.println("default");
	
	}
}
public class Check_method_accessspecifier_package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		access_access a1=new access_access();
		a1.m1();  // calling non static method
		//access_access.m2();//calling static method
		access_access.m3();
		access_access.m4();
	}

}

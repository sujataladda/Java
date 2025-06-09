package Automation_45;

public class Check_method_accessspecifier {
	
	public void sujata()
	{
		System.out.println("I am public method");
	}
	
	void Lokesh()
	{
		System.out.println("I am default/package method");
	}
	private void Yaadvi()
	{
		System.out.println("I am private method");
	}
	protected void Shlokaa()
	{
		System.out.println("I am protected method");
	}
	
	public static void main(String[] args) {
		
		Check_method_accessspecifier m1=new Check_method_accessspecifier();
		m1.sujata();
		m1.Shlokaa();
		m1.Yaadvi();
		m1.Lokesh();
		
	}

}

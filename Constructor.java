package Automation_45;

class Constructor1 {  //constructor overloading 
	Constructor1(int a)
	{
		System.out.println("1");
	}

}

 class child extends Constructor1
{
	 child()
	 {
		 super(1);
		 System.out.println("2");
	 }
}

	class Constructor extends child {
		
		Constructor()
		{
			System.out.println("3");
		}
 public static void main(String[] args)
	 {
	 new Constructor();
	
	}
	
	 }

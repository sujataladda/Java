package Automation_45;

public class ConstructorOverload {
	public ConstructorOverload(){
		this(10);
		System.out.println("nonparametrized constructor");
		
	}
	
	public  ConstructorOverload(int a)
	{this('a');
		System.out.println("parametrized constructor with int datatype");
		
		
	}
	public ConstructorOverload(char a)
	{
		System.out.println("parametrized constructor with char datatype");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new ConstructorOverload();
	}

}

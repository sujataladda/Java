package Automation_45;

public class area_circle_usingrandom {
	final static double pi=Math.PI;
	double r=Math.random();
	
	
	double area=pi*r*r;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		area_circle_usingrandom a1=new area_circle_usingrandom();
		System.out.println("value of pi is-->"+a1.pi);
		System.out.println("value of r is-->"+a1.r);
	System.out.println(a1.area);

	}

}

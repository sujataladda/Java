package Automation_45;

import java.util.Arrays;
import java.util.Scanner;

public class Array_rutimevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rollno[]=new int[6];
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			rollno[i]=s1.nextInt();
		}
		
	
		System.out.println(Arrays.toString(rollno));
	}

}

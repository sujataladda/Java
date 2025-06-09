package Automation_45;

import java.util.Arrays;

public class Array_copy_reverseorder {
	public static void main(String[] args) {
		int[] student_roll=new int[5];
		student_roll[0]=21;
		student_roll[1]=22;
		student_roll[2]=23;
		student_roll[3]=24;
		student_roll[4]=25;
		
		int[] student_roll2=new int[5];
		
	System.out.println(Arrays.toString(student_roll));
	
	
for(int i=0,k=4;i<student_roll.length;i++)
	{
		student_roll2[k]=student_roll[i];
		k--;
		
	}
	
	
	
	
	
	System.out.println("Value of array 2 is: "+Arrays.toString(student_roll2));

	}

}

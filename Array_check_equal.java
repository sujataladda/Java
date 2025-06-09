package Automation_45;

import java.util.Arrays;

public class Array_check_equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int student_id1[]=new int[4];
		student_id1[0]=41;
		student_id1[1]=42;
		student_id1[2]=43;
		student_id1[3]=44;
		
		int student_id2[]=new int[4];
		student_id2[0]=41;
		student_id2[1]=49;
		student_id2[2]=43;
		student_id2[3]=44;
		
		
		boolean b=Arrays.equals(student_id1, student_id2);
		System.out.println(b);

	}

}

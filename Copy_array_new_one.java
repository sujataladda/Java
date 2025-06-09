package Automation_45;

import java.util.Arrays;

public class Copy_array_new_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1=new int[4];
		array1[0]=6;
		array1[1]=8;
		array1[2]=10;
		array1[3]=12;
		
		int[] array2=new int[4];
		System.out.println("First array is "+Arrays.toString(array1));
		
		for(int i=0, k=3;i<array1.length;i++)
		{
			array2[k]=array1[i];
			k--;
		}
		System.out.println("Second array is "+Arrays.toString(array2));

	}

}

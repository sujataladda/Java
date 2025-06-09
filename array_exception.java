package Automation_45;

import java.util.Arrays;

public class array_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[]=new char[4];
		a[0]='y';
		a[1]='b';
		a[2]='c';
		a[3]='d';
		
		//for(int i=0;i<=4;i++) {  //will print till 4 values and on nextu7 iteration will throw array outof bounds exception
			//System.out.println(a[i]);
		//}
		
		System.out.println(Arrays.toString(a));
	}

}

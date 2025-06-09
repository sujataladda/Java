package Automation_45;

import java.util.Arrays;

public class Checking_two_string_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="ANGEL";
		String s2="ANGLE";
		

		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
		
		
		//boolean c3=Arrays.equals(c1, c2);
		//System.out.println(c3);
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean c4=Arrays.equals(c1, c2);
		System.out.println(c4);
		
		if(c4==true)
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("String are not anagram");
		}
		
	}

}

package Automation_45;

public class Count_alphabet_space_num_specialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Sujata1  @$%mgm1";
		char[] c1=s1.toCharArray();
		int count_letter=0;
		int count_num=0;
		int count_spaces=0;
		
		for(int i=0;i<s1.length();i++)
		{
		
		boolean b1=Character.isLetter(c1[i]);
		System.out.println(b1);
		if(b1==true)
		{
		count_letter++;
		}
		boolean b2=Character.isDigit(c1[i]);
		System.out.println(b2);
		if(b2==true)
		{
			count_num++;
		}
		boolean b3=Character.isWhitespace(c1[i]);
		System.out.println(b3);
		if(b3==true)
		{
			count_spaces++;
		}
		
		}
		System.out.println("Count of letter is "+count_letter);
		System.out.println("Count of number is "+count_num);
		System.out.println("Count of spaces is "+count_spaces);
		
		int special_char=s1.length()-count_letter-count_num-count_spaces;
		System.out.println("special characters in string are -->"+special_char);

	}

}

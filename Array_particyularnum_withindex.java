package Automation_45;

public class Array_particyularnum_withindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to find the no. 34 is present in array or not along with index
		
		int roll_no[]=new int[4];
		roll_no[0]=21;
		roll_no[1]=23;
		roll_no[2]=56;
		roll_no[3]=34;
		int given_no=34;
		
		for(int i=0;i<4;i++)
		{
			if(given_no==roll_no[i])
			{
				System.out.println("The "+given_no+ " is present at index of "+i);
			}
			
		}
	}

}

package pgdacsectionb;

import java.util.Scanner;

public class ATMCheck 
 {
  public static void main(String[] args)
    {
		String password;
        int i,flag=0;
		Scanner s= new Scanner(System.in);
		for( i=1;i<=3;i++)
		{
		System.out.println("enter password");
		password=s.next();
		if(password.equals("1234"))
		{
			System.out.println(" access allowed");
     	  	break;
		}		
		}
	if(i==4) System.out.println("card blocked");
	s.close(); 
    
   
   }

}

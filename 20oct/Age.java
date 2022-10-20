//To determine oldest and yougest among three person age
/* 
@author:levis kiro
@Date:20/10/2022
*/
import java.util.*; //declaring package
class Age //declaring class
{
	public static void main(String args[]) //declaring main
	{
		int num1,num2,num3; //declaring variables
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of three person : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if((num1>num2) && (num1>num3))
			System.out.println(num1+" is the oldest");
	    else if(num2>num3)
			System.out.println(num2+" is the oldest");
		else 
			System.out.println(num3+" is the oldest");
		if((num1<num2) && (num1<num3))
			System.out.println(num1+" is the youngest");
	    else if(num2<num3)
			System.out.println(num2+" is the youngest");
		else
			System.out.println(num3+" is the youngest");
	}//end of main
}//end of class
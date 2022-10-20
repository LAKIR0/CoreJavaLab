//To determine oldest and yougest among three person age
import java.util.*;
class Age
{
	public static void main(String args[])
	{
		int num1,num2,num3;
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
	}
}
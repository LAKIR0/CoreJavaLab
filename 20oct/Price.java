//to give 10% dicount on quantity cost more than rs 2000
/* 
@author:levis kiro
@Date:20/10/2022
*/
import java.util.*;//declaring package
class Price//declaring class
{
	static void qt(int n1)//formal argument(method to calculate cost of qauntity)
	{
		int price= n1*540; float cost;
		if(price>2000)
		{
			float dis=(price*10)/100;
			cost= price-dis;
			System.out.println("total cost of the quantity is : "+cost);
		}
		else 
		{
		System.out.println("total cost of the quantity is : "+price);
		}
	}
	//end of method
	public static void main(String args[])//declaring main
	{
		int num1;//declaring variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Shopping bill that exceeds Rs.2000 gets 10% discount");
		System.out.println("cost of 1 unit is rs.540");
		System.out.println("Enter quantity required : ");
		num1= sc.nextInt();
		qt(num1);//actual argument
	}//end of main
}//end of class
//to give 10% dicount on quantity cost more than rs 2000
import java.util.*;
class Price
{
	static void qt(int n1)
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
	public static void main(String args[])
	{
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Shopping bill that exceeds Rs.2000 gets 10% discount");
		System.out.println("cost of 1 unit is rs.540");
		System.out.println("Enter quantity required : ");
		num1= sc.nextInt();
		qt(num1);
	}
}
//TO Find sqaure,cube and check even or odd:
/* 
@author:levis kiro
@Date:20/10/2022
*/
import java.util.*;//declaring package
class SquareCubeOddEven//declaring class
{ 
static void square(int n1)//method to find square
{
	int sqa=n1*n1;
	System.out.println("Square of the number is : "+sqa);
}
//end of method
static void cube(int n1)//method to find cube
{
    int cub=n1*n1*n1;
   System.out.println("Square of the number is : "+cub);
}
//end of method
static void oddeven(int n1)//method to check even or odd
{
	if(n1%2==0)
	System.out.println("number is even");
    else
		System.out.println("number is odd");
}
//end of method
public static void main(String args[])
{
	int num,choice;//declaring variable
	Scanner sc=new Scanner(System.in);
	System.out.println("input number : ");
	num=sc.nextInt();
	System.out.println("1:Square : ");
	System.out.println("2:Cube : ");
	System.out.println("3:OddEven : ");
	System.out.println("4:Exit : ");
	System.out.println("enter your choice : ");
	choice=sc.nextInt();
	switch(choice)//start switch
	{
		case 1 : square(num);
		break;
		case 2 : cube(num);
		break;
		case 3 : oddeven(num);
		break;
		case 4 : System.exit(0);
		break;
		default: System.out.println("wrong input");
	}
	//end of switch
	
}//end main
}//end of class
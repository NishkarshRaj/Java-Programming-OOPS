import java.util.Scanner;
class Prajj{
	public int credit=2000;
	public int temp;
int fun()//Credit Function
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the money to be credited:");
	temp=scan.nextInt();
	credit=credit+temp;
	return credit;
}
} 
class Wallet extends Prajj{
public int debit;
@Override
int fun()//Debit Function
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the money to be debited:");
	debit=scan.nextInt();
	credit=credit-debit;
	return debit;
	
}
public static void main(String[]args)
{
	int a,b;
	Prajj obj2=new Prajj();
	a=obj2.fun();
	System.out.println("Amount Credited "+obj2.temp+" Total Balance "+a);
	Prajj obj1=new Wallet();
	b=obj1.fun();
	System.out.println("Amount debited "+b+" Total Balance "+obj1.credit);
	
}
}
import java.util.Scanner;
public class Fourth
{
int a,b;
public void sum()
{
int c = a+b;
System.out.println("Sum of " + a + " and " + b + " is: " + c);
}
Fourth(int x, int y)
{
a=x;
b=y;
}
Fourth()
{
a=10;
b=20;
}
public static void main(String[] args)
{
System.out.println("Default Constructor");
Fourth ob1 = new Fourth();
ob1.sum();
System.out.println("Parameterised Constructor");
Scanner reader = new Scanner(System.in);
System.out.println("Enter two integers");
int x = reader.nextInt();
int y = reader.nextInt();
Fourth ob2 = new Fourth(x,y);
ob2.sum();
}
}
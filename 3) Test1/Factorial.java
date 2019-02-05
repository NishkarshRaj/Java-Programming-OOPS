import java.util.Scanner;
class Factorial
{
public static void main(String[] args)
{
System.out.println("Code to find Factorial of a number");
int num,fact,num1;
System.out.print("Enter a number: ");
Scanner reader = new Scanner(System.in);
num = reader.nextInt();
fact = 1;
num1 = num;
while(num>0)
{
fact = fact*num;
num = num - 1;
}
System.out.println("The Factorial of the number " + num1 + " is: " + fact);
}
}
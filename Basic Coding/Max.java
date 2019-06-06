import java.util.Scanner;
class Max
{
public static void main(String[] args)
{
int num1,num2;
Scanner reader = new Scanner(System.in);
System.out.println("Enter Two Numbers: ");
num1 = reader.nextInt();
num2 = reader.nextInt();
if (num1 > num2)
{
System.out.println(num1 + " is greater than " + num2);
}
else
{
System.out.println(num2 + " is greater than " + num1);
}
}
}
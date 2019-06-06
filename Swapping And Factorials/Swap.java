import java.util.Scanner;
class Swap
{
public static void main(String[] args)
{
int a,b;
Scanner reader = new Scanner(System.in);
System.out.println("Enter two numbers: ");
a = reader.nextInt();
b = reader.nextInt();
System.out.println("Original value of a and b are: " + a + " and " + b + " respectively");
a = a+b;
b = a-b;
a = a-b;
System.out.println("Swapped value of a and b are: " + a + " and " + b + " respectively");
}
}
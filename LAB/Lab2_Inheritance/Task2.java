import java.util.Scanner;
class Calculator
{
int sum(int a, int b)
{
return a+b;
}
int sub(int a, int b)
{
return a-b;
}
int mul(int a, int b)
{
return a*b;
}
int div(int a, int b)
{
return a/b;
}
}




class Task2 extends Calculator
{
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);
System.out.println("Enter Two numbers: ");
int sum1,sub1,mul1,div1,x,y;
x = reader.nextInt();
y = reader.nextInt();
Task2 ob = new Task2();
sum1 = ob.sum(x,y);
sub1 = ob.sub(x,y);
mul1 = ob.mul(x,y);
div1 = ob.div(x,y);
System.out.println("Sum of two numbers is: " + sum1);
System.out.println("Sub of two numbers is: " + sub1);
System.out.println("Mul of two numbers is: " + mul1);
System.out.println("Div of two numbers is: " + div1);
}
}
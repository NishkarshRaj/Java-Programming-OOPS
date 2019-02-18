import java.util.Scanner;
class Overloading1
{
int function1(int a, int b)
{
System.out.println("First Function with two int arguments!!!");
return a+b;
}
int function1(int a, int b, int c)
{
System.out.println("Second function with three int arguments!!!");
return a*b*c;
}
float function1(float a, float b)
{
System.out.println("Third Function with two float arguments");
return (float)a/b;
}
void function1(char a)
{
System.out.println("Fourth Function with char input: " + a);
}
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);
System.out.println("Enter Two numbers: ");
int x,y,ans1,ans2;
float ans3;
x = reader.nextInt();
y = reader.nextInt();
Overloading1 ob = new Overloading1();
ans1 = ob.function1(x,y);
ans2 = ob.function1(x,y,10);
ans3 = ob.function1(100,32);
ob.function1('a');
System.out.println("Answer of first function is: " + ans1);
System.out.println("Answer of second function is : " + ans2);
System.out.println("Answer of third function is : " + ans3);
}
}
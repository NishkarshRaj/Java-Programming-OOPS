import java.util.Scanner;
class Fibonacci
{
public static void main(String[] args)
{
int i,range,a,b,c;
a = 0;
b = 1;
Scanner reader = new Scanner(System.in);
System.out.print("Enter the range of the Series you want to generate: ");
range = reader.nextInt();
System.out.println(a);
System.out.println(b);
for (i=0; i < range-2; i++)
{
c = a + b;
System.out.println(c);
a = b;
b = c;
}
}
}
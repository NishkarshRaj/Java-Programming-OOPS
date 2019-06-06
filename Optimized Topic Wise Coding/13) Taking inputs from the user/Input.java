import java.util.Scanner;
class Input
{
public static void main(String args[])
{
int int1;
String str1,str2;
char ch1;
float f1;
double d1;
Scanner r = new Scanner(System.in); //Normal object creation of class Scanner where a parameterized constructor is used and input console stream is sent as parameter
System.out.print("Enter an Integer: ");
int1 = r.nextInt();
System.out.print("Enter a String: ");
r.nextLine();								 //general next line to flush any input before taking a string from user
str1 = r.nextLine();
System.out.print("Enter another String: ");
str2 = r.nextLine();
System.out.print("Enter a character: ");
ch1 = r.nextLine().charAt(0);						//No character input but this works so learn this
System.out.print("Enter a float: ");
f1 = r.nextFloat();
System.out.print("Enter a double: ");
d1 = r.nextDouble();
System.out.println("Integer: " + int1);
System.out.println("String 1: " + str1);
System.out.println("String 2: " + str2);
System.out.println("Character 1: " + ch1);
System.out.println("Float 1: " + f1);
System.out.println("Double1: " + d1);
}
}
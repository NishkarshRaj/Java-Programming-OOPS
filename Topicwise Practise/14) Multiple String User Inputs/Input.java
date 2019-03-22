import java.util.Scanner;
class Input
{
public static void main(String args[])
{
Scanner reader = new Scanner(System.in);
String str1,str2,str3;
str1 = reader.nextLine();
str2 = reader.nextLine();
str3 = reader.nextLine();
System.out.println("String 1: " + str1);
System.out.println("String 2: " + str2);
System.out.println("String 3: " + str3);
}
}



/* This works!! Only when we switch from other data type user input to String input we need to flush the input once */
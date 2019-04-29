import java.rmi.*;
import java.util.*;
public class MainClient
{
public static void main(String args[])
{
double x,y;
int choice;
Scanner reader = new Scanner(System.in);
System.out.println("Main Client File");
System.out.print("Enter a numbers: ");
x = reader.nextDouble();
System.out.println("Enter another number: ");
y = reader.nextDouble();
System.out.println("Option Menu");
System.out.println("1) Addition");
System.out.println("2) Subtraction");
System.out.println("3) Multiplication");
System.out.println("4) Division");
System.out.print("Enter your choice: ");
choice = reader.nextInt();
try
{
RemoteInterface st = (RemoteInterface)Naming.lookup("rmi://localhost:1020/add");
//System.out.println("The sum of " + x + " and " + y + " is: " + st.add(x,y));
switch(choice)
{
case 1:
System.out.println("The sum of " + x + " and " + y + " is: " + st.add(x,y));
break;
case 2:
System.out.println("The subtraction of " + x + " and " + y + " is: " + st.sub(x,y));
break;
case 3:
System.out.println("The Multiplication of " + x + " and " + y + " is: " + st.mul(x,y));
break;
case 4:
System.out.println("The Division of " + x + " and " + y + " is: " + st.div(x,y));
break;
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
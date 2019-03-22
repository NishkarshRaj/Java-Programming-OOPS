import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner reader = new Scanner(System.in);
int a,d;
try
{
a = reader.nextInt();
d = a/0;
}
catch(ArithmeticException e)
{
e.printStackTrace(); //prints exception as if the error message if no exception handling
}
catch(InputMismatchException e)
{
//e.getMessage(); =>Only works for User Defined Exceptions
System.out.println(e); //best way => prints only the type of exception
}
}
}
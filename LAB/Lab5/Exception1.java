import java.util.*;
class Exception1
{
public static void main(String[] args)
{
try
{
int a,d;
System.out.print("Enter a integer value: ");
Scanner reader = new Scanner(System.in);
a = reader.nextInt();
d = a/0;
System.out.println("The output divided by zero is: " + d);
}
catch(InputMismatchException e)
{
System.out.println("Different data types entered other than integer!!");
}
catch(ArithmeticException e)
{
System.out.println("The number is divided by zero and the value is: " + Integer.MAX_VALUE); 
//e.printStackTrace();
//System.out.println(e);
}
}
}



/////// BURN IT DOWN!!! Why this exception InputMismatchException stored in java.util package!!! All Data Structure related exception stored in util package
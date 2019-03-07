//Creating User Defined Exception!!!!!
class User_Exception extends Exception //Exception is a class defined in java.lang
{
public User_Exception(String s) //constructor with String inside!! //must be public
{
super(s); //Call constructor of super class Exception!!!
}
}


//Using User Defined Exception!!!!
class Runner
{
public static void main(String[] args)
{
try
{
throw new User_Exception("Error created by the User!!!"); //We forcibly throw an error with new keyword!!
}
catch(User_Exception e)
{
System.out.println(e.getMessage()); //getMessage function calls the constructor of the exception class
}
}
}
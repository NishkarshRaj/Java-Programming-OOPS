import java.util.*; //include entire util packages because all data structures related exceptions in it and rest generic automatically handled by java.lang
//create user exception class
class UserExcp extends Exception //Exception class of java.lang is extended
{
//create a "public" "parameterized constructor" with "String message" that will be sent if error is thrown
public UserExcp(String Message)
{
super(Message); //calls constructor of Exception with message
}
}


class Main
{
public static void main(String args[])
{
try
{
throw new UserExcp("User Defined Exception created!!!");
}
catch(UserExcp e)
{
System.out.println(e.getMessage());
}
}
}


//Use new keyword to throw user defined exception
//use function "getMessage()"
//or "printStackTrace()"
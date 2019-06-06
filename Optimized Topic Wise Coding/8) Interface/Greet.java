/* Interfaces are 100 % abstract classes with no definition at all */

interface greet
{
void greeting();
}
class Greet implements greet
{
public void greeting()
{
System.out.println("Hello");
}
public static void main(String args[])
{
Greet obj = new Greet();
obj.greeting();
}
}

/* BCD!!
1) Since interface is a type of abstract class thus it must be overridden by the class implementing it else error is given
2) Since interface is always meant to be used by the user and thus its default access specifier is public and it must always be defined as public in the classes implementing it
*/
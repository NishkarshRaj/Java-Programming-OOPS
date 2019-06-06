/* 2x types of constructors
1) Default Constructor
2) Parameterized Constructor
*/

class Constructors
{
Constructors()
{
System.out.println("Default Constructor");
}
Constructors(String msg)
{
System.out.println(msg);
}
}

class Main
{
public static void main(String args[])
{
Constructors obj1 = new Constructors();
Constructors obj2 = new Constructors("Parameterized Constructors");
}
}
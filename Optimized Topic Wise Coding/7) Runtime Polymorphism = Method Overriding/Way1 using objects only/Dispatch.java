/* Method Overriding is runtime polymorphism that needs the two functions to be overriddent to have exact same
1) function name
2) return type
3) signature list

BCD! Unline Overloading, Method overriding takes place only for inherited classes resolution
Wait!! Have you thought two unrelated class having same method name: You are stupid because if they are unrelated call will be unabmiguous

 */

class One
{
void show()
{
System.out.println("Show function in class One");
}
}
class Two extends One
{
void show()
{
System.out.println("Show function in class Two");
}
}
class Dispatch
{
public static void main(String args[])
{
One ob1 = new One();
ob1.show();
One ob2 = new Two();
//Two ob2 = new Two();
ob2.show();
}
}


/* Once again same BCD!!! Our commented instantiation is correct and works!!! */
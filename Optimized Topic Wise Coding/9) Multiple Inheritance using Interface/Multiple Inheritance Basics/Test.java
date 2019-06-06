interface One
{
default void show()
{
System.out.println("Show Function of Interface One");
}
}

interface Two
{
default void show()
{
System.out.println("Show function of Interface Two");
}
}

class Test implements One,Two
{
public void show()
{
One.super.show();
Two.super.show();
System.out.println("Show function of Class Test");
}
public static void main(String args[])
{
Test ob = new Test();
ob.show();
}
}


/* BCD Deep Deep!!!!
Java does not allow Multiple Inheritance using Classes because of complexity in resolution of call if overridden
Here in the code)
1) Interfaces can have implementation and not only declaration
2) For Multiple Inheritance, We don't really have to show overriding different functions can be used
3) Even if interfaces are defining methods, they must only be default methods and if they are overridden in the child class then that method must be public only
*/
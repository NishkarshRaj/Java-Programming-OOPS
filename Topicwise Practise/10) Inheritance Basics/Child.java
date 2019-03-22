class Parent
{
String name;
Parent()
{
name = "Raj Khare";
}
}
class Child extends Parent
{
String name1;
Child()
{
name1 = "Nishkarsh Raj Khare";
}
public static void main(String args[])
{
Child obj = new Child();
System.out.println("Father name: " + obj.name); 
System.out.println("Child name: " + obj.name1);
}
}


//BCD!! Unlike C++ here data members are by default "default" and they can be accessed directly by the object
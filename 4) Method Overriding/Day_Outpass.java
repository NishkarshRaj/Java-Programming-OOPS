class Outpass
{
public void show()
{
System.out.println("Outpass Generic Show function!!!");
System.out.println("Date: <Your name>");
System.out.println("Name: <Name of student>");
System.out.println("Out Time: <Out time>");
System.out.println("In Time: <In time>");
}
}
class Day_Outpass extends Outpass
{
@Override //Keyword to tell the compiler that the function is overridden!!!
public void show()
{
System.out.println("Day Outpass Show function!!!");
System.out.println("Date: 19/02/2019");
System.out.println("Name: Nishkarsh Raj");
System.out.println("Out Time: 10:30 am");
System.out.println("In Time: 05:30 pm");
}
public static void main(String[] args)
{
System.out.println("Parent Object");
Outpass ob1 = new Outpass();
ob1.show();
System.out.println("Child Object");
Outpass ob2 = new Day_Outpass();
ob2.show();
}
}



//Overriding versus overloading!!
//Overloading: Same function name but different arguments: type, position, number of arguments
//Overriding: Exact same function and arguments but in inherited class that are resolved at runtime
//Two methods to override!
//1) Shown here: Object always of parent class, create different constructor to call different function!!!
//2) Using a reference variable: Done in assignment 1 folder

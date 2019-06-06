//Multilevel Inheritance to check order of calling of constructor if child class object is made!!!
//No Destructors here!! Automatic resource deallocation and garbage collection done in Java
class One
{
One()
{
System.out.println("Constructor of class One");
}
}
class Two extends One
{
Two()
{
System.out.println("Constructor of class Two");
}
}
class Three extends Two
{
Three()
{
System.out.println("Constructor of class Three");
}
}
class Constructor
{
public static void main(String args[])
{
//Three obj = new Three();
//One obj = new Three(); //Object Of Type of constructor called and not data type!! So all three constructors called!!!
//Three obj = new One(); //Wont Work and cause error!! left is always equal or more higher class
//Two obj = new Three(); //It doesnt matter which data type class you use!! only the constructor call matters!!! All three again called!!!
One obj = new Two(); //Only first two constructors called
}
}


/*BCD!!! A Class object can be made in any class!! Its better to create main function in a standalone class for consistency!!! 
Constructor is called in order: Parent to the Child
*/
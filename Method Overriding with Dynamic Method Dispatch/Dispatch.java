class UPES
{
void description()
{
System.out.println("I am Asia's Best Petroleum University!!!");
}
}

class SoCS extends UPES
{
void description() //Overriding!!
{
System.out.println("The world of Computer Science!!!");
}
}

class SoDS extends UPES
{
void description() //Overriding!!
{
System.out.println("I am the Fashion Industry!!!!");
}
}

class SoES extends UPES
{
void description() //Overriding!!
{
System.out.println("Petroleum, Aerospace, Chemical, Civil and Mechanical!!!");
}
}

class Dispatch //Code for Dynamic Method Dispatch but class Dispatch here Dispatch is not a keyword!! Normal Class
{
public static void main(String[] args)
{
//Overriding with the reference variables!!!
//Create objects of class with class constructors
UPES ob = new UPES();
SoCS ob1 = new SoCS();
SoDS ob2 = new SoDS();
SoES ob3 = new SoES();
UPES ref; //Reference Variable of the parent class
ref = ob;
ref.description();
ref = ob1;
ref.description();
ref = ob2;
ref.description();
ref = ob3;
ref.description();
}
}

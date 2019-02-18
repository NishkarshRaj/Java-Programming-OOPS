//Dynamic Method Dispatch!!!!
class UPES
{
void description()
{
System.out.println("I am Asia's Best Petroleum University!!!");
}
}

class SoCS extends UPES
{
void description()
{
System.out.println("The world of Computer Science!!!");
}
}

class SoDS extends UPES
{
void description()
{
System.out.println("I am the Fashion Industry!!!!");
}
}

class SoES extends UPES
{
void description()
{
System.out.println("Petroleum, Aerospace, Chemical, Civil and Mechanical!!!");
}
}

class Dispatch
{
public static void main(String[] args)
{
UPES ob = new UPES();
SoCS ob1 = new SoCS();
SoDS ob2 = new SoDS();
SoES ob3 = new SoES();
UPES ref;
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

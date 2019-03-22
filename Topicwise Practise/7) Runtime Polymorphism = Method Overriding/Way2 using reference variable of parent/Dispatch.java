class One
{
void show()
{
System.out.println("Show function of class One");
}
}
class Two extends One
{
void show()
{
System.out.println("Show function of class Two");
}
}
class Dispatch
{
public static void main(String args[])
{
One ob1 = new One();
Two ob2 = new Two();
One ref; //reference variable of the parent class only
ref = ob1;
ob1.show();
ref = ob2;
ob2.show();
}
}

//BCD!! A reference variable of Two will only be able to handle problems of two or its inherited class
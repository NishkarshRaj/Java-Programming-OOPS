interface level0
{
default void show()
{
System.out.println("Show of Parent Class");
}
}

interface level11 extends level0 //An interface EXTENDS another Interface
{
}

interface level12 extends level0
{
}

class Test implements level11,level12
{
public static void main(String args[])
{
Test obj = new Test();
obj.show();
}
}
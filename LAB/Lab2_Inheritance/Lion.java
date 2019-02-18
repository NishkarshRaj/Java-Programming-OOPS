import java.util.Scanner;
class Animals
{
Animals()
{
System.out.println("This is superclass for Animals!!! Animals are living species");
}
}




class Cat extends Animals
{
Cat()
{
System.out.println("This is cat family");
}
}


class Lion extends Cat
{
Lion()
{
System.out.println("Lion roars!!!");
}
public static void main(String[] args)
{
Lion ob = new Lion();
}
}
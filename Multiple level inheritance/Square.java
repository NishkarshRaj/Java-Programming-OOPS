import java.util.Scanner;
class Rectangle
{
float dim1,dim2;
public float area(float d1,float d2)
{
System.out.println("Area block of Rectangle Class");
return d1*d2;
}
}
class Square extends Rectangle
{
Square(float d1, float d2)
{
dim1 = d1;
dim2 = d2;
}
public float area()
{
System.out.println("Area block of Square Class");
return dim1*dim2;
}
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);
float d1,d2,a;
System.out.println("Enter two numbers you want to find area of rectangle!!!");
d1 = reader.nextFloat();
d2 = reader.nextFloat();
if(d1==d2)
{
Square ob1 = new Square(d1,d2);
a = ob1.area();
}
else
{
Rectangle ob2 = new Rectangle();
a = ob2.area(d1,d2);
}
System.out.println("Area of the shape is: " + a);
}
}

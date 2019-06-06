import java.util.Scanner;
//Abstract Class with Switch
abstract class Shape
{
double dim1,dim2;
abstract double area();
}

class Rectangle extends Shape
{
Rectangle(double a,double b)
{
dim1 = a;
dim2 = b;
}
double area()
{
return dim1*dim2;
}
}

class Triangle extends Shape
{
Triangle(double a, double b)
{
dim1 = a;
dim2 = b;
}
double area()
{
return (dim1*dim2)/2;
}
}


class Main_file
{
public static void main(String[] args)
{
int ch1;
double dim1,dim2;
Scanner reader = new Scanner(System.in);
System.out.println("Program for Area of a shape!!!!");
System.out.println("1) General Area of Shape");
System.out.println("2) Area of Rectangle");
System.out.println("3) Area of Triangle");
System.out.print("Enter your choice: ");
ch1 = reader.nextInt();
System.out.println("Enter the dimensions of the Shape: ");
System.out.print("Dimension 1: ");
dim1 = reader.nextDouble();
System.out.print("Dimension 2: ");
dim2 = reader.nextDouble();
Shape ref;
double ans;
switch(ch1)
{
case 1:
System.out.println("Area of the Shape is undefined");
break;
case 2: Rectangle ob2 = new Rectangle(dim1,dim2);
ref = ob2;
ans = ref.area();
System.out.println("Area of the Shape is: " + ans);
break;
case 3: Triangle ob3 = new Triangle(dim1,dim2);
ref = ob3;
ans = ref.area();
System.out.println("Area of the Shape is: " + ans);
break;
default: System.out.println("Invalid Input given!! No outputs found!!!");
}
}
}
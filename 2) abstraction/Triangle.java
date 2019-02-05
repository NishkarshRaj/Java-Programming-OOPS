abstract class Shape
{
abstract void draw();
}
class Rectange extends Shape
{
public void draw()
{
System.out.println("Rectangle");
}
}
class Circle extends Shape
{
public void draw()
{
System.out.println("Circle");
}
}
class Triangle extends Shape
{
public void draw()
{
System.out.println("triangle");
}
public static void main(String[] args)
{
Shape obj = new Triangle();
obj.draw();
}
}
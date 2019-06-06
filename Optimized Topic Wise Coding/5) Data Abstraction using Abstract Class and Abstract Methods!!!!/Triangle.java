abstract class Shape
{
Shape()
{
System.out.println("Generic Shape Class Constructor");
}
abstract void show_abs();
void show()
{
System.out.println("Non Abstract Show Function of the Class Shape Which can be inherited and called by the child class");
}
}
class Triangle extends Shape
{
Triangle()
{
System.out.println("Constructor of Triangle Class");
}
void show_abs()
{
System.out.println("This method overrides not overloads the abstract class method");
}
public static void main(String args[])
{
//Triangle ob = new Triangle();
Shape ob = new Triangle();
//Shape ob = new Shape();
ob.show();
ob.show_abs();
}
}



/*BCD Deep:
1) Abstract classes cannot be initiated
2) Our basics that class object is defined by the constructor call is sound!! The object does not depend on the class type specified in LHS and thus both of the first two declarations are correct
3) If a class extends an abstract class then in must override the abstract method else error will be given
*/
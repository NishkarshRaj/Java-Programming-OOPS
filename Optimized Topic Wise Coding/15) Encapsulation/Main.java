/* Encapsulation means using:
1) private data members => use getter (n for returning n values) and setter (1)(void) methods!! getter and setter methods are public
2) private member functions => call them in public methods
*/
//Here, I am also using TypeCasting !!!
class Encaps
{
private int a;
private float b;
public void SetEncaps(int a1, float b1)
{
a = a1;
b = b1;
}
public int GetInt()
{
return a;
}
public float GetFloat()
{
return b;
}
private float calc()
{
return ((float)a)*b;
}
public void show()
{
float c = calc();
System.out.println("Value of c is: " + c);
}
}



class Main
{
public static void main(String args[])
{
Encaps obj = new Encaps();
obj.SetEncaps(10,12.5f);
int a1;
float b1;
a1 = obj.GetInt();
System.out.println("Value of a is: " + a1);
b1 = obj.GetFloat();
System.out.println("Value of b is: " + b1);
obj.show();
}
}



/*BCD!!!
1) Typecasting done as (datatype)<variable>
2) BCD!!! In floating args always send data as 12.5f not 12.5 because by default they are in double and thus "error" of possible data loss is given
*/
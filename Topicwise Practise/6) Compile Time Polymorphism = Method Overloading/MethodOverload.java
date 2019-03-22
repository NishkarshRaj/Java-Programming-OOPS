/* BCD! Method overloading is using the same function name but different signatures!!! 
BCD!! Overloading is normal concept and does not need inheritance or multiple classes for implementation and thus here only one class will be used!
However! We can show using two classes that encapsulation polymorphism and inheritance go hand in hand 
Also, note that here return type does not matter and thus if function has same name and parameters but different return type does not mean it is overloaded then its overridden
Basic Need: Same function name different prototype
Different Prototype:
1) order of args change
2) number of args change
3) type of args change
BCD!!! I have a doubt!! suppose in current program! I use default parameter for c in second function and send only two args in call which one will be called??
*/


class MethodOverload
{
void function(int x, int y)
{
System.out.println("Two input function call! I add the inputs");
System.out.println(x+y);
}
void function(int x, int y, int z)
{
System.out.println("Three input function call! I multiply the inputs");
System.out.println(x*y*z);
}
public static void main(String args[])
{
MethodOverload ob = new MethodOverload();
ob.function(10,20);
ob.function(10,20,30);
}
}
//Method overriding in java
class Helloworld
{
void show()
{
System.out.println("Hello Everyone! How are you?");
}
}
class HelloFriend extends Helloworld
{
void show()
{
super.show(); //Super function calls the overridden function of the parent class
System.out.println("Hows your family my dear friend??");
}
}
class Method_Override
{
public static void main(String[] args)
{
HelloFriend obj = new HelloFriend();
obj.show(); //Local has highest priority and thus if not resolved at runtime: perform the local overriddent function
}
}
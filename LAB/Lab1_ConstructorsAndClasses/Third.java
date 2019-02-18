public class Third
{
String msg;
Third(String msg1)
{
msg = msg1;
}
public void show()
{
System.out.println(msg);
}
public static void main(String[] args)
{
Third ob = new Third("Hello World!!!");
ob.show();
}
}
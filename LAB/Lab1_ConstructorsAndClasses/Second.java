public class Second
{
string msg;
Second(String[] msg1)
{
msg = msg1;
}
public static void show()
{
System.out.println(msg);
}
public static void main(String[] args)
{
Second ob = new Second("Hello World!!!");
ob.show();
}
}
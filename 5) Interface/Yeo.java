interface Yo
{
void show();
}
class Yeo implements Yo
{
public void show() //DOUBT!! Does not work without public tag!! Why??
{
System.out.printf("First code of Interface!!");
}
public static void main(String[] args)
{
Yeo obj = new Yeo();
obj.show();
}
}
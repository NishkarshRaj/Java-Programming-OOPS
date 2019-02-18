class Upes
{
public void exp()
{
System.out.println("this class belongs to UPES");
}
}


class Devops extends Upes
{
@Override
public void exp()
{
System.out.println("this class belongs to devops");
}

public static void main(String[] args)
{
Upes obj1 = new Devops();
obj1.exp();
Upes obj2  = new Upes();
obj2.exp();

}
}
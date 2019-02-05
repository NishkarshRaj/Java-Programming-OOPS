class Cmd_Calculator
{

static int sum(int a, int b)
{
return a+b;
}

static int sub(int a, int b)
{
return a-b;
}

static int mul(int a, int b)
{
return a*b;
}

static float divide(int a, int b)
{
return (float)a/b;
}


public static void main(String[] args)
{
int sum1,sub1,mul1,a,b;
a = Integer.parseInt(args[0]);
b = Integer.parseInt(args[1]);
float divide1;
sum1 = sum(a,b);
System.out.println(sum1);
sub1 = sub(a,b);
System.out.println(sub1);
mul1 = mul(a,b);
System.out.println(mul1);
divide1 = divide(a,b);
System.out.println(divide1);
}



}
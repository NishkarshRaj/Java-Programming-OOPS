class Cmd_Calculator
{

int sum(int a, int b)
{
return a+b;
}

int sub(int a, int b)
{
return a-b;
}

int mul(int a, int b)
{
return a*b;
}

float divide(int a, int b)
{
return float(a/b);
}


public static void main(String[] args)
{
int sum1,sub1,mul1;
float divide1;
sum1 = sum(args[0],args[1]);
sub1 = sub(args[0],args[1]);
mul1 = mul(args[0],args[1]);
divide1 = divide(args[0],args[1]);
}



}
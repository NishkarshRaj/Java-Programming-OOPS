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
a = Integer.parseInt(args[0]); //Converting default argument type (string) to integers!!!!
b = Integer.parseInt(args[1]);
float divide1;
sum1 = sum(a,b);
System.out.println("Sum of the given numbers is: " + sum1); //way 1 of printing message with variable
sub1 = sub(a,b);
System.out.println("Subtraction of the given number is: %d",sub1); //way 2 of printing message with variable
mul1 = mul(a,b);
System.out.println(mul1);
divide1 = divide(a,b);
System.out.println(divide1);
}
}

//Integer class so with caps
//parseInt function similar in case like nextInt!!!
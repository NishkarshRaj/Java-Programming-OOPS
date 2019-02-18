import java.util.Scanner;
class Sum_if
{
public static void main(String[] args)
{
int sum=0,i;
for(i=41;i<250;i++)
{
if(i%5==0)
sum=sum+i;
}
System.out.println("Sum of number is: " + sum);
}
}
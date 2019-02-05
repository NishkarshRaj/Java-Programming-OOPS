import java.util.Scanner;
class Stu_Array
{
public static void main(String[] args)
{
int i;
int arr[] = new int[10];
int k;
Scanner reader = new Scanner(System.in);
for(i = 0; i < 10; i++)
{
k = i + 1;
System.out.print("Enter the " + k + " Student's Number: ");
arr[i] = reader.nextInt();
}
System.out.println("");
System.out.println("");
for(i=0;i<10;i++)
{
k=i+1;
System.out.println(k + "th Student!!!");
System.out.print("Marks Are: " + arr[i] + " =>		");
//
if((arr[i]>40)&&(arr[i]<=50))
{
System.out.println("Pass");
}
else if((arr[i]>50)&&(arr[i]<=75))
{
System.out.println("Merit");
}
else if (arr[i]>75)
{
System.out.println("Distinction");
}
else
{
System.out.println("Fail");
}
//
}
}
}
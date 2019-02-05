import java.util.Scanner;
class Square_Array
{
public static void main(String[] args)
{
int num;
Scanner reader = new Scanner(System.in);
System.out.print("Enter the length of array you want: ");
num = reader.nextInt();
int arr[] = new int[num];
int sq[] = new int[num];
int k,i,sum;
sum = 0;
for(i = 0; i < num; i++)
{
k = i + 1;
System.out.print("Enter the " + k + " Array value: ");
arr[i] = reader.nextInt();
sq[i] = arr[i]*arr[i];
sum = sum + sq[i];
}
System.out.println("Original Array and their squared numbers are: ");
for (i=0;i<num;i++) 
{
System.out.println(arr[i] + "		" + sq[i]);
}
System.out.println("Sum of squared values is: " + sum);
}
}
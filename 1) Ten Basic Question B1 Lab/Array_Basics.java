import java.util.Scanner;
class Array_Basics
{
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);
//Declaration of Array
int arr[]; //int[] arr would also work!!!
//Dynamic Memory Allocation of Array
arr = new int[10];
for(int i = 0 ; i < arr.length; i++)
{
System.out.println(arr[i]); //default int values are 0
}
}
}
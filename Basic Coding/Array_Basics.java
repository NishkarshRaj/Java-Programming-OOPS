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

//In java only Dynamic allocation of arrays
//Syntax:
//<datatype> <arrname>[];
//or
//<datatype>[] <arrname>;
//Allocate memory and specify size!!
//Syntax:
//<arrname> = new <datatype>[<size>]
//for loop
//for (i=0;i<arr.length;i++) //th!!! THE!!! Spelling of th
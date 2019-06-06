import java.io.*;
import java.util.Scanner;
class Main
{
public static void show(int arr[],int n)
{
int i;
System.out.println("\n\nYour array is");
for(i=0;i<n;i++)
{
System.out.println("Element at " + (i+1) + " position: " + arr[i]);
}
System.out.println("\n\n");
}
public static void main(String args[])
{
int n,i,ch,pos,el,flag=0,j,temp;
int arr[] = new int[100];
Scanner reader = new Scanner(System.in);
try
{
System.out.print("Enter the number of elements you want initially in the array: ");
n = reader.nextInt();
//Insertion
for(i=0;i<n;i++)
{
System.out.print("Enter the element at " + (i+1) + " position: ");
arr[i] = reader.nextInt();
}
//Show the array
System.out.println("\n\n");
show(arr,n);
//Create an option menu
System.out.println("Option Menu");
System.out.println("1) Insertion at any point");
System.out.println("2) Deletion at any point");
System.out.println("3) Searching for an element");
System.out.println("4) Sorting the array");
System.out.print("Enter your choice: ");
ch = reader.nextInt();
switch(ch)
{
case 1:
System.out.println("\n\nInsertion at any point");
System.out.print("Enter the position where you want to insert: ");
pos = reader.nextInt();
//BCD n position => n-1 index
if(pos>n) //insert at pos and insert 0's between n and pos and update n as pos
{
System.out.print("Enter element to be put at " + pos + " position: ");
arr[pos-1] = reader.nextInt();
for(i=n;i<pos-1;i++)
{
arr[i] = 0;
}
n=pos;
}
else //insert at pos -1 after shifting all at right position
{
for(i=n;i>(pos-2);i--)
{
arr[i+1]=arr[i];
}
System.out.print("Enter the element to be inserted: ");
arr[pos-1] = reader.nextInt();
n = n+1;
}
show(arr,n);
break;
case 2: System.out.println("Deletion at any point");
System.out.print("Enter the position where you want to perform deletion: ");
pos = reader.nextInt();
if(pos > n)
{
System.out.println("Deletion cannot be performed because array is not that long");
}
else if(pos == n)
{
arr[n-1] = 0;
n=n-1;
}
else
{
for(i=pos-1;i<n;i++)
{
arr[i] = arr[i+1];
}
n = n-1;
}
show(arr,n);
break;
case 3: System.out.println("Searching an element in the array using Linear Search");
System.out.print("Enter the element to be searched: ");
el = reader.nextInt();
pos = -1;
for(i=0;i<n;i++)
{
if(el == arr[i])
{
pos = i+1;
flag = 1;
break;
}
}
if(flag == 1)
{
System.out.println("Element found at position: " + pos);
}
else
{
System.out.println("Element not found in the array");
}
break;
case 4: System.out.println("Sorting the array");
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(arr[i]>arr[j])
{
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
}
show(arr,n);
break;
default: System.out.println("Wrong Choice Entered!!");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}

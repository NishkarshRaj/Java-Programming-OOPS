import java.util.*;

class Main
{
public static void main(String args[])
{
//Linked List in inbuilt package in java.util and its a template with data structure!! Try to create from scratch with multiple data types involved
//Always use string as all other types are compatible
//Index starts from 0
LinkedList<String> obj = new LinkedList<String>(); 
String s,el;
boolean status;
int n,i,choice,pos;
Scanner reader = new Scanner(System.in);
System.out.print("Enter the number of elements you want to keep in the linked list initially: ");
n = reader.nextInt();
reader.nextLine();
for(i=0;i<n;i++)
{
System.out.print("Enter the element at " + (i+1 ) + " position: ");
s = reader.nextLine();
obj.add(s);
}
System.out.println("\n\nThe Linked List is: ");
for(i=0;i<n;i++)
{
System.out.println("Element at the " + (i+1) + " position is: " + obj.get(i));
}
//System.out.println(obj);
System.out.println("\n\nOption Menu\n");
System.out.println("1) Insertion in the beginning");
System.out.println("2) Insertion at last");
System.out.println("3) Insertion at any point");
System.out.println("4) Deletion from beginning");
System.out.println("5) Deletion from last");
System.out.println("6) Deletiona at any point");
System.out.println("7) Search an element");
System.out.println("8) Get any element");
System.out.println("9) Set/Replace any element");
System.out.print("Enter your choice: ");
choice = reader.nextInt();
reader.nextLine();
System.out.println("\n\n");
switch(choice)
{
case 1: System.out.println("Insertion at Beginning");
System.out.print("Enter element to be inserted: ");
s = reader.nextLine();
obj.addFirst(s);
System.out.println("Updated Linked List is " + obj);
break;
case 2:
System.out.println("Insertion at Last");
System.out.print("Enter element to be inserted: ");
s = reader.nextLine();
obj.addLast(s);
System.out.println("Updated Linked List is " + obj);
break;
case 3:
System.out.println("Insertion at Any point");
System.out.print("Enter the position of insertion: ");
pos = reader.nextInt();
reader.nextLine();
System.out.print("Enter element to be inserted: ");
s = reader.nextLine();
obj.add(pos-1,s);
System.out.println("Updated Linked List is " + obj);
break;
case 4:
System.out.println("Deletion at beginning");
obj.removeFirst();
System.out.println("Updated Linked List is " + obj);
break;
case 5:
System.out.println("Deletion at End");
obj.removeLast();
System.out.println("Updated Linked List is " + obj);
break;
case 6:
System.out.println("Deletion at any point");
System.out.print("Enter position to remove: ");
pos = reader.nextInt();
obj.remove(pos-1);
System.out.println("Updated Linked List is " + obj);
break;
case 7:
System.out.println("Searching an element in the linked list!");
System.out.print("Enter element to be searched: ");
s = reader.nextLine();
status = obj.contains(s);
if(status)
{
System.out.println("Element exists in the Linked List");
}
else
{
System.out.println("Element does not exists in the Linked List");
}
break;
case 8: System.out.println("Searching for an element at specified position");
System.out.print("Enter the position: ");
pos = reader.nextInt();
System.out.println("Element is: " + obj.get(pos-1));
break;
case 9: System.out.println("Replacing the element using set function");
System.out.print("Enter the position to be replaced: ");
pos = reader.nextInt();
reader.nextLine();
System.out.print("Enter new element: ");
s = reader.nextLine();
obj.set(pos-1,s);
System.out.println("Updated Linked List is " + obj);
break;
default: System.out.println("Wrong choice entered!!");
}
}
}
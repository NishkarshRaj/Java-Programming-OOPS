import java.io.*; 
import java.util.*;   
class Main 
{    
    // Pushing element on the top of the stack 
    static int stack_push(Stack<Integer> stack) 
    { 
	Scanner reader = new Scanner(System.in);
	int n,i,el;
	System.out.print("Enter the number of elements you want to insert: ");
  	n = reader.nextInt();      
	for(i = 0; i < n; i++) 
        { 
	    System.out.print("Enter an element: ");
	    el = reader.nextInt();
            stack.push(el); 
        } 
	return n;
    } 
      
    // Popping element from the top of the stack 
    static void stack_pop(Stack<Integer> stack, int n) 
    { 
        System.out.println("Pop :"); 
  
        for(int i = 0; i < n; i++) 
        { 
            Integer y = (Integer) stack.pop(); 
            System.out.println(y); 
        } 
    } 
  
    // Displaying element on the top of the stack 
    static void stack_peek(Stack<Integer> stack) 
    { 
        Integer element = (Integer) stack.peek(); 
        System.out.println("Element on stack top : " + element); 
    } 
      
    // Searching element in the stack 
    static void stack_search(Stack<Integer> stack, int element) 
    { 
        Integer pos = (Integer) stack.search(element); 
  
        if(pos == -1) 
            System.out.println("Element not found"); 
        else
            System.out.println("Element is found at position " + pos); 
    } 
  
  
    public static void main (String[] args) 
    { 
        Stack<Integer> stack = new Stack<Integer>(); 
 	int n=0,choice,el,flag = 0; 
	Scanner reader = new Scanner(System.in);
do
{
System.out.println("\nOption Menu\n");
System.out.println("1) Push");
System.out.println("2) Pop");
System.out.println("3) Peek");
System.out.println("4) Search");
System.out.println("5) Exit");
System.out.print("Enter your choice: ");
choice = reader.nextInt();
switch(choice)
{
case 1: n = stack_push(stack);
break;
case 2: stack_pop(stack,n);
break;
case 3: stack_peek(stack);
break;
case 4: System.out.println("Search in Stack");
System.out.print("Enter the element to be searched: ");
el = reader.nextInt();
stack_search(stack,el);
break;
case 5:
System.exit(0);
break;
default: System.out.println("Wrong choice entered!!!");
}
}
while(flag == 0);
    } 
} 
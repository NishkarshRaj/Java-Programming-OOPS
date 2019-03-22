class Thread_Demo extends Thread
{
public void run()
{
int i;
for(i=0;i<10;i++)
{
System.out.println("Thread ID for value of i = " + i + " is: " + Thread.currentThread().getId());
}
}
}

class Main
{
public static void main(String args[])
{
//Thread_Demo obj = new Thread_Demo();
//obj.start();
Thread_Demo obj1 = new Thread_Demo();
obj1.start();
Thread_Demo obj2 = new Thread_Demo();
obj2.start();
}
}


/*BCD!!!!
1) Extends Thread class inbuilt
2) run function is always public
In general for safety in exam purpose all abstract and interface functions must be defined as public
3) Here, unlike class practise only one object and that object gives same ID again and again 
4) When two objects are called, unlike normal execution full then next
Here! Call for one value of I and then pre empt and same for other object
Also, Thread Id is constant for both of the objects
*/
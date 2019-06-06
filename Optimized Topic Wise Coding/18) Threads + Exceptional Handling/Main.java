class Thread_Demo extends Thread
{
public void run()
{
int i;
try
{
for(i=0;i<10;i++)
{
Thread.sleep(2000); //ms
System.out.println("Thread ID for value of i = " + i + " is: " + Thread.currentThread().getId());
}
}
catch(InterruptedException e)
{
System.out.println(e);
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



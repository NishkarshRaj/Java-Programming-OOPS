class MyClass extends Thread 
{
public void run()
{
for(int i=0;i<10;i++)
{
try
{
Thread.sleep(2000); //time in ms == 2s here
System.out.println(Thread.currentThread().getId() + " value: " + i);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
}



public class CurrentThreadDemo
{
public static void main(String[] args)
{
MyClass ob1 = new MyClass();
ob1.start(); 
MyClass ob2 = new MyClass();
ob2.start();
}
}

class Test implements Runnable
{
public void run()
{
System.out.println("Thread Id: " + Thread.currentThread().getId());
}
}

class Main
{
public static void main(String args[])
{
Thread obj = new Thread(new Test());
obj.start();
}
}
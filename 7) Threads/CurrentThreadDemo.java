class MyClass extends Thread //Thread!!!! Class not defined!!!!!!
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(Thread.currentThread().getId() + " value: " + i);
}
}
}


public class CurrentThreadDemo
{
public static void main(String[] args)
{
MyClass ob1 = new MyClass();
ob1.start(); //start function not defined!!!! //Run method not called!!!!! 
MyClass ob2 = new MyClass();
ob2.start();
}
}

//Run Method initializes the Thread inbuilt function here modified
//Start method is inbuilt method that calls the run method
//Thread is a path!!! it is the path between run and start!!!
//static and dynamic functions!!!!
//run and start are keywords!!! their name cannot be changed!!!
//run method is overridden at the run time when start function is called!!!!
//run method is written in thread class (as static function=>it cannot be changed!!! only when inherited!!!) and modified in the MyClass child class!!!

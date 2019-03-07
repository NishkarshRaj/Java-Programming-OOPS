abstract class Bike
{
abstract void run(); //in abstract class and interface we only declare the data members and member functions and dont define them
}
class Honda extends Bike //extends keyword for inheritance
{
void run()
{
System.out.println("Running Successfully");
}
public static void main(String[] args)
{
Bike ob = new Honda(); //Object of abstract class but constructor of child class
ob.run();
}
}


//BCD!!! A java file is saved with the name of the class {classname always caps} that contains the main function!!!
//BCD!!! A java file compilation creates n class files for all n classes written in the code!!
//BCD!!! only class file with main is executable
//BCD!!! main is always void{returns nothing}, public{for user execuatble} and static{cannot change its def}
//BCD!!! main arguments: String[] args or String args[] is for command line arguments
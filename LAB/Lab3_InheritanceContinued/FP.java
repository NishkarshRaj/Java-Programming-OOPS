//Parent Fighter Plane Class


import java.util.Scanner;
class FighterPlane
{
String guns;
String missile;
public void fly()
{
System.out.println("Taking off!!! Bless me!!");
}
public void fight()
{
System.out.println("Lets go!! Enemies Spotted!!! I am going to fight!!! Dropping missiles");
}
public void sonar()
{
System.out.println("Checking for SONAR signals!! All Clear!!! IGI");
}
public void radar()
{
System.out.println("Radar System on!! Checking for enemies");
}
public void number()
{
System.out.println("Two people can fly in one MIG");
}
public void won()
{
System.out.println("We Won!!! Yeoooooo!!!!");
}
public void setFP(String g,String m)
{
guns = g;
missile = m;
}
public String getgun()
{
return guns;
}
public String getmissile()
{
return missile;
}
public void firing()
{
System.out.println("The Guns Are firing!!!! Rechecking the Aim!!!");
}
public void fire()
{
System.out.println("Target Acquired!!! The Guns are fired Watching them!!");
}
public void check()
{
System.out.println("Check for fuel!! All good");
System.out.println("Check for propellor!! All good!!");
System.out.println("Give permission to fly!!!");
}
public void attack()
{
System.out.println("Enemies attacked!!! Pushing further");
}
}
class Pilot extends FighterPlane
{
Pilot()
{
System.out.println("Hello!! I am The Pilot!!! I am flying the plane");
}
}
class CoPilot extends FighterPlane
{
CoPilot()
{
System.out.println("Hello! I am the CoPilot!! I am communicating with base station");
}
}
class FP
{
public static void main(String[] args)
{
Pilot ob1 = new Pilot();
CoPilot ob2 = new CoPilot();
ob1.number();
System.out.println("");
System.out.println("");
System.out.println("");
int choice1,ch2;
System.out.println("How to approach attack??");
System.out.println("1) Air Fight");
System.out.println("2) Ground Fight");
System.out.println("3) Water Fight");
Scanner reader = new Scanner(System.in);
choice1 = reader.nextInt();
switch(choice1)
{
case 1: System.out.println("Air Attack Activated!!");
ob1.setFP("AK 57","Grenades");
System.out.println("The gun used is: " + ob1.getgun());
System.out.println("The missile used is: " + ob1.getmissile());
System.out.println("");
ob1.check();
System.out.println("Press 1 to give permission");
ch2 = reader.nextInt();
ob1.fly();
System.out.println("");
ob1.radar();
System.out.println("");
ob1.sonar();
System.out.println("");
ob1.fight();
ob1.firing();
ob1.fire();
ob1.attack();
System.out.println("");
System.out.println("");
ob1.won();
break;

case 2: System.out.println("Ground Attack Activated!!!");
ob1.setFP("Machine Gun LT","Avionic 1");
System.out.println("The gun used is: " + ob1.getgun());
System.out.println("The missile used is: " + ob1.getmissile());

System.out.println("");
ob1.check();

System.out.println("Press 1 to give permission");
ch2 = reader.nextInt();
ob1.fly();
System.out.println("");
ob1.radar();
System.out.println("");
ob1.sonar();
System.out.println("");
ob1.fight();
ob1.firing();
ob1.fire();
ob1.attack();
System.out.println("");
System.out.println("");
ob1.won();
break;
case 3: System.out.println("Water Attack Activated!!!");
ob1.setFP("Machine Gun","Torpedo");
System.out.println("The gun used is: " + ob1.getgun());
System.out.println("The missile used is: " + ob1.getmissile());

System.out.println("");
ob1.check();

System.out.println("Press 1 to give permission");
ch2 = reader.nextInt();
ob1.fly();

System.out.println("");
ob1.radar();
System.out.println("");
ob1.sonar();
System.out.println("");
ob1.fight();
ob1.firing();
ob1.fire();
ob1.attack();
System.out.println("");
System.out.println("");
ob1.won();
break;
default: System.out.println("Invalid Input!! Coming Back! Mission Aborted!!!");
}
}
}



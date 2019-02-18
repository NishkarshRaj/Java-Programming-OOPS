import java.util.Scanner;

//School of Computer Science
class SCS 
{
private String facultyname;
private float salary;

//getter and setter methods
public void setSCSvalues(String f,float s)
{
salary = s;
facultyname = f;
}

public float getSCSsalary()
{
return salary;
}

public String getSCSfacultyname()
{
return facultyname;
}

}

//Department of Cybernetics
class Cybernetics extends SCS
{
Cybernetics()
{
System.out.println("This is Cybernetics department for DevOps, OSS and BAO");
}
}


//Department of Systematics
class Systematics extends SCS
{
Systematics()
{
System.out.println("This is the department for BFSI, Mainframe etc.");
}
}


//Department of Analytics
class Analytics extends SCS
{
Analytics()
{
System.out.println("This is the department for Big Data");
}
}


class Admin
{
public static void main(String[] args)
{

Cybernetics ob1 = new Cybernetics();
ob1.setSCSvalues("Nishkarsh",45);
System.out.println("The Name of the faculty is: " + ob1.getSCSfacultyname());
System.out.println("The Salary of the faculty is: " + ob1.getSCSsalary());

Analytics ob2 = new Analytics();
ob2.setSCSvalues("Nishkarsh Raj",450);
System.out.println("The Name of the faculty is: " + ob2.getSCSfacultyname());
System.out.println("The Salary of the faculty is: " + ob2.getSCSsalary());

Systematics ob3 = new Systematics();
ob3.setSCSvalues("Nishkarsh Raj Khare",45);
System.out.println("The Name of the faculty is: " + ob3.getSCSfacultyname());
System.out.println("The Salary of the faculty is: " + ob3.getSCSsalary());

}
}

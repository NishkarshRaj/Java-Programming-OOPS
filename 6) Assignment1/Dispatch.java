Skip to content
 
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 @NishkarshRaj Sign out
0
0 0 NishkarshRaj/OOPS_Java
 Code  Issues 0  Pull requests 0  Projects 0  Wiki  Insights  Settings
OOPS_Java/6) Assignment1/Dispatch.java
6c5f6a9  an hour ago
@NishkarshRaj NishkarshRaj assignment 1
     
53 lines (48 sloc)  759 Bytes
//Dynamic Method Dispatch!!!!
class UPES
{
void description()
{
System.out.println("I am Asia's Best Petroleum University!!!");
}
}

class SoCS extends UPES
{
void description()
{
System.out.println("The world of Computer Science!!!");
}
}

class SoDS extends UPES
{
void description()
{
System.out.println("I am the Fashion Industry!!!!");
}
}

class SoES extends UPES
{
void description()
{
System.out.println("Petroleum, Aerospace, Chemical, Civil and Mechanical!!!");
}
}

class Dispatch
{
public static void main(String[] args)
{
UPES ob = new UPES();
SoCS ob1 = new SoCS();
SoDS ob2 = new SoDS();
SoES ob3 = new SoES();
UPES ref;
ref = ob;
ref.description();
ref = ob1;
ref.description();
ref = ob2;
ref.description();
ref = ob3;
ref.description();
}
}
© 2019 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
Press h to open a hovercard with more details.
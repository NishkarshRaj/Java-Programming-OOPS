import java.util.Scanner;
class Main_Server
{
String name = "Generic Bank";
double Bank_balance = 1000000;
public void credit(double amount) //credit what comes in!!! user deposits
{
Bank_balance = Bank_balance + amount;
}
public void debit(double amount) //debit what goes out!!! user withdraws
{
Bank_balance = Bank_balance - amount;
}
public double getbalance()
{
return Bank_balance;
}
}


class Account_Holder extends Main_Server
{
String name1;
int account_number;
int card_number;
double balance;
private int CVV; 
private int PIN;
public void setAccount_Holder(String n, int an, int cn, double bal, int c, int p)
{
name1 = n;
account_number = an;
card_number = cn;
balance = bal;
CVV = c;
PIN = p;
}
public double Deposit(double amount)
{
balance = balance + amount;
System.out.print("Deposit Successful");
credit(balance);
return balance;
}
public double Withdraw(double amount)
{
double bbalance = getbalance(); 
if (bbalance > amount)
	{
	if (balance > amount)
		{
		balance = balance - amount;
		debit(balance);
		System.out.println("The withdraw is successful");
		return balance;
		}
	else
		{
		return 2; //failed due to less user fund
		}
	}
else
{
return 0; // failed transaction due to less bank fund
}
}
public double balancecheck()
{
return balance;
}

}



class Employee
{
String name;
int SSN;
double salary;
String password = "B@nk!ng";
public void SetEmployee(String n, int s, double sal)
{
name = n;
SSN = s;
salary = sal;
}
public String Getname()
{
return name;
}
public int GetSSN()
{
return SSN;
}
public double Getsalary()
{
return salary;
}
}


class Account_Management
{

public static void user()
{
System.out.println("Welcome to the User Account!!! Please Sign Up to Continue"); //File Management to store permanently!!!
String name;
double balance;
int Pin, CVV, account_number, card_number;
Scanner r = new Scanner(System.in);
System.out.println("Enter your full name: ");
name = r.nextLine();
System.out.print("Enter your initial amount to deposit: ");
balance = r.nextDouble();
System.out.print("Enter your PIN: ");
Pin = r.nextInt();
System.out.print("Enter your CVV: ");
CVV = r.nextInt();
System.out.print("Enter your Account Number: ");
account_number = r.nextInt();
System.out.print("Enter your Card Number: ");
card_number = r.nextInt();
//creating account
Account_Holder user1 = new Account_Holder();
user1.setAccount_Holder(name, account_number, card_number, balance, CVV, Pin);
System.out.println("");
double ballu;
ballu = user1.balancecheck();
if (ballu == 0 )
{
System.out.println("You have no balance!! Account restricted!!");
}
else
{
System.out.println("Option Menu for the User");
System.out.println("1) Check Balance");
System.out.println("2) Deposit Amount");
System.out.println("3) Withdraw Amount");
System.out.print("Enter your choice: ");
int ch1;
double amt;
ch1 = r.nextInt();
switch(ch1)
{
case 1: ballu = user1.balancecheck();
System.out.println("The Balance in the account is: " + ballu);
break;
case 2: System.out.println("Deposit Amount");
System.out.print("Enter the amount to be deposited: ");
amt = r.nextDouble();
ballu = user1.Deposit(amt);
System.out.println("The new balance in the account is " + ballu);
break;
case 3: System.out.println("Withdraw Amount");
amt = r.nextDouble();
ballu = user1.Withdraw(amt);
if (ballu == 0)
{
System.out.println("Transaction failed because bank has less amount than needed");
}
else if (ballu == 2)
{
System.out.println("Transaction failed because your account has less amount than needed");
}
else 
{
System.out.println("The new balance after withdraw is: " + ballu);
}
break;
default: System.out.println("Wrong Choice!! Exiting code!!!");
}
}
}

public static void employee()
{
System.out.print("Hello Employee page!!!");
}





public static void main(String[] args)
{
System.out.println("Welcome to Generic Banking System");
System.out.println("Login Page");
System.out.println("1) Login as User");
System.out.println("2) Login as Employee");
int ch;
System.out.print("Enter your choice: ");
Scanner reader = new Scanner(System.in);
ch = reader.nextInt();
switch(ch)
{
case 1: user();
break;
case 2: employee();
break;
default: System.out.println("Wrong Choice Entered!!! Exiting the System!!!"); //how to resend to the login page!!!
}
}
}
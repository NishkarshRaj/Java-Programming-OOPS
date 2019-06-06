import java.util.Scanner;
class Combination
{
public static void main(String[] args)
{
int a,b,c,i,k;
Scanner reader = new Scanner(System.in);
System.out.println("Enter three numbers: ");
a = reader.nextInt();
b = reader.nextInt();
c = reader.nextInt();
System.out.println("Printing all the 6 combinations of the Three input numbers");
for(i=1;i<=6;i++)
{
switch(i)
{
case 1: k = a*100+b*10+c;
	System.out.println("Combination 1) " + k);
	break;
case 2: k = a*100+c*10+b;
	System.out.println("Combination 2) " + k);
	break;
case 3: k = b*100+a*10+c;
	System.out.println("Combination 3) " + k);
	break;
case 4: k = b*100+c*10+a;
	System.out.println("Combination 4) " + k);
	break;
case 5: k = c*100+b*10+a;
	System.out.println("Combination 5) " + k);
	break;
case 6: k = c*100+a*10+b;
	System.out.println("Combination 6) " + k);
	break;
default: System.out.println("Wrong Combination: ");
}
}
}
}
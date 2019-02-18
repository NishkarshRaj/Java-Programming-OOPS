import java.util.Scanner;
class Question
{
int function1(int x)
{
if (x == 1)
{
return 1;
}
else
{
return 0;
}
}
int function2(int x)
{
if (x == 3)
{
return 1;
}
else
{
return 0;
}
}
}




class Answer extends Question
{
	public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	Answer ob = new Answer();
	int i,ans1,ans2,flag = 0;
	for (i = 0 ; i <3 ; i++)
		{
		System.out.println("Ques: What is 1050 - 1040?");
		System.out.println("Options are:");
		System.out.println("1) 10");
		System.out.println("2) 20");
		System.out.println("3) 30");
		System.out.println("4) 40");
		System.out.println("Enter your answer: ");
		ans1 = reader.nextInt();
		flag = ob.function1(ans1);
		if (flag == 1)
			{
			System.out.println("You are Successful");
				break;
			}
		else
			{
			System.out.println("Wrong Answer!! Retry");
			}
		}
	if(flag == 1 )
	{
		System.out.println("Question 2:");
		for (i = 0 ; i <3 ; i++)
		{
		System.out.println("Ques: Who is Founder of Microsoft Inc.?");
		System.out.println("Options are:");
		System.out.println("1) Shubham Bansal");
		System.out.println("2) Jeff Bezos");
		System.out.println("3) Bill Gates");
		System.out.println("4) Rishabh Singh");
		System.out.println("Enter your answer: ");
		ans2 = reader.nextInt();
		flag = ob.function2(ans2);
		if (flag == 1)
			{
			System.out.println("You are Successful");
				break;
			}
		else
			{
			System.out.println("Wrong Answer!! Retry");
			}
		}

if (flag == 1)
{
System.out.println("Excellent!! 2 out of 2 question correct");
}
else
{
System.out.println("Limit Exceeded!! Well done!! 1 out of 2 correct");
}





	
	}
	else
	{
		System.out.println("Retry Limit exceeded!!! you fail!!! 0 out of 2 correct");
	}
}
}
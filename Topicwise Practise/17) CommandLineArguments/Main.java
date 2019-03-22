class Main
{
public static void main(String args[])
{
int i;
int l = args.length; //Keyword not a function unlike sizeof()
for(i = 0; i < l; i++)
{
System.out.println((i+1) + " Command Line Arguments is: " + args[i]);
}
}
}

/* Unlike c and cpp here the first arg[0] is not filename because filename == class name with main so command line args start from 0 */
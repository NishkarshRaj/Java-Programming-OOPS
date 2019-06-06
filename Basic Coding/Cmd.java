class Cmd
{
public static void main(String[] args)
{
int i;
for (i=0 ; i < args.length ; i++) //args.length specify number of command line arguments
{
System.out.println(args[i]);
}
}
}

//Here!!! args[0] is not file name
//all args are from 0 to length - 1
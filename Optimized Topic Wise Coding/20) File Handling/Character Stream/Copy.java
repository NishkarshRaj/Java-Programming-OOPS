import java.io.*; //contains all classes and streams related to file handling
import java.util.*; //includes IO exception
// Character means 16 bits... selects 2 bytes at a time
// contains two classes... 
// FileReader for input from source to program (Uses FileInputStream twice)
// FileWriter for writing from program to destination I/O (Uses FileOutputStream twice)

class Copy
{
public static void main(String args[])
{
//Do entire file handling work in the exceptional handling environment
//Declare null global objects because if declared in TRY BLOCK not accessible in FINALLY BLOCk
FileReader inobj = null;
FileWriter outobj = null;
try
{
//For same directory else specify absolute path.. or better take it as input from user
inobj = new FileReader("Input.txt"); 
outobj = new FileWriter("Output.txt");
int c;
while((c = inobj.read()) != (-1)) //read function returns integer flag that becomes -1 for EOF
{
outobj.write(c);
}
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
try
{
if(inobj!=null)
{
inobj.close();
}
if(outobj!=null)
{
outobj.close();
}
}
catch(IOException e)
{
System.out.println(e);
}
}
}
}




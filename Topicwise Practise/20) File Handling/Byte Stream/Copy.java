import java.io.*; //contains all classes and streams related to file handling
import java.util.*; //includes IO exception
// Byte means 8 bits... selects 1 byte at a time
// contains two classes... 
// FileInputStream for input from source to program
// FileOutputStream for writing from program to destination I/O

class Copy
{
public static void main(String args[])
{
//Do entire file handling work in the exceptional handling environment
//Declare null global objects because if declared in TRY BLOCK not accessible in FINALLY BLOCk
FileInputStream inobj = null;
FileOutputStream outobj = null;
try
{
//For same directory else specify absolute path.. or better take it as input from user
inobj = new FileInputStream("C:/input.txt"); 
outobj = new FileOutputStream("output.txt");
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




import java.io.File;
public class sample
{
public static void main(String args[])
{
File obj = new File("");
obj.mkdir();
//obj.delete();
boolean b = obj.exists();
if(b == true)
{
System.out.println("Folder exists");
}
else
{
System.out.println("Folder does not exists");
}
}
}
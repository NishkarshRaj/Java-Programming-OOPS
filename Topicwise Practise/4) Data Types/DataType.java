class DataType
{
public static void main(String args[])
{
byte byte1;
//System.out.println("Default value for byte1: " + byte1);
byte1 = 10;
System.out.println("Byte 1: " + byte1);
short short1;
//System.out.println("Default value for short :" + short1);
short1 = 10;
System.out.println("Short: " + short1);
int int1;
//System.out.println("Default value for int: " + int1);
int1 = 10;
System.out.println("Integer: " + int1);
int1 = 010; //octal
System.out.println("Integer in Octal: " + int1);
int1 = 0x10; //hex
System.out.println("Integer in Hexadecimal: " + int1);
int1 = 0b10; //binary after 1.7
System.out.println("Integer in Binary: " + int1);
int1 = 1___0; //underscore after 1.7 but cannot use at end and start
System.out.println("Integer with underscore: " + int1);
char char1;
//System.out.println("Default char: " + char1);
char1 = 'a';
System.out.println("Character: " + char1); 
char1 = '\''; //printing single comma
System.out.println("Character with apostrophe: " + char1);
char1 = '\\'; //priting backslash
System.out.println("Character with backslash: " + char1);
char1 = '\"'; //printing double comma
System.out.println("Character with Double apostrophe: " + char1);
char1 = 65; //int
System.out.println("Character with integer input: " + char1);
char1 = 0x43; //hex
System.out.println("Character with hex input: " + char1);
long long1;
//System.out.println("Default Long: " + long1);
long1 = 1000000L; //numbers end with l or L
System.out.println("Long: " + long1);
float float1;
//System.out.println("Default Float: " + float1);
float1 = 10000.0522f; //numbers ends with f or F
System.out.println("Float: " + float1);
double double1;
//System.out.println("Default double: " + double1);
double1 = 10000.0522; //may end with d or D but they are default for decimal
System.out.println("Double: " + double1);
boolean boolean1;
//System.out.println("Default boolean: " + boolean1);
boolean1 = true; //only true and false allowed
System.out.println("Boolean: " + boolean1);
}
}


//BCD!! Default values are not allowed!! Cannot print variables without initialization!!!
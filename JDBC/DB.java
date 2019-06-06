import java.sql.*; //1) import package after adding jdbc jar
//import oracle.jdbc.*;
class DB
{
public static void main(String args[])
{
try //2) always work in try block for exceptions
		{
		Class.forName("oracle.jdbc.driver.OracleDriver"); //3) initialize driver
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","12345678"); //4) Create connection object
		Statement st = con.createStatement(); //5) Create statement object
		String sql = "select * from courses";
		ResultSet rs = st.executeQuery(sql); //6) Create result set object to invoke the select statement result
		while(rs.next())
		{
		System.out.println(rs.getString(1) + " "  + rs.getString(2));
		}
		con.close(); //7) Close the connection object
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
}
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect {

	public void getCircle(String id)
	{
		try
		{
		String driver="org.apache.derby.jdbc.ClientDriver";
		Class.forName(driver);
		Connection connect=null;
		String HostString="jdbc:derby://localhost:1527/springSampleDB";
		connect=DriverManager.getConnection(HostString);
		Statement stmt=null;
		stmt=connect.createStatement();
		String Query="select * from circles where id = '"+id+"'";
		ResultSet rs=null;
		rs=stmt.executeQuery(Query);
		if(rs.next())
		{   //int id1= rs.getInt("id");
			String value=rs.getString("name");
			System.out.println("name value"+ value);
			//System.out.println("id value"+ id);
		}
		rs.close();
		connect.close();
		stmt.close();
		
		}
		catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		finally
		{
		System.out.println("exiting DBConnect");	
			
		}
	}
}

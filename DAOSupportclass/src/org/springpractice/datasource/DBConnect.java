package org.springpractice.datasource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DBConnect {
    
	public DataSource getDataSource() {
		return DataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		DataSource = dataSource;
	}
	DataSource DataSource;
/*interface that implements bean class mentioned in the xml to configure url,
and driver class*/
	/*public void getCircle(String id)
	{
		try
		{
		Connection connect=null;
		
		connect=DataSource.getConnection();
//Datasource has cthe url already configured in the xml,unlike DriverManager
		 
		
		String driver="org.apache.derby.jdbc.ClientDriver";
		Class.forName(driver);
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
	*/
	JdbcTemplate jd=new JdbcTemplate();
	
	public int getCount()
	{
		String sql="select count(*) from circles";
		jd.setDataSource(getDataSource());
		return jd.queryForInt(sql);
		
	}
}


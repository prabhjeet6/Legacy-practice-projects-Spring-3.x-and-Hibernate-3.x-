package org.springpractice.datasource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	
	JdbcTemplate jd=new JdbcTemplate();
	
	public int getCount()
	{
		String sql="select count(*) from circles";
		jd.setDataSource(getDataSource());//takes the Datasource configuration to create Prepared Statement
		return jd.queryForInt(sql);
	}
	
	public String getName(int id)
	{
		/*String sql="select name from circles where id='"+id+"' ";
		jd.setDataSource(getDataSource());
		return jd.queryForObject(sql, String.class);*/  //for predefined object
		
		//first way
		
		String sql="select name from circles where id=? ";
		jd.setDataSource(getDataSource());
		return jd.queryForObject(sql, new Object[]{id},String.class);//for predefined object
		//second way
	}
	public circle getCircle(int id)
	{
		String sql="select * from circle where id= ?";
		jd.setDataSource(getDataSource());
		return jd.queryForObject(sql,  new Object[]{id}, new CircleMapper());
	}
	
	public List<circle> getAllCircle()
	{
		String sql="select * from circle";
		jd.setDataSource(getDataSource());
		return jd.query(sql,   new CircleMapper());
	}
	
	
	public static class CircleMapper implements RowMapper<circle>
	{

		@Override
		public circle mapRow(ResultSet rs, int RowNumber) throws SQLException {
			circle ccl=new circle();
			ccl.setId(rs.getInt("Id"));
			ccl.setName(rs.getString("Name"));
			return ccl;
		}
		/*
		first jdbc template takes the connection config via Datasource, then it tries to run the sql query,creates a prepared statement for 
		primitives, and java defined classes to execute them directly, but in case a query returns a row to map to object, then we have to use
		RowMapper, as, the output of the query in that case can not be mapped direcly to a method.
		In methods like query() and queryforObject() while trying to execute query, we get resultset but the mapping is done via rowmapper whoes object 
		is passed while executing the query*/
	}
}


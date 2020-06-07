package org.springpractice.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class DBConnect  extends JdbcDaoSupport{

	/*public DataSource getDataSource() {
		return DataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		DataSource = dataSource;
	}

	DataSource DataSource;
	
	 * interface that implements bean class mentioned in the xml to configure
	 * url, and driver class
	 
		JdbcTemplate jd = new JdbcTemplate();
*/
	public int getCount() {
		String sql = "select count(*) from circles";
		this.getJdbcTemplate().setDataSource(getDataSource());
		return this.getJdbcTemplate(). queryForInt(sql);

	}
}

package com.pattern.pooling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class for the pool of JDBC connection
 * @author rohit
 *
 */
public class JDBCConnectionPool extends ObjectPool<Connection> {

	private String dsn;
	private String userName;
	private String password;
	
	private JDBCConnectionPool(int size) {
		super(size);
	}

	public JDBCConnectionPool(int size, String driver, String dsn, String usr,
			String pwd) {
		this(size);
		try {
			Class.forName(driver).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.dsn = dsn;
		this.password = usr;
		this.password = pwd;
	}

	@Override
	protected Connection create() {
		try {
			return (DriverManager.getConnection(dsn, userName, password));
		} catch (SQLException e) {
			e.printStackTrace();
			return (null);
		}
	}
}

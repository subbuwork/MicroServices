package com.java.db.connection.utils.service;

import java.sql.Connection;

public interface ConnectionService {
	public Connection getDBConnection(String db_name);
	public void closeConnection(Connection connection);

}

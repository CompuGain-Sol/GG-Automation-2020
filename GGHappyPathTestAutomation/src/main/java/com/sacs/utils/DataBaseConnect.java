package com.sacs.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnect {

	public Connection Connect()
	   throws ClassNotFoundException, SQLException {
	    //Class.forName("oracle.jdbc.driver.OracleDriver");
	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    Connection conn = null;
	    //jdbc:sqlserver://HOSP_SQL1.company.com;user=name;password=abcdefg;database=Test
	    	//String url = "jdbc:sqlserver://10.230.32.214/SACSQASERVER2K12";
	 //   	conn = DriverManager.getConnection(url,"SacsReader","Test@123");
			conn = DriverManager.getConnection("jdbc:sqlserver://10.230.32.214/SACSQASERVER2K12;database=Sacs_NG;user=SacsReader;password=Test@123");
	    return conn;
	}

	public String [][] Statement(Connection conn, String SQLStatement) 
	   throws ClassNotFoundException, SQLException {
		String [][] DBResults;
	    conn.setAutoCommit(false);
	    Statement stmt = conn.createStatement();
	    System.out.println (SQLStatement);
	    ResultSet rset = stmt.executeQuery(SQLStatement);

	    ResultSetMetaData rsmd = rset.getMetaData();
	    int numberOfColumns = rsmd.getColumnCount();
	    
	    int numberOfRows = 0;
	    while (rset.next()) {
	    	numberOfRows++;
	    }
	    	
		DBResults = new String [numberOfRows][numberOfColumns];
	    	System.out.println ("numberOfRows    = " + numberOfRows);
	    	System.out.println ("numberOfColumns = " + numberOfColumns);
	    rset = stmt.executeQuery(SQLStatement);

		int index=0;
	    if (rset.next()) {  
	    	do {
	    		for (int col = 1; col <= numberOfColumns; col++) {
		    		DBResults[index][col-1] = rset.getString(col);
		    		System.out.println ("DBResults[" + index + "][" + col + "-1] = " + DBResults[index][col-1]);
	    		}
	    		index++;
	    		System.out.println ("DBResult index++ = " + index);
	    	} while (rset.next());   
	    } else {   
    		System.out.println ("No rows found for statement " + SQLStatement);   
	    }  

	    stmt.close();
	    return DBResults;
	}
	
	public void CloseConnection(Connection conn) throws ClassNotFoundException, SQLException {
			conn.close();
	}
	
}

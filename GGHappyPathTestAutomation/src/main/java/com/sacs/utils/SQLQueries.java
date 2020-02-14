package com.sacs.utils;

import java.sql.Connection;

public class SQLQueries {

	public String Get_ACVersion_From_DB() throws Exception{
	
	DataBaseConnect DBQA = new DataBaseConnect();
	Connection QAconn = DBQA.Connect();
	String SQLStatement = "Select ACVersion from dbo.AircraftVersion where UnitId=17 and Description='VN A330-200'";
	System.out.println ("SQL=" + SQLStatement);
	String [][] DBQAResults = DBQA.Statement(QAconn, SQLStatement);
	System.out.println ("Number of Rows in SQL Query Output" + DBQAResults.length);
	String ACVersion = null;
	if (DBQAResults.length != 0 && DBQAResults[0].length !=0) 
		{
		// get the strings from the array into readable names
		System.out.println ("ACVersion Order=" + DBQAResults[0][0]);
		//System.out.println ("Data = " + DBQAResults[0][1])
		ACVersion = DBQAResults[0][0];
		}else{
		System.out.println ("ERROR - DBQAResults length =" + DBQAResults.length + " NO DATA FOUND");
		}
		DBQA.CloseConnection(QAconn);
		return ACVersion;
	}
}


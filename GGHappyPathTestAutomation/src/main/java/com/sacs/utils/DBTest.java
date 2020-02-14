package com.sacs.utils;

public class DBTest extends SQLQueries {

	static String ACVersion=null;

	
	
	public static void main(String [] args) throws Exception
	{
		SQLQueries sq = new SQLQueries();
		ACVersion=sq.Get_ACVersion_From_DB();
		System.out.println("AC Version From DB IS: "+ACVersion);
		
	}
}

package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
/**
 * 
 * @author Ryan Urquhart
 *
 *group of static methods that are used in the application
 */
public class StaticFunctions {
	
	
	
	/**---------------------------------------------------------------------
	 * checks the login information 
	 * 
	 * @param name		server username
	 * @param password	server password
	 * @return returns returns 1 if login information is correct else 0
	 */
	public static int login(String name,String password){
		String temp[] ={"",""};
		String temp1[] = {};
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fakepeople",name,password);
		}
		catch (Exception exc){
			temp1 = new String[]{"",""};
		}
		if (Arrays.equals(temp1,temp)){
			return 0;
		}
		else{
			return 1;
		}
		
	}//------------------------------
}

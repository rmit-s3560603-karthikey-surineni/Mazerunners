package mazerunners;

import java.util.*;

public class Game {

	private int isValidPlayer;
	private int isAdmin;
	
	public static void checkPlayer(String user_Name,String password){
	
		/*Check or query database to check whether the user name / password
		 *exists
		 */
}
	
	public static void login(String user_name,String password){
	
		
	}
	
	public static void main(String[] args){
	
String usr_name, password;
		
		Scanner console = new Scanner(System.in);
		
		System.out.prntln("Enter your user name :");
		
		usr_name=console.nextLine();
	
		System.out.prntln("Enter your password :");
		
		password=console.nextLine();
		
		//Checking if user name and password are valid
		checkPlayer(usr_name,password);
		
		
		
		
}

}
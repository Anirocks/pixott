package com.revature.pixott.handler;

import java.sql.SQLException;

import com.revature.pixott.app.App;

public class MainMenuHandler {
	public static void display () {
		System.out.println("PIX OTT APP");
		System.out.println("=============");
		System.out.println("1==>>>>  Signup");
		System.out.println("2==>>>>  Login");
		System.out.println("3==>>>>  Exit");
		System.out.println("=============");
		int ops = App.scanner.nextInt();
		if (ops == 1) {
			Signuphandler.displayresult();
		}
		else if(ops==2) {
			Loginhandler.users();
			
		}
		else if(ops>3) {
			System.out.println("Error:Enter the Correct code");
		}
		else {
			System.out.println("Thank you for using the app");
		}
		}
	}


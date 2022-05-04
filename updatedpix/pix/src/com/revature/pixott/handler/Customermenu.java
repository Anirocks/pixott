package com.revature.pixott.handler;

import java.sql.SQLException;

import com.revature.pixott.Customeraccess.DisplayTop5;
import com.revature.pixott.Dao.Watchlistdao;
import com.revature.pixott.Dao.historydao;
import com.revature.pixott.Dao.wishlist;
import com.revature.pixott.app.App;
import com.revature.pixott.Dao.wishlist;

public class Customermenu {
	public static void menu()  {
		System.out.println("Menu");
		System.out.println("====");
		System.out.println("1) View Top 5 Movies");
		System.out.println("2) Search Movies");
		System.out.println("3) Your Wish List");
		System.out.println("4) View History");
		System.out.println("5) Logout");
		int options = App.scanner.nextInt();
		if(options==1) {
			DisplayTop5.Displaymovies();
		}
		else if(options==2) {
			try {
				Searchmoviehandler.searchmovie();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(options==3) {
			int a=Loginhandler.idofusername;
			wishlist.wish(a);
			Customermenu.menu();
		}
		else if(options==4) {
			int b=Loginhandler.idofusername;
			historydao.ans(b);
			Customermenu.menu();
			
		}
		else if(options==5) {
			System.out.println("Logged out Succesfully");
			System.out.println("======================");
			MainMenuHandler.display();
			
		}
		else {
			System.out.println("Invalid Selection");
			System.out.println("==================");
			Customermenu.menu();
		}
	}

}

package com.revature.pixott.Dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.pixott.Model.admintopmodel;
import com.revature.pixott.handler.Adminhandler;

public class Admintop5insertdao {
	public static void Displaymovies()  {
		Admintop5dao dao = new Admintop5dao();
		List<admintopmodel> res = dao.Top();
		System.out.println("movie");
		System.out.println();
		res.forEach(System.out::println);
		System.out.println();
		//Adminremovedao.remove();
		Adminhandler.remove();
		
	}

}

package com.seleniumexpress.foodcart;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String[] foodItems= {"Biriyani","Pizza", "Chicken Lolypop", "Mashala Tikia", "Fruit Salat"};
		List<Food> foodItems;
		try {
			foodItems = FoodCartDbUtil.getFoodList();
			request.setAttribute("foodItems", foodItems);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("show-food.jsp");
		dispatcher.forward(request, response);
	}

}

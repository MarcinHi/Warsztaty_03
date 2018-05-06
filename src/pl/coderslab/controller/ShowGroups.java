package pl.coderslab.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.coderslab.db.UserGroupDao;
import pl.coderslab.model.UserGroup;

@WebServlet("/users-group")
public class ShowGroups extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<UserGroup> groups = new ArrayList<>();
		groups = UserGroupDao.loadAll();
		
		request.setAttribute("groups", groups);
		getServletContext().getRequestDispatcher("/WEB-INF/showUserGroups.jsp").forward(request, response);
	}
}

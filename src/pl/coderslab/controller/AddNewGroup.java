package pl.coderslab.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.coderslab.db.DbUtil;

@WebServlet("/addNewGroup")
public class AddNewGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/addNewGroup.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try (Connection conn = DbUtil.getConn()) {
			String sql = "INSERT INTO user_group(name) VALUES(?);";
			String name = request.getParameter("text");

			PreparedStatement preStm = conn.prepareStatement(sql);
			preStm.setString(1, name);
			preStm.executeUpdate();
			response.sendRedirect("/Workshop_03/");

		} catch (SQLException e) {
			System.out.println("SQL database problem in AddNewGroup");
		}

	}

}
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

@WebServlet("removeGroup")
public class RemoveGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try (Connection conn = DbUtil.getConn()) {
			String sql = "REMOVE FROM user_group WHERE id=?;";
			String id = request.getParameter("id");

			PreparedStatement preStm = conn.prepareStatement(sql);
			preStm.setString(1, id);
			preStm.executeUpdate();
			response.sendRedirect("/Workshop_03/");

		} catch (SQLException e) {
			System.out.println("SQL database problem in RemoveGroup");
		}
	}
}
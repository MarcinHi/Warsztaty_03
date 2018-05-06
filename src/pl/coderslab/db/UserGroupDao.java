package pl.coderslab.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pl.coderslab.db.DbUtil;
import pl.coderslab.model.UserGroup;

public class UserGroupDao {
	public static List<UserGroup> loadAll() {
		List<UserGroup> result = new ArrayList<>();
		try (Connection conn = DbUtil.getConn()) {
			PreparedStatement stmt = conn.prepareStatement("select * from user_group;");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				result.add(new UserGroup(rs.getInt("id"), rs.getString("name")));
			}
		} catch (SQLException e) {
			System.out.println("SQL database problem in UserGroupDao");
		}
		return result;
	}
}

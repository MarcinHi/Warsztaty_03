package pl.coderslab.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pl.coderslab.db.DbUtil;
import pl.coderslab.model.User;

public class UserDao {
	public static List<User> loadAll(Integer groupId) {
		List<User> result = new ArrayList<>();
		try (Connection conn = DbUtil.getConn()) {
			PreparedStatement stmt = conn.prepareStatement(
					"select id, username, email, password, person_group_id from users where person_group_id = ?");
			stmt.setInt(1, groupId);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				result.add(new User(rs.getInt("id"), 
						rs.getString("username"),
						rs.getString("password"),
						rs.getString("email"),
						rs.getInt("person_group_id")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
}
}

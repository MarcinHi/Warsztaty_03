package pl.coderslab.model;

public class User {
	private	int	id;
	private	String	username;
	private	String	password;
	private	String	email;
	private int userGroupId;
	
	public User(int id, String username, String password, String email, int userGroupId) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.userGroupId = userGroupId;
	}
	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(Integer userGroupId) {
		this.userGroupId = userGroupId;
	}
	
	
}

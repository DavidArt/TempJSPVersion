package ro.fortech;

/**
 * LoginBean bean used for login purpose
 * 
 * @author david.rus
 *
 */
public class LoginBean {

	/**
	 * the user name for login
	 */
	private String name;
	
	/**
	 * the user password for login
	 */
	private String password;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}
}

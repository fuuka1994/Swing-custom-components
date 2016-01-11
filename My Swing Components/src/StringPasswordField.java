import javax.swing.JPasswordField;

/**
 * JPasswordField with additional functions.
 */
public class StringPasswordField extends JPasswordField{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Create a normal JPasswordField.
	 */
	public StringPasswordField(){
		super();
	}
	
	/**
	 * Get the Password value in String.
	 */
	public String getValue(){
		char[] temp = getPassword();
		String password = ("");
		for(int i=0;i<temp.length;i++){
			password = password + temp[i];
		}
		return password;	
	}
	
	/**
	 * Get length of the Password value.
	 */
	public int getLength(){
		char[] temp = getPassword();
		return temp.length;
	}
	
	/**
	 * Compare password with other String.
	 * @param another the String to compare
	 */
	public boolean isMatch(String another){
		if(getValue() == null||another == null){
			return false;
		}
		if(getValue().equalsIgnoreCase(another)){
			return true;
		} else {
			return false;
		}
	}
}

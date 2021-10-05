import java.util.regex.*;

class inputValidation{
	public static boolean isValidUsername(String name){
		String reg = "^[A-Za-z]\\w{7,20}$";
		Pattern p = Pattern.compile(reg);

		if (name == null) {
			return false;
		}

		Matcher m = p.matcher(name);
		return m.matches();
	}

	public static void main(String[] args){
	
		String str1 = "Enter your username";
		System.out.println(isValidUsername(str1));
	}
}
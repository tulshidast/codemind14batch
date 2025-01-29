package javapractices;

public class WrapperClasses {

	public static void main(String[] args) {
		String s = "Welcome to co43545demind Techlogy979 puNe";

		// Welcome to codemind Techlogy puNe
		// WTN

		for (int i = 0; i < s.length(); i++) {

//			if (Character.isUpperCase(s.charAt(i))) {
//				System.out.println(s.charAt(i));
//			}
			
			if (Character.isDigit(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
		}
		
		int number =Integer.parseInt("234434");
		

	}

}

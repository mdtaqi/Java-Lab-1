package hit.day40;

import java.util.Locale;

public class LanguageDemo {
	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		
		System.out.println(locale);
		
		//Locale.setDefault(new Locale("hi"));
		//System.out.println(Locale.getDefault());
		//ResourceBundle
		
		ResourceBundle rb=ResourceBundle.getBundle("mydictionary",new Locale("ta"));
		System.out.println(rb.getString("hello"));
	}
}

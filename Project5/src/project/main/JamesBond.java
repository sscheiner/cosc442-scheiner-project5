package project.main;

import java.util.regex.*;

public class JamesBond {

	public JamesBond() {
		// TODO Auto-generated constructor stub
	}
	
	public static Boolean bondRegex(String target){
		return Pattern.compile(".*\\(.*007.*\\).*").matcher(target).matches();
	}

}

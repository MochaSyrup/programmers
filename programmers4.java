package programmers;

import java.awt.List;
import java.util.ArrayList;

public class programmers4 {

	public static void main(String[] args) {
		String s= "1134";
		boolean answer =true;
		if(s.length()==4 || s.length()==6) {
			if(s.matches("(^[0-9]*$)")) {
				answer = true;
			}else {
				answer =false;
			}
		}else {
			answer = false;
		}
		System.out.println(answer );
	}

}

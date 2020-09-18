package programmers;

import java.util.ArrayList;
import java.util.List;

public class programmers9 {

	public static void main(String[] args) {
		String s = "123456";
		boolean answer = true;
		if(s.length()==4 || s.length()==6) {
			if(!(s.matches("(^[0-9]*$)"))) {
				answer = false;
			}else {
				answer = true;
			}
				
		}else {
			answer = false; 
		}
		System.out.println(answer );
	}
}

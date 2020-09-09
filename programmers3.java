package programmers;

public class programmers3 {

	public static void main(String[] args) {
		boolean answer = true;
		String s = "pPoooyY";
		String[] array_s;
		int a = 0,b =0;
		array_s = s.split("");
		for(int i=0; i<array_s.length; i++) {
			if(array_s[i].equals("p") || array_s[i].equals("P") ) {
				  a++;
			}else if(array_s[i].equals("Y") || array_s[i].equals("y")) {
				  b++;
			}
		}
		if(a==b) {
			answer = true;
		}else {
			answer = false;
		}
		System.out.println(a);
		System.out.println(answer);
	}

}

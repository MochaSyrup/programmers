package programmers;

public class programmers1 {

	public static void main(String[] args) {
		int n = 2;
		String a = "¼ö";
		String b= "¼ö¹Ú";
		String answer= "";
		if(n%2==0)
		for(int i=0; i<n/2; i++) {
			answer += b;
		}else {
			for(int i=0; i<n/2; i++) {
				answer += b;
			} answer += a;
		}
		
		System.out.println(answer);
	}

}

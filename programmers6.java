package programmers;

public class programmers6 {

	public static void main(String[] args) {
		String s = "abcea";
		programmers6 quest = new programmers6();
		quest.solution(s);
				
	}
	public String solution(String s) {
		String answer = "";
		if(s.length()%2==0) {
			answer = s.substring(s.length()/2-1,s.length()/2+1);
		}else {
			answer = s.substring(s.length()/2,s.length()/2+1);
		}
		System.out.println(answer);
		return answer;
	}
}

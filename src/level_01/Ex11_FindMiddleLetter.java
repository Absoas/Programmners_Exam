package level_01;

public class Ex11_FindMiddleLetter {

	public String solution(String s) {
		String answer = "";
		int a = s.length();

		
		if (a % 2 == 0) {
			answer += s.charAt(s.length()/2-1);
			answer += s.charAt(s.length()/2); 
		} else {
			answer += s.charAt(s.length()/2); 
		}

		return answer;
	}
	
	public static void main(String[] args) {

		Ex11_FindMiddleLetter sa = new Ex11_FindMiddleLetter();

		System.out.println(sa.solution("abcdef"));
	}
}

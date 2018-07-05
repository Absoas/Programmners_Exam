package level_01;

public class Ex12_CaesarCipher {

	public String solution(String s, int n) {
		String answer = "";
		int length = s.length();
		for (int i = 0; i < length; i++) {
			if ( ((char)s.charAt(i) == 'z' || (char)s.charAt(i) == 'Z') || (char)s.charAt(i) == ' ' ) {
				if((char)s.charAt(i) == 'z') {
					answer+=(char)(96+n);
				}else if((char)s.charAt(i) == 'Z') {
					answer+=(char)(64+n);
				}else {
					answer+= ' ';
				}
				
			} else {
				answer += (char) (s.charAt(i) + n);
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Ex12_CaesarCipher sa = new Ex12_CaesarCipher();

	
		System.out.println(sa.solution("a b cdeZ", 1));
	}
}

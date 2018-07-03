package level_01;

public class Ex10_HideNumber {

	public String solution(String phone_number) {
		
		String answer = "";
		
		for(int i = 0; i<phone_number.length()-4; i++) {
		   answer += "*";
		}
		
		answer = answer + phone_number.substring(phone_number.length()-4);
		return answer;
	}

	public static void main(String[] args) {
		
		Ex10_HideNumber sa = new Ex10_HideNumber();
		
		System.out.println(sa.solution("01033334444"));
	}
}

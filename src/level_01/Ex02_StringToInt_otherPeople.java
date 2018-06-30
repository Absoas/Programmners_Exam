package level_01;

public class Ex02_StringToInt_otherPeople {
	
	public int solution(String str) {

		boolean Sign = true; // 부호
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			System.out.print(ch);
			
			if (ch == '-')
				Sign = false;
			else if (ch != '+')
				result = result * 10 + (ch - '0');
		}
		return Sign ? 1 : -1 * result;
	}

	public static void main(String[] args) {

		Ex02_StringToInt s = new Ex02_StringToInt();

		int x = s.solution("-1234");
		System.out.println(x);
	}
}

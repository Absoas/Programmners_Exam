package level_01;

public class Ex02_StringToInt {

	 public int solution(String s) {
		 
		 
	      int answer = 0;

	      answer = Integer.parseInt(s);
	      return answer;
	  }
	 
	
	public static void main(String[] args) {
		
		Ex02_StringToInt s = new Ex02_StringToInt();
		
		s.solution("-1234");
	}
}

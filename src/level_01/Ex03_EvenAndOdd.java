package level_01;

public class Ex03_EvenAndOdd {
	 public String solution(int num) {
		 
		 
		 String answer = "";
		 
		 if(num % 2 == 0) {
			 answer = "Even";
		 }else if(num % 2 != 0) {
			 answer = "Odd";
		 }
		 
	     return answer;
	  }
	 
	
	public static void main(String[] args) {
		
		Ex03_EvenAndOdd s = new Ex03_EvenAndOdd();
		
		System.out.println(s.solution(5));
		
	}
}

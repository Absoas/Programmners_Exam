package level_01;

public class Ex07_AddDigits_otherPeople {
	public int solution(int n) {
	      int answer = 0;

	        while(true){
	            answer+=n%10;
	            if(n<10)
	                break;

	            n=n/10;
	        }
	      
	      
	      return answer;
	  }
	
	public static void main(String[] args) {
		
		Ex07_AddDigits_otherPeople so = new Ex07_AddDigits_otherPeople();
		
		System.out.println(so.solution(572));
		
		
	}
}

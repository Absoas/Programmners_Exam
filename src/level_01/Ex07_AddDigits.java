package level_01;

public class Ex07_AddDigits {
	public int solution(int n) {
	      int answer = 0;
	      int y=0;
	      
	      for(int x=0; x<10; x++) {
	    	  
	    	  y = n % 10;
	    	  answer += y;
	    	  n = (n-y)/10;
	    	  y = n;
	    	  
	      }
	      
	      
	      return answer;
	  }
	
	public static void main(String[] args) {
		
		Ex07_AddDigits so = new Ex07_AddDigits();
		
		System.out.println(so.solution(572));
		
		
	}
}

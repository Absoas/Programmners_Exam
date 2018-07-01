package level_01;

public class Ex06_Sum_divisors {
	public int solution(int n) {
	      int answer = 0;
	      
	      for(int i=1; i<=n; i++) {
	    	
	    	  if(n%i == 0) {
	    		  answer = answer+i;
	    	  }
	      }
	      
	      
	      return answer;
	  }
	
	public static void main(String[] args) {
		
		Ex06_Sum_divisors so = new Ex06_Sum_divisors();
		
		System.out.println(so.solution(5));
		System.out.println(so.solution(4));
		
		
	}
}

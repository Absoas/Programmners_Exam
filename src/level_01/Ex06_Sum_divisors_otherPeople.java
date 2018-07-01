package level_01;

public class Ex06_Sum_divisors_otherPeople {
	public int solution(int num) {
	      int answer = 0;
	      
	      for(int i = 1; i <= num/2; i++){
	          if(num%i == 0) answer += i;
	        }
	          return answer+num;
	  }
	
	public static void main(String[] args) {
		
		Ex06_Sum_divisors_otherPeople so = new Ex06_Sum_divisors_otherPeople();
		
		System.out.println(so.solution(5));
		System.out.println(so.solution(4));
		
		
	}
}

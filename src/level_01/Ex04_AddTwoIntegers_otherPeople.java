package level_01;

public class Ex04_AddTwoIntegers_otherPeople {

	public long solution(int a, int b) {

		 long answer = 0;
	      if(a!=b){
	          for(int i=Math.min(a,b);i<=Math.max(a,b);i++){
	              answer+=i;
	          }
	      }else{
	          answer=a;
	      }
	      return answer;
	}

	public static void main(String[] args) {

		Ex04_AddTwoIntegers_otherPeople so = new Ex04_AddTwoIntegers_otherPeople();

		System.out.println(so.solution(5, 5));
		
	}
}

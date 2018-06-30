package level_01;

public class Ex03_EvenAndOdd_otherPeople {
	
     public String evenOrOdd(int num) {
	        return num % 2 == 0 ? "Even": "Odd";
	    }
	
	public static void main(String[] args) {
		
		Ex03_EvenAndOdd_otherPeople s = new Ex03_EvenAndOdd_otherPeople();
		
		 System.out.println("결과 : " + s.evenOrOdd(3));
	     System.out.println("결과 : " + s.evenOrOdd(2));
	        
	
	}
}

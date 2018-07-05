package level_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Ex13_DescendingString {

	public String solution(String s) {
		String answer = "";
		int length = s.length();
		int temp = 0;
		int[] list = new int[s.length()];
		
		for (int i = 0; i < length; i++) {
			if ((int)s.charAt(i) < 91) {
				list[i] = s.charAt(i)+60;
			}else {
				list[i] = s.charAt(i);	
			}
			
		}

		Arrays.sort(list);
		
		for(int i = 0; i<length; i++) {
			if(list[i]<122) {
				answer += (char)list[i];	
			}else {
				temp = list[i];
			}
				System.out.println(list[i]);
		}
		answer+= (char)(list[temp]-60);
		
		return answer;
	}

	public static void main(String[] args) {

		Ex13_DescendingString sa = new Ex13_DescendingString();

	
		System.out.println(sa.solution("abcdzA"));
	}
}

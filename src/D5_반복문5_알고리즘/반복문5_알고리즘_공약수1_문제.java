package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_공약수1_문제 {
	/*
	 * [문제]
	   		105와 63과 175의 공약수를 구하시오
	 */
	public static void main(String[] args) {
		int a = 105;
		int b = 63;
		int c = 175;
		int num = 1;
		
		while(true) {
			if(num > a || num > b || num > c) {
				break;
			}
			if(a%num == 0 && b%num == 0 && c%num == 0) {
				System.out.print(num +" ");
			}
			num++;
		}
		
	}
}
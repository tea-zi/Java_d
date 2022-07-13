package D2_반복문2_프로젝트;

import java.util.Random;

public class 반복문2_프로젝트_자리수출력_문제 {
	/*
	 * [문제]
		 [1] 1~99999 사이의 랜덤숫자를 저장하고 자리수가 몇자리인지 출력하고,
		 [2] 그중에 9의 개수를 출력.
		 
		 예) 8 ==> 1 , 0
		 예) 102 ==> 3 , 0
		 예) 88 ==> 2 , 0
		 예) 919 ==> 3, 2
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(9)+1;
		int a = 1;
		int c = 0;
		int i = 1;
		while(i==1) {
			if(num/a != 0) {
				c++;
			}
			else {
				i=0;
			}
			a=a*10;
		}
		System.out.println(num + " " + c);
		
		int 자리수 = 0;	
		int 임시 = num;
		
		int run = 1;
		while(run == 1) {
			임시 = 임시 / 10;		
			System.out.println(임시);
			if(임시 == 0) {
				run = 0;
			}
			자리수 += 1;
		}
		System.out.println(num + " " + 자리수);
	}
}
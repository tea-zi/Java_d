package D2_반복문2_프로젝트;

import java.util.Random;

public class 반복문2_프로젝트_각자리수의합 {
	public static void main(String[] args) {
		Random ran = new Random();
		/*
		 * [문제]
			 1~999 사이의 랜덤숫자를 저장하고 각 자리수의 합을 출력하시오.
			 예) 8 ==> 8
			 예) 28 ==> 2 + 8
			 예) 999 ==> 9 + 9 + 9
		 */
		int num = ran.nextInt(999)+1;
		System.out.println(num);
		int i = 100;
		int sum =0;
		while(i>=1) {
			System.out.print(num/i + " ");
			sum=sum+num/i;
			num = num%i;
			i=i/10;
		}
		System.out.println();
		System.out.println("합 : " + sum);
	}
}
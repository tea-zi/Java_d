package 테스트04_01_문제;

import java.util.Scanner;

/*
	[문제]
		[1] 변수 a에  1~1000을 입력받는다.
		[2] a의 값이 1~10 이면 num에 1을 저장 저장후 출력한다.
		[3] a의 값이 11~20 이면 num에 2를 저장 저장후 출력한다.
		...
		[4] a의 값이 91~100 이면 num에 10을 저장후 출력한다.
		...
		[5] a의 값이 981 ~ 990 이면 num 에 99 를 저장후 출려한다.
		[5] a의 값이 991 ~1000 이면 num 에 100을 저장후 출력한다. 
 */
public class 조건문5_문제07_페이징 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int num = 0;
		if(a%10 == 0) {
			num = a/10;
		}
		else {
			num = (a+10)/10;
		}
		System.out.println(num);
	}
}
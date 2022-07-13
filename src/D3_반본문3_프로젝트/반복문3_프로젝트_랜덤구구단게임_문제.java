package D3_반본문3_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문3_프로젝트_랜덤구구단게임_문제 {
	/* 
	 *  [랜덤구구단 게임] (반복문사용)
	 * 1. 랜덤구구단 게임을 10회 반복한다.
	 * 2. 정답을 맞추면 1문제당 10점이다.
	 * 3. 게임 종료 후, 성적을 출력한다.
	 * 4. 단, 3번연속으로틀리면 즉시종료하며 0점이된다.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d = 0;
		int e = 0;
		int f = 0;
		for(int i=1; i<=10; i++) {
			a = ran.nextInt(9)+1;
			b = ran.nextInt(9)+1;
			c = a*b;
			System.out.println(i + "문제 : " + a + " * " + b + " = ? ");
			System.out.print("숫자 입력 : ");
			d = scan.nextInt();
			if(c == d) {
				f = 0;
				System.out.println("정답  연속오답 : " + f);
				e = e+10;
			}
			else {
				f++;
				System.out.println("오답  연속오답 : " + f);
			}
			if(f == 3) {
				System.out.println("3번 연속 실패!!");
				e = 0;
				break;
			}
		}
		System.out.println(e + "점");
		
	}
}
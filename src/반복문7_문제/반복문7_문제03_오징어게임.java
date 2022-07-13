package 반복문7_문제;

import java.util.Random;
/*
	[오징어게임]
		철수는 오징어게임에 참가하였다.
		첫번째 게임은 "무궁화꽃이 피었습니다" 이다.
		규칙은 아래와같다.	
	[규칙]	
		[1] 전체 거리는 0 ~ 25까지 거리가 있다.
		[2] 철수는 현재 0의 자리에 있다.
		[3] 철수는 매턴 1 ~ 4의 랜덤숫자를뽑는다. 숫자만큼 이동한다. 
		[4]	이동거리를 누적하며, 합이 25이상이되면 승리이며 종료한다.
		[5] 인형은 매턴 3 ~ 5의 랜덤숫자를뽑는다. 
		[6] 인형보다 큰 숫자가나오면 움직인것으로 간주되어 패배하며 종료한다.
		[7] 10턴안에 도착못하면 시간초과로 패배하며 종료한다.
		[8] 철수의 이동경로를 전부 출력하시오.
 */
public class 반복문7_문제03_오징어게임 {
	public static void main(String[] args) {
		Random ran = new Random();
		int 철수 = 0;
		for(int i=0; i<10; i++) {
			System.out.println("==== " + (i+1) + "번째 턴 ====");
			int r = ran.nextInt(4)+1;
			System.out.println("r : " + r);
			철수 += r;
			System.out.println("철수위치 : " + 철수);
			int doll = ran.nextInt(3)+3;
			System.out.println("doll : " + doll);
			if(철수 >= 25) {
				System.out.println("승리");
			}
			if(r > doll || i == 9) {
				System.out.println("패배");
				break;
			}
			
		}
	}
}

package D6_반복문6_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문6_프로젝트_카카오택시 {
	/*
	 * 
	 * [카카오 택시]
	 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
	 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
	 * 3. 메뉴는 아래와 같다.
	 * 		1) 속도설정 : 1~3까지만 가능
	 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
	 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
	 * 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
	 * 5. 도착하면 다시 -10 ~ 10 사이의 랜덤 목적지가 설정된다.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int 현재위치x = 0;
		int 현재위치y = 0;
		int 요금 = 0;
		int x;
		int y;	
		int 속도 = 0;
		int 방향 = 0;
		while(true) {
			System.out.println("[1.시작][2.종료]");
			int c = scan.nextInt();
			x = ran.nextInt(21)-10;
			y = ran.nextInt(21)-10;
			if(c == 1) {
			while(true) {
				System.out.println("목적지위치 : " + x + " , " + y);
				System.out.println("[1.속도][2.방향][3.이동하기]");
				int s = scan.nextInt();
				if(s == 1) {
					while(true) {
						System.out.println("속도를 설정하세요");
						System.out.println("[속도1][속도2][속도3]");
						속도 = scan.nextInt();
						if(속도< 1 || 속도 > 3) {
							System.out.println("다시입력");
						}
						break;
					}
				}
				else if(s == 2) {
					while(true) {
						System.out.println("방향를 설정하세요");
						System.out.println("[1.동][2.서][3.남][4.북]");
						방향 = scan.nextInt();
						if(방향 < 1 || 방향 >4) {
							System.out.println("다시입력");
						}
						break;
					}
				}
				else if(s == 3) {
					if(방향 == 1) {
						현재위치x += 속도;
						요금 += 50*속도;
					}
					else if(방향 == 2) {
						현재위치x -= 속도;
						요금 += 50*속도;
					}
					else if(방향 == 3) {
						현재위치y -= 속도;
						요금 += 50*속도;
					}
					else if(방향 == 4) {
						현재위치y += 속도;
						요금 += 50*속도;
					}
					System.out.println("택시위치 : " + 현재위치x + " , " + 현재위치y);
					}
					if(현재위치x == x && 현재위치y == y) {
						System.out.println("도착했습니다.");
						System.out.println("요금 : " + 요금);
					break;
					}
				}
			}
			else {
				System.out.println("게임종료");
				break;
			}
		}
	}

}
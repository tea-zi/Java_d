package D3_반본문3_프로젝트;

import java.util.Scanner;

public class 반복문3_프로젝트_반복문로그인_문제 {
	/*
	 * 1. 로그인 . 로그인 후 재 로그인 불가 . 로그아웃 상태에서만 이용 가능 
	 * 2. 로그아웃 . 로그인 후 이용가능
	 * 3. 로그인,로그아웃 관리는 log 는 변수를 이용한다.
	 *  [예] -1(로그아웃), 1111(id1), 2222(id2)
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int id1 = 1111;
		int pw1 = 1234;
		int id2 = 2222;
		int pw2 = 2345;
		int log = -1; // -1(로그아웃), 1111(id1), 2222(id2)
		int i = 1;
		while(i==1) {
			System.out.println("[1.로그인][2.로그아웃]");
			int s = scan.nextInt();
			if(s == 1) {
				if(log == -1) {
					System.out.print("아이디 입력 : ");
					int Id = scan.nextInt();
					System.out.print("비밀번호 입력 : ");
					int Pw = scan.nextInt();
					if(id1 == Id && pw1 == Pw) {
						log = id1;
					}
					else if(id2 == Id && pw2 == Pw) {
						log = id2;
					}
					else {
						System.out.println("잘못된 정보입니다.");
					}
					System.out.println(log + "님 로그인");
				}
				else {
					System.out.println("로그인 상태입니다.");
				}
			}
			else if(s == 2){
				if(log != -1) {
					log = -1;
					System.out.println("로그아웃");
				}
				else {
					System.out.println("로그인 정보가 없습니다.");
				}
			}
			else {
				System.out.println("잘못된 정보입니다. 시스템 종료합니다.");
				break;
			}
		}
	}
}

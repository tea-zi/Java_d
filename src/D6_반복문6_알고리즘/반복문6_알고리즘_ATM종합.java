package D6_반복문6_알고리즘;

import java.util.Scanner;

public class 반복문6_알고리즘_ATM종합 {
	/*
	 * [ATM]
	 *  [뒤로가기] 를 활용해 단계별로 기능을 구현한다. 
	 * 	[회원가입] 은 추후 배열에서 가능하다. 
	 * 메인화면기능         ==> [1.로그인 0.종료 ]
	 * 1번 로그인 선택시     ==> [1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]  
	 * 2번 종료 선택시       ==> [종료] 
	 * -------------------------------------------------
	 * [추가조건] 
	 * [1] 5.정보수정 선택시 ==> 비밀번호를 바꿀수있다.
	 * [2] 0.로그아웃 선택시 ==> 뒤로 돌아가서 [1.로그인 0.종료] 화면이 다시나온다.         
	 * [3] 로그인 3번실패시 강제 종료한다. 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		int count = 0;
		int log = -1; // -1(로그아웃), 1111(dbAcc1로그인), 2222(dbAcc2로그인)
		boolean run = true;
		boolean run2 = false;
		int Money = 0;
		while(run) {
			System.out.println("[1.로그인 0.종료 ]");
			int s = scan.nextInt();
			if(s == 1) { // 로그인
				System.out.print("아이디 입력 : ");
				int id = scan.nextInt();
				System.out.print("비밀번호 입력 : ");
				int pw = scan.nextInt();
				if(id == dbAcc1 && pw == dbPw1) { // dbAcc1로 로그인
					log = dbAcc1;
					Money = dbMoney1;
					count = 0;
					run2 = true;
				}
				else if(id == dbAcc2 && pw == dbPw2) { // dbAcc2로 로그인
					log = dbAcc2;
					Money = dbMoney2;
					count = 0;
					run2 = true;
				}
				else { 
					System.out.println("잘못된 정보입니다.");
					count++;
				}
				if(count == 3) { // 로그인 연속3회실패 강제종료 
					System.out.println("로그인 실패");
					break;
				}
				while(run2) { // 로그인성공 선택창
					System.out.println("[1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]");
					s = scan.nextInt();
					switch(s) {
					case 1: // 입금
						System.out.print("입금할 금액 : ");
						int money = scan.nextInt();
						Money += money;
						System.out.println("잔액 : " + Money);
						break;
					case 2: // 출금
						System.out.print("출금할 금액 : ");
						int money2 = scan.nextInt();
						if(money2 <= Money) {
							Money = Money - money2;
							System.out.println("잔액 : " + Money);
						}
						else {
							System.out.println("잔액이 부족합니다.");
						}
						break;
					case 3: // 이체
						System.out.print("이체할 계좌 : ");
						int acc = scan.nextInt();
						System.out.print("이체할 금액 : ");
						int money3 = scan.nextInt();
						if(Money < money3) {
							System.out.println("잔액이 부족합니다.");
							System.out.println("다시이용해주세요.");
						}
						else {
							if(log == acc) {
								System.out.println("본인 계좌입니다.");
							}
							else {
								if(acc == dbAcc2 && log == dbAcc1) {
									dbMoney1 -= money3;
									dbMoney2 += money3;
								}
								else if(acc == dbAcc1 && log == dbAcc2) {
									dbMoney2 -= money3;
									dbMoney1 += money3;
								}
								else {
									Money -= money3;
								}
								System.out.println("이체완료");
								System.out.println("잔액 : " + (Money-money3));
							}
						}
						
						break;
					case 4: // 조회
						System.out.println("예금 조회");
						System.out.println("잔액 : " + Money);
						break;
					case 5: // 비밀번호변경
						System.out.print("새비밀번호 입력 : ");
						pw = scan.nextInt();
						if(log == dbAcc1) {
							dbPw1 = pw;
						}
						else {
							dbPw2 = pw;
						}
						break;
					case 0: // 로그아웃
						System.out.println("로그아웃");
						if(log == dbAcc1) {
							dbMoney1 = Money;
						}
						else {
							dbMoney2 = Money;
						}
						run2 = false;
						break;
					default : // 항목에 있는 수 입력시
						System.out.println("다시 선택하세요");
					}
					
				}
			}
			else if(s == 0) { // 시스템 종료
				System.out.println("시스템 종료");
				break;
			}
			else { // 0과 1 이외에 수 입력시
				System.out.println("다시 선택하세요");
			}
		}
	}

}
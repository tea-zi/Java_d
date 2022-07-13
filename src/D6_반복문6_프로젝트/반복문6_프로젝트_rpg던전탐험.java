package D6_반복문6_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 반복문6_프로젝트_rpg던전탐험 {
	/*
       [반복문 최종프로젝트] 시간제한없이 자유롭게 하면된다.
	 * [던전탐험게임]
	 * 플레이어는 무기 방어구 체력 돈 운 등의 데이터가 있다. (추가 가능)
	 * 플레이어와 적은 1명으로 하고 1명이상은 추후 배열에서 가능하다.
	 * 1) 메인메뉴 ==> [1.여관] [2.대장간] [3.던전][0.종료]
	 * 2) [1.여관] 은 소지금을 소모해 체력과 스킬회복 또는 아이템구입을 한다.
	 * 				 ==> [1.숙박(체력,스킬회복)][2.물약구입][0.뒤로가기]
	 * 3) [2.대장간] 은 소지금을 소모해 랜덤으로 무기와 방어구 업그레이드 시켜준다. 
	 * 			    ==> [1.무기업][2.방어구업][0.뒤로가기]
	 * 4) [3.던전] 은 몬스터를 만나 전투를한다. ==> [1.공격][2.스킬][3.물약먹기][0.뒤로가기]
	 * 			스킬은 2번 공격을 한다.
	 * 			물약을 먹으면 체력이 회복한다. 
	 * 			승리하면 돈을 획득한다. 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int 현재체력 = 1000;
		int 최대체력 = 1000;
		int 공격력 = 10;
		int 방어력 = 10;
		int 물약개수 = 0;
		int 스킬개수 = 0;
		int 소지금 = 1000;
		int 무기레벨 = 0;
		int 방어구레벨 = 0;
		
		int 몬스터현재체력 = 100;
		int 몬스터최대체력 = 100;
		int 몬스터공격력 = 10;
		int 몬스터방어력 = 10;
		int 몬스터소지금 =100;
		boolean run = true;
		
		while(true) {
			System.out.println("[1.여관] [2.대장간] [3.던전][0.종료]");
			int s = scan.nextInt();
			몬스터현재체력 = 몬스터최대체력;
			if(s == 1) { // 여관
				while(true) {
					System.out.println("[1.숙박(체력,스킬회복)][2.물약구입][0.뒤로가기]");
					int s1 = scan.nextInt();
					int r1 = ran.nextInt(10)+1;
					int r2 = ran.nextInt(10)+1;
					if(s1 == 1) { // 숙박(체력,스킬회복)
						if(소지금 < 1000) {
							System.out.println("돈이 부족합니다.");
						}
						else {
							소지금 -= 1000;
							if(현재체력+r1 <= 최대체력) {
								현재체력 += r1;
								스킬개수 += r2;
								System.out.println("체력 " + r1 + " 상승");
								System.out.println("스킬 " + r2 + " 증가");
								System.out.println("체력" + 현재체력 + "/" + 최대체력);
								System.out.println("스킬개수 " + 스킬개수);
							}
							else {
								스킬개수 += r2;
								System.out.println("현재체력이 최대치입니다.");
								System.out.println("스킬 " + r2 + " 증가");
								System.out.println("스킬개수 " + 스킬개수);
								소지금 += 1000;
							}
							
						}
					}
					else if(s1 == 2) { // 물약구입
						System.out.println("소지금 " + 소지금);
						System.out.print("구입할 개수 : ");
						int c = scan.nextInt();
						if(c*100 > 소지금) {
							System.out.println("돈이 부족합니다.");
						}
						else {
							소지금 -= c*100;
							물약개수 += c;
							System.out.println("소지금 " + 소지금);
							System.out.println("물약개수 " + 물약개수);
						}
					}
					else if(s1 == 0) { // 뒤로가기
						break;
					}
					else {
						System.out.println("다시 입력");
					}
				}
			}
			else if(s == 2) { // 대장간
				while(true) {
					System.out.println("[1.무기업][2.방어구업][0.뒤로가기]");
					int s2 = scan.nextInt();
					if(s2 == 1) { // 무기업
						while(true) {
							System.out.println("[1.강화][0.뒤로가기]");
							System.out.println("소지금 " + 소지금);
							int 강화 = scan.nextInt();
							if(소지금 >= 500) {
								if(강화 == 1) {
									int 무기 = ran.nextInt(10)+1;
									System.out.println(무기 + "업");
									무기레벨 += 무기;
									공격력 += 무기레벨*10;
									System.out.println("공격력 " + 무기레벨*10 + " 상승");
									System.out.println("플레이어 공격력 : " + 공격력);
								}
								else if(강화 == 0) {
									break;
								}
								else {
									System.out.println("다시 입력");
								}
							}
							else {
								System.out.println("강화실패");
								System.out.println("돈이 부족합니다.");
							}
						}
					}
					else if(s2 == 2) { // 방어구업
						while(true) {
							System.out.println("[1.강화][0.뒤로가기]");
							System.out.println("소지금 " + 소지금);
							int 강화 = scan.nextInt();
							if(소지금 >= 500) {
								if(강화 == 1) {
									int 방어구 = ran.nextInt(10)+1;
									System.out.println(방어구 + "업");
									방어구레벨 += 방어구;
									방어력 += 방어구레벨*10;
									System.out.println("방어력 " + 방어구레벨*10 + " 상승");
									System.out.println("플레이어 방어력 : " + 방어력);
								}
								else if(강화 == 0) {
									break;
								}
								else {
									System.out.println("다시 입력");
								}
							}
							else {
								System.out.println("강화실패");
								System.out.println("돈이 부족합니다.");
							}
						}
					}
					else if(s2 == 0) { // 뒤로가기
						break;
					}
					else {
						System.out.println("다시 입력");
					}
				}
			}
			else if(s == 3) { // 던전
				while(true) {
				 System.out.println("[1.공격][2.스킬][3.물약먹기][0.뒤로가기]");
				 	if(몬스터현재체력 > 0) {
				 		int s3 = scan.nextInt();
				 		if(s3 == 1) { // 공격
				 			몬스터현재체력 -= 공격력/(몬스터방어력/10);
				 			System.out.println("몬스터에게 " + 공격력/(몬스터방어력/10) + " 피해");
				 			System.out.println("몬스터체력 " + 몬스터현재체력 + "/" + 몬스터최대체력);
				 			int 반격 = ran.nextInt(10)+1;
				 			if(반격 == 5) {
				 				int 피해 = 몬스터공격력/(방어력/10);
				 				현재체력 -= 피해;
				 				System.out.println(피해 + " 피해");
				 				System.out.println("체력" + 현재체력 + "/" + 최대체력);
				 			}
				 		}
				 		else if(s3 == 2) { // 스킬
				 			if(스킬개수 > 0) {
				 				스킬개수 -= 1;
				 				몬스터현재체력 -= 공격력*2/몬스터방어력;
				 				System.out.println("몬스터에게 " + 공격력*2/몬스터방어력 + " 피해");
				 				System.out.println("몬스터체력 " + 몬스터현재체력 + "/" + 몬스터최대체력);
				 			}
				 			else {
				 				System.out.println("스킬을 사용할수 없습니다.");
				 			}
				 			
				 		}
				 		else if(s3 == 3) { // 물약먹기
				 			if(물약개수 > 0) {
				 				if(현재체력+20 < 최대체력) {
				 					현재체력 = 최대체력;
				 				}
				 				else {
				 				물약개수 -= 1;
				 				현재체력 += 20;
				 				System.out.println("체력회복");
				 				System.out.println("체력" + 현재체력 + "/" + 최대체력);
				 				}
				 			}
				 		}
				 		else if(s3 == 0) { // 뒤로가기
				 			break;
				 		}
				 		else {
				 			System.out.println("다시 입력");
				 		}
				 	}
				 	else if(몬스터현재체력 <= 0){
				 		System.out.println("몬스터 처지!!!");
				 		소지금 += 몬스터소지금;
				 		System.out.println(몬스터소지금 + " 골드 획득");
				 		break;
				 	}
				}
			}
			else if(s == 0) { // 종료
				System.out.println("게임 종료");
				break;
			}
			else {
				System.out.println("다시 선택");
			}
		}
	}
}
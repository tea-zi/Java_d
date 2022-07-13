package D4_반본문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_영수증_문제 {
	/*
	 * 
	 * [영수증 출력]
	 * 1. 5번 주문을 받는다.
	 * 2. 주문이 끝난 후, 돈을 입력받는다.
	 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
	 * 
	 * 예)
	 * 메뉴 선택 : 1
	 * 메뉴 선택 : 1
	 * 메뉴 선택 : 2
	 * 메뉴 선택 : 2
	 * 메뉴 선택 : 3
	 * 총 금액 = 31300원
	 * 현금 입력 : 32000
	 * === 롯데리아 영수증 ===
	 * 1. 불고기 버거 : 2개
	 * 2. 새우    버거 : 2개
	 * 3. 콜         라 : 1개
	 * 4. 총   금   액 : 31300원
	 * 5. 잔         돈 : 700원
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		int sum =0;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i=1; i<=5; i++) {
			System.out.print("메뉴 선택 : ");
			int s = scan.nextInt();
			if(s == 1) {
				sum = sum + price1;
				c1++;
			}
			else if(s == 2) {
				sum = sum + price2;
				c2++;
			}
			else if(s == 3) {
				sum = sum + price3;
				c3++;
			}
			else {
				System.out.println("[1.재주문][2.주문종료]");
				s = scan.nextInt();
				if(s == 1) {
					i--;
				}
				else {
					break;
				}
			}
		}
		System.out.print("현금 입력 : ");
		int money = scan.nextInt();
		if(money > sum) {
		System.out.printf("=== 롯데리아 영수증 ===\n1. 불고기 버거 : %d개\n2. 새우    버거 : %d개\n3. 콜         라 : %d개\n4. 총   금   액 : %d원\n5. 잔         돈 : %d원",c1,c2,c3,sum,money-sum);
		}
		else {
			System.out.printf("=== 롯데리아 영수증 ===\n1. 불고기 버거 : %d개\n2. 새우    버거 : %d개\n3. 콜         라 : %d개\n4. 총   금   액 : %d원\n5. 잔         돈 : %d원",c1,c2,c3,sum,sum-money);
			System.out.println(sum - money + "원 부족");
		}
	}

}
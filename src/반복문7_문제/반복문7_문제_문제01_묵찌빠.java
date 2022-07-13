package 반복문7_문제;

import java.util.Random;

public class 반복문7_문제_문제01_묵찌빠 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("[0:가위][1:바위][2:보]");
		while(true) {
			int com1 = ran.nextInt(3);
			int com2 = ran.nextInt(3);
			System.out.println("com1 : " + com1 + " vs com2 : " + com2);
			boolean check = false;
			if(com1 == 0) { // 가위
				if(com2 == 0) {
					continue;
				}
				else if(com2 == 1) {
					
				}
				else if(com2 == 2) {
					check = true;
				}
			}
			else if(com1 == 1) { // 바위
				if(com2 == 0) {
					check = true;
				}
				else if(com2 == 1) {
					continue;
				}
				else if(com2 == 2) {
					
				}
			}
			else if(com1 == 2) { // 보
				if(com2 == 0) {
					
				}
				else if(com2 == 1) {
					check = true;
				}
				else if(com2 == 2) {
					continue;
				}
			}
			System.out.println("-----------------------");
			if(check == true) {
				com1 = ran.nextInt(3);
				com2 = ran.nextInt(3);
				System.out.println("com1 : " + com1 + " vs com2 : " + com2);
				if(com1 == com2) {
					System.out.println("com1 승리");
					break;
				}
			}
			else {
				com1 = ran.nextInt(3);
				com2 = ran.nextInt(3);
				System.out.println("com1 : " + com1 + " vs com2 : " + com2);
				if(com1 == com2) {
					System.out.println("com2 승리");
					break;
				}
			}
		}
	}
}

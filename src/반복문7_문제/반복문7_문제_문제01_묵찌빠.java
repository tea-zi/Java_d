package �ݺ���7_����;

import java.util.Random;

public class �ݺ���7_����_����01_����� {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("[0:����][1:����][2:��]");
		while(true) {
			int com1 = ran.nextInt(3);
			int com2 = ran.nextInt(3);
			System.out.println("com1 : " + com1 + " vs com2 : " + com2);
			boolean check = false;
			if(com1 == 0) { // ����
				if(com2 == 0) {
					continue;
				}
				else if(com2 == 1) {
					
				}
				else if(com2 == 2) {
					check = true;
				}
			}
			else if(com1 == 1) { // ����
				if(com2 == 0) {
					check = true;
				}
				else if(com2 == 1) {
					continue;
				}
				else if(com2 == 2) {
					
				}
			}
			else if(com1 == 2) { // ��
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
					System.out.println("com1 �¸�");
					break;
				}
			}
			else {
				com1 = ran.nextInt(3);
				com2 = ran.nextInt(3);
				System.out.println("com1 : " + com1 + " vs com2 : " + com2);
				if(com1 == com2) {
					System.out.println("com2 �¸�");
					break;
				}
			}
		}
	}
}

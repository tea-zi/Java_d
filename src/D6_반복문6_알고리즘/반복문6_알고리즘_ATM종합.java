package D6_�ݺ���6_�˰���;

import java.util.Scanner;

public class �ݺ���6_�˰���_ATM���� {
	/*
	 * [ATM]
	 *  [�ڷΰ���] �� Ȱ���� �ܰ躰�� ����� �����Ѵ�. 
	 * 	[ȸ������] �� ���� �迭���� �����ϴ�. 
	 * ����ȭ����         ==> [1.�α��� 0.���� ]
	 * 1�� �α��� ���ý�     ==> [1.�Ա� 2.��� 3.��ü 4.��ȸ 5.�������� 0.�α׾ƿ�]  
	 * 2�� ���� ���ý�       ==> [����] 
	 * -------------------------------------------------
	 * [�߰�����] 
	 * [1] 5.�������� ���ý� ==> ��й�ȣ�� �ٲܼ��ִ�.
	 * [2] 0.�α׾ƿ� ���ý� ==> �ڷ� ���ư��� [1.�α��� 0.����] ȭ���� �ٽó��´�.         
	 * [3] �α��� 3�����н� ���� �����Ѵ�. 
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
		int log = -1; // -1(�α׾ƿ�), 1111(dbAcc1�α���), 2222(dbAcc2�α���)
		boolean run = true;
		boolean run2 = false;
		int Money = 0;
		while(run) {
			System.out.println("[1.�α��� 0.���� ]");
			int s = scan.nextInt();
			if(s == 1) { // �α���
				System.out.print("���̵� �Է� : ");
				int id = scan.nextInt();
				System.out.print("��й�ȣ �Է� : ");
				int pw = scan.nextInt();
				if(id == dbAcc1 && pw == dbPw1) { // dbAcc1�� �α���
					log = dbAcc1;
					Money = dbMoney1;
					count = 0;
					run2 = true;
				}
				else if(id == dbAcc2 && pw == dbPw2) { // dbAcc2�� �α���
					log = dbAcc2;
					Money = dbMoney2;
					count = 0;
					run2 = true;
				}
				else { 
					System.out.println("�߸��� �����Դϴ�.");
					count++;
				}
				if(count == 3) { // �α��� ����3ȸ���� �������� 
					System.out.println("�α��� ����");
					break;
				}
				while(run2) { // �α��μ��� ����â
					System.out.println("[1.�Ա� 2.��� 3.��ü 4.��ȸ 5.�������� 0.�α׾ƿ�]");
					s = scan.nextInt();
					switch(s) {
					case 1: // �Ա�
						System.out.print("�Ա��� �ݾ� : ");
						int money = scan.nextInt();
						Money += money;
						System.out.println("�ܾ� : " + Money);
						break;
					case 2: // ���
						System.out.print("����� �ݾ� : ");
						int money2 = scan.nextInt();
						if(money2 <= Money) {
							Money = Money - money2;
							System.out.println("�ܾ� : " + Money);
						}
						else {
							System.out.println("�ܾ��� �����մϴ�.");
						}
						break;
					case 3: // ��ü
						System.out.print("��ü�� ���� : ");
						int acc = scan.nextInt();
						System.out.print("��ü�� �ݾ� : ");
						int money3 = scan.nextInt();
						if(Money < money3) {
							System.out.println("�ܾ��� �����մϴ�.");
							System.out.println("�ٽ��̿����ּ���.");
						}
						else {
							if(log == acc) {
								System.out.println("���� �����Դϴ�.");
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
								System.out.println("��ü�Ϸ�");
								System.out.println("�ܾ� : " + (Money-money3));
							}
						}
						
						break;
					case 4: // ��ȸ
						System.out.println("���� ��ȸ");
						System.out.println("�ܾ� : " + Money);
						break;
					case 5: // ��й�ȣ����
						System.out.print("����й�ȣ �Է� : ");
						pw = scan.nextInt();
						if(log == dbAcc1) {
							dbPw1 = pw;
						}
						else {
							dbPw2 = pw;
						}
						break;
					case 0: // �α׾ƿ�
						System.out.println("�α׾ƿ�");
						if(log == dbAcc1) {
							dbMoney1 = Money;
						}
						else {
							dbMoney2 = Money;
						}
						run2 = false;
						break;
					default : // �׸� �ִ� �� �Է½�
						System.out.println("�ٽ� �����ϼ���");
					}
					
				}
			}
			else if(s == 0) { // �ý��� ����
				System.out.println("�ý��� ����");
				break;
			}
			else { // 0�� 1 �̿ܿ� �� �Է½�
				System.out.println("�ٽ� �����ϼ���");
			}
		}
	}

}
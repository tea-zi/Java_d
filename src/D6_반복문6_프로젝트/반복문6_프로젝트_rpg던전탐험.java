package D6_�ݺ���6_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���6_������Ʈ_rpg����Ž�� {
	/*
       [�ݺ��� ����������Ʈ] �ð����Ѿ��� �����Ӱ� �ϸ�ȴ�.
	 * [����Ž�����]
	 * �÷��̾�� ���� �� ü�� �� �� ���� �����Ͱ� �ִ�. (�߰� ����)
	 * �÷��̾�� ���� 1������ �ϰ� 1���̻��� ���� �迭���� �����ϴ�.
	 * 1) ���θ޴� ==> [1.����] [2.���尣] [3.����][0.����]
	 * 2) [1.����] �� �������� �Ҹ��� ü�°� ��ųȸ�� �Ǵ� �����۱����� �Ѵ�.
	 * 				 ==> [1.����(ü��,��ųȸ��)][2.���౸��][0.�ڷΰ���]
	 * 3) [2.���尣] �� �������� �Ҹ��� �������� ����� �� ���׷��̵� �����ش�. 
	 * 			    ==> [1.�����][2.����][0.�ڷΰ���]
	 * 4) [3.����] �� ���͸� ���� �������Ѵ�. ==> [1.����][2.��ų][3.����Ա�][0.�ڷΰ���]
	 * 			��ų�� 2�� ������ �Ѵ�.
	 * 			������ ������ ü���� ȸ���Ѵ�. 
	 * 			�¸��ϸ� ���� ȹ���Ѵ�. 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int ����ü�� = 1000;
		int �ִ�ü�� = 1000;
		int ���ݷ� = 10;
		int ���� = 10;
		int ���ళ�� = 0;
		int ��ų���� = 0;
		int ������ = 1000;
		int ���ⷹ�� = 0;
		int ������ = 0;
		
		int ��������ü�� = 100;
		int �����ִ�ü�� = 100;
		int ���Ͱ��ݷ� = 10;
		int ���͹��� = 10;
		int ���ͼ����� =100;
		boolean run = true;
		
		while(true) {
			System.out.println("[1.����] [2.���尣] [3.����][0.����]");
			int s = scan.nextInt();
			��������ü�� = �����ִ�ü��;
			if(s == 1) { // ����
				while(true) {
					System.out.println("[1.����(ü��,��ųȸ��)][2.���౸��][0.�ڷΰ���]");
					int s1 = scan.nextInt();
					int r1 = ran.nextInt(10)+1;
					int r2 = ran.nextInt(10)+1;
					if(s1 == 1) { // ����(ü��,��ųȸ��)
						if(������ < 1000) {
							System.out.println("���� �����մϴ�.");
						}
						else {
							������ -= 1000;
							if(����ü��+r1 <= �ִ�ü��) {
								����ü�� += r1;
								��ų���� += r2;
								System.out.println("ü�� " + r1 + " ���");
								System.out.println("��ų " + r2 + " ����");
								System.out.println("ü��" + ����ü�� + "/" + �ִ�ü��);
								System.out.println("��ų���� " + ��ų����);
							}
							else {
								��ų���� += r2;
								System.out.println("����ü���� �ִ�ġ�Դϴ�.");
								System.out.println("��ų " + r2 + " ����");
								System.out.println("��ų���� " + ��ų����);
								������ += 1000;
							}
							
						}
					}
					else if(s1 == 2) { // ���౸��
						System.out.println("������ " + ������);
						System.out.print("������ ���� : ");
						int c = scan.nextInt();
						if(c*100 > ������) {
							System.out.println("���� �����մϴ�.");
						}
						else {
							������ -= c*100;
							���ళ�� += c;
							System.out.println("������ " + ������);
							System.out.println("���ళ�� " + ���ళ��);
						}
					}
					else if(s1 == 0) { // �ڷΰ���
						break;
					}
					else {
						System.out.println("�ٽ� �Է�");
					}
				}
			}
			else if(s == 2) { // ���尣
				while(true) {
					System.out.println("[1.�����][2.����][0.�ڷΰ���]");
					int s2 = scan.nextInt();
					if(s2 == 1) { // �����
						while(true) {
							System.out.println("[1.��ȭ][0.�ڷΰ���]");
							System.out.println("������ " + ������);
							int ��ȭ = scan.nextInt();
							if(������ >= 500) {
								if(��ȭ == 1) {
									int ���� = ran.nextInt(10)+1;
									System.out.println(���� + "��");
									���ⷹ�� += ����;
									���ݷ� += ���ⷹ��*10;
									System.out.println("���ݷ� " + ���ⷹ��*10 + " ���");
									System.out.println("�÷��̾� ���ݷ� : " + ���ݷ�);
								}
								else if(��ȭ == 0) {
									break;
								}
								else {
									System.out.println("�ٽ� �Է�");
								}
							}
							else {
								System.out.println("��ȭ����");
								System.out.println("���� �����մϴ�.");
							}
						}
					}
					else if(s2 == 2) { // ����
						while(true) {
							System.out.println("[1.��ȭ][0.�ڷΰ���]");
							System.out.println("������ " + ������);
							int ��ȭ = scan.nextInt();
							if(������ >= 500) {
								if(��ȭ == 1) {
									int �� = ran.nextInt(10)+1;
									System.out.println(�� + "��");
									������ += ��;
									���� += ������*10;
									System.out.println("���� " + ������*10 + " ���");
									System.out.println("�÷��̾� ���� : " + ����);
								}
								else if(��ȭ == 0) {
									break;
								}
								else {
									System.out.println("�ٽ� �Է�");
								}
							}
							else {
								System.out.println("��ȭ����");
								System.out.println("���� �����մϴ�.");
							}
						}
					}
					else if(s2 == 0) { // �ڷΰ���
						break;
					}
					else {
						System.out.println("�ٽ� �Է�");
					}
				}
			}
			else if(s == 3) { // ����
				while(true) {
				 System.out.println("[1.����][2.��ų][3.����Ա�][0.�ڷΰ���]");
				 	if(��������ü�� > 0) {
				 		int s3 = scan.nextInt();
				 		if(s3 == 1) { // ����
				 			��������ü�� -= ���ݷ�/(���͹���/10);
				 			System.out.println("���Ϳ��� " + ���ݷ�/(���͹���/10) + " ����");
				 			System.out.println("����ü�� " + ��������ü�� + "/" + �����ִ�ü��);
				 			int �ݰ� = ran.nextInt(10)+1;
				 			if(�ݰ� == 5) {
				 				int ���� = ���Ͱ��ݷ�/(����/10);
				 				����ü�� -= ����;
				 				System.out.println(���� + " ����");
				 				System.out.println("ü��" + ����ü�� + "/" + �ִ�ü��);
				 			}
				 		}
				 		else if(s3 == 2) { // ��ų
				 			if(��ų���� > 0) {
				 				��ų���� -= 1;
				 				��������ü�� -= ���ݷ�*2/���͹���;
				 				System.out.println("���Ϳ��� " + ���ݷ�*2/���͹��� + " ����");
				 				System.out.println("����ü�� " + ��������ü�� + "/" + �����ִ�ü��);
				 			}
				 			else {
				 				System.out.println("��ų�� ����Ҽ� �����ϴ�.");
				 			}
				 			
				 		}
				 		else if(s3 == 3) { // ����Ա�
				 			if(���ళ�� > 0) {
				 				if(����ü��+20 < �ִ�ü��) {
				 					����ü�� = �ִ�ü��;
				 				}
				 				else {
				 				���ళ�� -= 1;
				 				����ü�� += 20;
				 				System.out.println("ü��ȸ��");
				 				System.out.println("ü��" + ����ü�� + "/" + �ִ�ü��);
				 				}
				 			}
				 		}
				 		else if(s3 == 0) { // �ڷΰ���
				 			break;
				 		}
				 		else {
				 			System.out.println("�ٽ� �Է�");
				 		}
				 	}
				 	else if(��������ü�� <= 0){
				 		System.out.println("���� ó��!!!");
				 		������ += ���ͼ�����;
				 		System.out.println(���ͼ����� + " ��� ȹ��");
				 		break;
				 	}
				}
			}
			else if(s == 0) { // ����
				System.out.println("���� ����");
				break;
			}
			else {
				System.out.println("�ٽ� ����");
			}
		}
	}
}
package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_������_���� {
	/*
	 * 
	 * [������ ���]
	 * 1. 5�� �ֹ��� �޴´�.
	 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
	 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
	 * 
	 * ��)
	 * �޴� ���� : 1
	 * �޴� ���� : 1
	 * �޴� ���� : 2
	 * �޴� ���� : 2
	 * �޴� ���� : 3
	 * �� �ݾ� = 31300��
	 * ���� �Է� : 32000
	 * === �Ե����� ������ ===
	 * 1. �Ұ�� ���� : 2��
	 * 2. ����    ���� : 2��
	 * 3. ��         �� : 1��
	 * 4. ��   ��   �� : 31300��
	 * 5. ��         �� : 700��
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		int sum =0;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i=1; i<=5; i++) {
			System.out.print("�޴� ���� : ");
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
				System.out.println("[1.���ֹ�][2.�ֹ�����]");
				s = scan.nextInt();
				if(s == 1) {
					i--;
				}
				else {
					break;
				}
			}
		}
		System.out.print("���� �Է� : ");
		int money = scan.nextInt();
		if(money > sum) {
		System.out.printf("=== �Ե����� ������ ===\n1. �Ұ�� ���� : %d��\n2. ����    ���� : %d��\n3. ��         �� : %d��\n4. ��   ��   �� : %d��\n5. ��         �� : %d��",c1,c2,c3,sum,money-sum);
		}
		else {
			System.out.printf("=== �Ե����� ������ ===\n1. �Ұ�� ���� : %d��\n2. ����    ���� : %d��\n3. ��         �� : %d��\n4. ��   ��   �� : %d��\n5. ��         �� : %d��",c1,c2,c3,sum,sum-money);
			System.out.println(sum - money + "�� ����");
		}
	}

}
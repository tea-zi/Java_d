package D3_�ݺ���3_������Ʈ;

import java.util.Scanner;

public class �ݺ���3_������Ʈ_�ݺ����α���_���� {
	/*
	 * 1. �α��� . �α��� �� �� �α��� �Ұ� . �α׾ƿ� ���¿����� �̿� ���� 
	 * 2. �α׾ƿ� . �α��� �� �̿밡��
	 * 3. �α���,�α׾ƿ� ������ log �� ������ �̿��Ѵ�.
	 *  [��] -1(�α׾ƿ�), 1111(id1), 2222(id2)
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int id1 = 1111;
		int pw1 = 1234;
		int id2 = 2222;
		int pw2 = 2345;
		int log = -1; // -1(�α׾ƿ�), 1111(id1), 2222(id2)
		int i = 1;
		while(i==1) {
			System.out.println("[1.�α���][2.�α׾ƿ�]");
			int s = scan.nextInt();
			if(s == 1) {
				if(log == -1) {
					System.out.print("���̵� �Է� : ");
					int Id = scan.nextInt();
					System.out.print("��й�ȣ �Է� : ");
					int Pw = scan.nextInt();
					if(id1 == Id && pw1 == Pw) {
						log = id1;
					}
					else if(id2 == Id && pw2 == Pw) {
						log = id2;
					}
					else {
						System.out.println("�߸��� �����Դϴ�.");
					}
					System.out.println(log + "�� �α���");
				}
				else {
					System.out.println("�α��� �����Դϴ�.");
				}
			}
			else if(s == 2){
				if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ�");
				}
				else {
					System.out.println("�α��� ������ �����ϴ�.");
				}
			}
			else {
				System.out.println("�߸��� �����Դϴ�. �ý��� �����մϴ�.");
				break;
			}
		}
	}
}

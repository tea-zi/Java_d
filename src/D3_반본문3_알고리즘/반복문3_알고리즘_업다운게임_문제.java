package D3_�ݺ���3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_�˰���_���ٿ����_���� {
	/*
	 *  [Up & Down ����]
	 * 1. com �� �������� 1~100���̸� �����Ѵ�.
	 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
	 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , 
	 * 	  com �������� "�۴�" ��Ʈ���� 
	 * 4. ������ ���߸� ������ ����ȴ�.
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int com = ran.nextInt(100)+1;
		System.out.println(com);
		
		for(int i=0; i==0;) {
			System.out.print("���� �Է� : ");
			int me = scan.nextInt();
			if(com>me) {
				System.out.println("ũ��");
			}
			else if(com<me) {
				System.out.println("�۴�");
			}
			else {
				System.out.println("����");
				break;
			}
		}
		

	
	}

}
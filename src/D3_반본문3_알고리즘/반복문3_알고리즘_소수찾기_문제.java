package D3_�ݺ���3_�˰���;

import java.util.Scanner;

public class �ݺ���3_�˰���_�Ҽ�ã��_���� {
	
	/*
	 * 	[�Ҽ�ã��]
	 * 
	 *  ���� �� ���� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��Ѵ�.
	 *  �Ҽ���, 1�� �ڱ��ڽ����θ� �������� ��
	 *  ��) 2, 3, 5, 7, 11, 13, ..
	 
		
	 * (1) �ش� ���ڸ� 1���� �ڱ��ڽű��� ������.
	 * (2) �������� 0�� ������ ī��Ʈ�� ����.
	 * (3) �� ī��Ʈ ���� 2�̸� �Ҽ��̴�.
	 * (4) 6/1 6/2 6/3 6/4 6/5 6/6	==> count=4	==> (�Ҽ�x)
	 * (4) 2/1 2/2 	==> count=2	==>(�Ҽ�)
	 * 
	 *
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�");
		int num = scan.nextInt();
		int c = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("�Ҽ��̴�.");
		}
		else {
		System.out.println("�Ҽ��� �ƴϴ�");
		}		
	}

}
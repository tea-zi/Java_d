package D3_�ݺ���3_�⺻�̷�;

public class �ݺ���3_�⺻�̷�2_����1 {
	/*
		 for �� ����ؼ� Ǯ��� 		
		 ���� 1) 1���� 5���� ����Ͻÿ�.
		 ���� 1) 1, 2, 3, 4, 5
		 
		 ���� 2) 1���� 10���� �ݺ���, 5~9���� ����Ͻÿ�.
		 ���� 2) 5, 6, 7, 8, 9
		 
		 ���� 3) 1���� 10���� �ݺ��� 6~3���� ����Ͻÿ�.
		 ���� 3) 6, 5, 4, 3
		 
		 ���� 4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ����Ͻÿ�.
		 ���� 4) 1, 2, 7, 8, 9, 10
	*/
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			if(i>=5 && i<10) {
				System.out.print(i);
			}
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			if(i>3 && i<8) {
				System.out.print(10-i);
			}
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			if(i<3 || i>=7) {
				System.out.print(i);
			}
		}
	}

}
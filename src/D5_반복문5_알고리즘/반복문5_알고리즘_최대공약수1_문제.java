package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����1_���� {
	/*
	[����] 
		6�� 8�� ������� ��� ���
		 ������� ���μ��� �����ξ���� ���Ѵ�.
		 ��)    
		 	6 �Ǿ���� 1, 2, 3, 6 �̴�.
		    8 �Ǿ���� 1, 2, 4, 8 �̴�.		    
		 6�� 8�� �������  1, 2 �̴�.
		 6�� 8�� �ִ������� 2 �̴�.
*/
	public static void main(String[] args) {
		int a = 6;
		int b = 8;
		int max = 0;
		int num = 1;
		
		System.out.print("6�� 8�� ����� : ");
		while(true) {
			if(a%num == 0 && b%num == 0) {
				System.out.print(num + "  ");
				max = num;
			}
			if(num>a || num>b) {
				break;
			}
			num++;
		}
		System.out.println("6�� 8�� �ִ����� : " + max);
	
		
	

	
	}
}
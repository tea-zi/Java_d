package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�����1_���� {
	/*
	 * [����]
	   		105�� 63�� 175�� ������� ���Ͻÿ�
	 */
	public static void main(String[] args) {
		int a = 105;
		int b = 63;
		int c = 175;
		int num = 1;
		
		while(true) {
			if(num > a || num > b || num > c) {
				break;
			}
			if(a%num == 0 && b%num == 0 && c%num == 0) {
				System.out.print(num +" ");
			}
			num++;
		}
		
	}
}
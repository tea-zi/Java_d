package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����1_���� {
	/*
		[����]
		  8 �� 12 �� �ּ� ������� ���Ͻÿ�
			 �ּ� ������� �� ���� ����� �����Ѵ��� ó������ �������ڸ� ���Ѵ�.
			 ��) 8 16 24... 
			 ��) 12 24....
			 ���⼭ 24�� �ּҰ�����̴�.
	*/
	public static void main(String[] args) {
		int a = 8;
		int b = 12;
		int num = b;
		int min = 0;
		
		while(true) {
			if(num%a == 0 && num%b == 0) {
				min = num;
				break;
			}
			num++;
		}
		System.out.println("8�� 12�� �ּҰ���� : "+min);
		
		int n1 = a;
		int n2 = b;
		
		for(int run = 1; run == 1; ) {
			if(n1 == n2) {
				System.out.println(n1 + " " + n2);
				run = 0;
			}else if(n1 < n2) {
				n1 += a;
			}else {
				n2 += b;
			}		
		}// ȿ���� ���� 
	}
}
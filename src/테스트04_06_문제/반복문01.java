package �׽�Ʈ04_06_����;

public class �ݺ���01 {
	public static void main(String[] args) {
		/*
		 
	[����]
		[1] 1~150 ������ 18�� ����� ���� ����Ѵ�.
		[2] 50 ~ 100�� ����� ���ڴ�� "���" ���  
	[����]
		18 36 ��� ��� ��� 108 126 144
		 */
		for(int i=1; i<=150; i++) {
			if(i%18 == 0) {
				if(i>=50 && i<=100) {
					System.out.print("��� ");
				}
				else {
					System.out.print(i + " ");
				}
			}
		}
	}
}
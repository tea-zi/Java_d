package �׽�Ʈ04_01_����;
/*
	[����] 
		[1] 48�� ����� �����ڸ��� 2~6������ ���� ����Ͻÿ�.
		[2] �� ������ ����� ������ ����Ͻÿ�.
	[����]
		2 3 4 6 12 16 24 
		�Ǽ��� ���� : 7��
 */
public class �ݺ���3_����02_��������ڸ� {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<=48; i++) {
			if(48%i == 0) {
				if(i%10 >=2 && i%10 <= 6) {
					System.out.print(i + " ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
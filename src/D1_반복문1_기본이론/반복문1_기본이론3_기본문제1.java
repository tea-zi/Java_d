package D1_�ݺ���1_�⺻�̷�;

public class �ݺ���1_�⺻�̷�3_�⺻����1 {
	/*
     [����1] 1~10���� �ݺ��� 5~9 ���
	 [����1] 5, 6, 7, 8, 9

	 [����2] 10~1���� �ݺ��� 6~3 �Ųٷ� ���
	 [����2] 6, 5, 4, 3

	 [����3] 1~10���� �ݺ��� ¦���� ���
	 [����3] 2, 4, 6, 8, 10

*/
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i<=9 && i>=5) {
				if(i !=9) {
				System.out.print(i + ", ");
				}
				else
					System.out.println(i);
			}
			i++;	
		} //���� 1
		System.out.println(i);
		i=10;
		while(i>=1) {
			if(i<=6 && i>=3) {
				if(i !=3) {
				System.out.print(i + ", ");
				}
				else
					System.out.println(i);
			}
			i--;
		} //����2
		System.out.println(i);
		i=1;
		while(i<=10) {
			if(i%2==0) {
				if(i !=10) {
					System.out.print(i + ", ");
				}
				else {
					System.out.println(i);
				}
			}
			i++;
		} // ����3
		
	}
}
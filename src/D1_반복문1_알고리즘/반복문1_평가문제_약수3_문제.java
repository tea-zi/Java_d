package D1_�ݺ���1_�˰���;

public class �ݺ���1_�򰡹���_���3_���� {
	/*
	 * [����] 24�� ����߿��� 4�� ���������Ͻÿ�.
	 */
	public static void main(String[] args) {
		int i=1;
		while(i<=24) {
			if(i%4==0 && 24%i==0) {
				System.out.print(i + " ");
				i++;
			}
			i++;
		}
	
	}
}
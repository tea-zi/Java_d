package D1_�ݺ���1_�˰���;

public class �ݺ���1_�򰡹���_���2_���� {
	/*
	 * [����]
	 *  18�� ����� ���� ���ϱ�  21�� ����� ������ ����Ͻÿ�.
	 */
	public static void main(String[] args) {
		int i=1;
		int a=0;
		int c1=0;
		int c2=0;
		
		while(i<=21) {
			if(21%i==0) {
				c1++;
			}
			if(18%i==0) {
				c2++;
			}
			i++;
		}
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("�� : " + (c1+c2));
	
	}
}
package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���ڸ���_���� {
	
	/*
	 * [����]
	 *  28�� ��� �߿��� ���� ū ���ڸ� ���� ����Ͻÿ�.
	 *  �� : 980 
	 */
	public static void main(String[] args) {
		int i = 0;
		int max=0;
		while(i<1000) {
			max=i;
			i=i+28;
		}
		System.out.println(max);
		max=0;
		i=1;
		int c=0;
		while(i==1) {
			if(c<1000 && c>=100) {
				if(c%28==0) {
					max=c;
					c++;
				}
				else {
					c++;
				}
			}
			else if(c<100) {
				c++;
			}
			else {
				i=0;
			}
		}
		System.out.println(max);

	}
}
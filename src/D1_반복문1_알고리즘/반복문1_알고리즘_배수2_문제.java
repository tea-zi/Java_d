package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���2_���� {
	/*
	 * [����]
	 *  8�� ����� ���������� 4�� ����Ͻÿ�. 
	 *  �� : 0,8,16,24
	 */
	
	public static void main(String[] args) {
		int i=1;
		int c=0;
	// 1
		while(i==1) {
			if(c==4) {
				i=0;
			}
			else {
				System.out.print(c*8 + " ");
			}
			c++;
		}
	// 2
		while(i<4) {
			System.out.print(i*8 + " ");
			i++;
		}
	// 3
		int num = 8;		
		int count = 0;
		i = 0;
		int run = 1;		
		while(run == 1) {
			if(i % num == 0) {
				System.out.print(i);
				count = count + 1;
				if(count == 4) {
					run = 0;
				}
			}
			i = i + 1;
		}
			
	}
}
package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���1_���� {
	/*
	 * [����] 
	 * 	7�� �����  150���� �������� ����ū�� ����Ͻÿ�. (� ���� ����� �� ���� ������ ���� ���̴�.) 
	 *  �� : 147
	 */
	public static void main(String[] args) {
		int max = 0;
		int i = 1;
		
		while(i<150) {
			if(i%7==0) {
				max=i;
			}
			i++;
		}
		System.out.println(max);
		/*
		 * int num = 7;
		int result = 0;
		
		int i = 1;
		while(i == 1) {
			if(num >= 150) {
				i = 0;
			}
			else {
				result = num;
				num += 7;
			}
		}
		System.out.println(result);
		���� �ĺ��� �� �ݺ��ϴ� ��
		 */
	}
}
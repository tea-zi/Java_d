package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����2_���� {
	/*
		[����] 
			���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� �������
	  	  	�Ȱ��� ������ �ַ����մϴ�. ������ ������ �ټ��ִ��� ����Ͻÿ�.
	 */
	public static void main(String[] args) {
		int a = 42;
		int b = 28;
		int num = 1;
		int max = 0;
		for(int i=1; i==1;) {
			if(a%num == 0 && b%num==0) {
				max = num;
				System.out.println(num);
			}
			if(num>a || num>b) {
				break;
			}
			num++;
		}
		System.out.println("�ִ��� �����ټ� �ִ� �л��� : "+max);
	}
}
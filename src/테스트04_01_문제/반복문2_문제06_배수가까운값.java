package �׽�Ʈ04_01_����;
/*
	[����] 
  		6�� ����� ���������� �˻��Ѵ�. 
  		6����� 100�� ���尡��� ���� ��� �Ͻÿ�.
 	[����]
 		102
*/
public class �ݺ���2_����06_������� {
	public static void main(String[] args) {	
		int min = 0;
		for(int i=6; i<200; i++) {
			if(i%6 == 0) {
				int cha = i-100;
				int cha1 = min -100;
				if(cha < 0) {
					cha *=-1;
				}
				if(cha1 < 0) {
					cha1 *= -1;
				}
				if(cha1 > cha) {
					min = i;
				}
			}
		}
		System.out.println(min);
	}
}
package D4_�ݺ���4_�˰���;

public class �ݺ���4_�˰���_369�ڼ�_���� {
	/* 
	 *  [369����]
	 * 1. 1~50���� �ݺ��� �Ѵ�.
	 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
	 * 
	 * 3. ������ ���ڿ� 3�̳� 6�̳� 9�� �ΰ� �� "¦¦"
	 * 4. ������ ���ڿ� 3�̳� 6�̳� 9�� �Ѱ� �� "¦"
	 * 5. 3�̳� 6�̳� 9�� ������ �׳� ������� 
	 * 
	 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
	 */
	public static void main(String[] args) {
		int ten = 0;
		int one = 0;
		for(int i=1; i<=50; i++) {
			ten = i/10;
			one = i%10;
			if(ten == 3 || ten == 6 || ten == 9) {
				if(one == 3 || one == 6 || one == 9) {
					System.out.print("¦¦");
				}
				else {
					System.out.print("¦");
				}
			}
			else {
				if(one == 3 || one == 6 || one == 9) {
					System.out.print("¦");
				}
				else {
					System.out.print(i);
				}

			}
			System.out.println();
		}
		
		int i = 1;
		while(i <= 999) {
			int a = i / 100;
			int b = i % 100 / 10;
			int c = i % 10;
			int count = 0;
			if(a == 3 || a == 6 || a == 9) {
				count += 1;
			}
			if(b == 3 || b == 6 || b == 9) {
				count += 1;
			}
			if(c == 3 || c == 6 || c == 9) {
				count += 1;
			}
			if(count == 3) {
				System.out.println("¦¦¦");
			}else if(count == 2) {
				System.out.println("¦¦");
			}else if(count == 1) {
				System.out.println("¦");
			}else {
				System.out.println(i);
			}
			i = i + 1;
		}
		//count�� �̿��Ͽ� ���ǽ��� ��������
		
	}

}
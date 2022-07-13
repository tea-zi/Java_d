package 테스트04_06_문제;

public class _반복문01 {
	public static void main(String[] args) {
//		 	아래와 같이 출력하시오.	 	
//		 	0	1
//		 	1	2
//		 	2	3
//		 	3	4
//		 	4	5	
//		 	5	5		
//		 	6	4
//		 	7	3	
//		 	8	2
//		 	9	1
//		 	0	1
//		 	1	2	
//		 	2	3
//		 	3	4
//		 	4	5
//		 	5	5
//		 	6	4
//		 	7	3
//		 	8	2
//		 	9	1
		int a = 0;
		int b = 1;
		int c = 5;
		boolean check = false;
//		for (int i = 0; i < 20; i++) {
//			System.out.print(a + " ");
//			a++;
//			if (a == 10) {
//				a = 0;
//			}
//			if (check == false) {
//				System.out.println(b);
//				b++;
//				c = 5;
//			} else {
//				System.out.println(c);
//				c--;
//				b = 1;
//			}
//			if (b == 6) {
//				check = true;
//			}
//			if (c == 0) {
//				check = false;
//			}
//		}

		b = 0;
		for (int i = 0; i < 20; i++) {
			System.out.print(a + " ");
			a++;
			if (a == 10) {
				a = 0;
			}
			if (check == false) {
				b++;
			} else {
				b--;
			}
			System.out.println(b);
			if (b == 6) {
				check = true;
			}
			if (b == 1) {
				check = false;
			}
		}
	}
}
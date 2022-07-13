package D4_반본문4_알고리즘;

public class 반복문4_알고리즘_369박수_문제 {
	/* 
	 *  [369게임]
	 * 1. 1~50까지 반복을 한다.
	 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
	 * 
	 * 3. 각각의 숫자에 3이나 6이나 9가 두개 면 "짝짝"
	 * 4. 각각의 숫자에 3이나 6이나 9가 한개 면 "짝"
	 * 5. 3이나 6이나 9가 없으면 그냥 숫자출력 
	 * 
	 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
	 */
	public static void main(String[] args) {
		int ten = 0;
		int one = 0;
		for(int i=1; i<=50; i++) {
			ten = i/10;
			one = i%10;
			if(ten == 3 || ten == 6 || ten == 9) {
				if(one == 3 || one == 6 || one == 9) {
					System.out.print("짝짝");
				}
				else {
					System.out.print("짝");
				}
			}
			else {
				if(one == 3 || one == 6 || one == 9) {
					System.out.print("짝");
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
				System.out.println("짝짝짝");
			}else if(count == 2) {
				System.out.println("짝짝");
			}else if(count == 1) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
			i = i + 1;
		}
		//count를 이용하여 조건식이 간단해짐
		
	}

}
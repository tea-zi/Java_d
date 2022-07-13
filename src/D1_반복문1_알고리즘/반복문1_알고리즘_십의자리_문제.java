package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_십의자리_문제 {	
	/*
	 * [문제]
	 *  9의 배수중 십의 자리가 6인 첫번째 배수 출력하시오.
	 *  답 : 63
	 */
	public static void main(String[] args) {
		int i=1;
		int num=0;
		while(i==1) {
			if(num%9==0 && num/10==6) {
				System.out.println(num);
				i=0;
			}
			num++;
		}

	}
}
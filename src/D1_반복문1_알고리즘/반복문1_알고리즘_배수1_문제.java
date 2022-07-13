package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수1_문제 {
	/*
	 * [문제] 
	 * 	7의 배수중  150보다 작은수중 가장큰수 출력하시오. (어떤 수의 배수는 그 수에 정수를 곱한 수이다.) 
	 *  답 : 147
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
		위에 식보다 덜 반복하는 식
		 */
	}
}
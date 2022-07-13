package D1_반복문1_알고리즘;

public class 반복문1_평가문제_약수3_문제 {
	/*
	 * [문제] 24의 약수중에서 4의 배수만출력하시오.
	 */
	public static void main(String[] args) {
		int i=1;
		while(i<=24) {
			if(i%4==0 && 24%i==0) {
				System.out.print(i + " ");
				i++;
			}
			i++;
		}
	
	}
}
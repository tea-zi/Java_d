package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_공배수1_문제 {
	/*
	  
	  	[문제]
	   		12와 15의 공배수를 작은것부터 순서대로 5개만 출력 
	 */
	public static void main(String[] args) {
		int a = 12;
		int b = 15;
		int num = 1;
		int count = 0;
		while(true) {
			if(num%a == 0 && num%b == 0) {
				System.out.print(num + " ");
				count++;
			}
			if(count == 5) {
				System.out.println();
				break;
			}
			num++;
		}
		//1부터 순차적으로 12와 15로 나눠지는지 확인하는 식
	
		int num1 = a;
		int num2 = b;
		for(int i = 1; i == 1;) {
			if(num1 < num2) {
				num1 += a;
			}else if(num2 < num1) {
				num2 += b;
			}else if(num1 == num2) {
				System.out.println(num1);
				i = 0;
			}
			
		}
		//12와 15을 증가시키면서 비교하며 공배수 찾는 식
	}
}
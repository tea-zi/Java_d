package D1_반복문1_기본이론;

public class 반복문1_기본이론3_기본문제3 {
	/*
	 [문제1] 1~10까지 중에서 3미만 7이상의 합을 출력하시오.
	       1 + 2 + 7 + 8 + 9 + 10
	 [정답1] 37

	 [문제2] 1~10까지 중에서 3미만 7이상의 개수를 출력하시오. 
			 1,2,7,8,9,10 ==> 6개 
	 [정답2] 6
	*/
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10) {
			if(i<3 || i>=7) {
				sum=sum+i;
				if(i!=10) {
				System.out.print(i + " + ");
				}
				else {
					System.out.print(i + " = ");
				}
			}
			i++;
		}
		System.out.println(sum);
		int c=0;
		i=1;
		while(i<=10) {
			if(i<3 || i>=7) {
				c++;
			}
			i++;
		}
		System.out.println(c + "개");
		/* 문제가 따로 있어서 따로 나누어 풀었지만 하나로 합치는것도 가능 
		 * while(i <= 10) {
			if(i < 3 || i >= 7) {
				c = c + 1;
				sum = sum + i;
				System.out.println(i);
			}
			i = i + 1;
		}
		*/
	
	}
}
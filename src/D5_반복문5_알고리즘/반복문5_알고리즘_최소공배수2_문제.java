package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수2_문제 {
	/*
	 * [문제]
	   	철수와 민수는 같은 수영장에 다닌다
	   	철수는 4일마다 한번씩 가고 민수는 5일만다한번씩 간다.
	   	철수와 민수가 2월 3일날 처음만났다면 다음에 서로 만나는 날은 언제인가?
	 */
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int n1 = a;
		int n2 = b;
		
		while(true) {
			if(n1 == n2) {
				break;
			}
			else if(n1>n2) {
				n2 +=b;
			}
			else {
				n1 +=a;
			}
		}
		System.out.println("철수와 민수는 "+ n1 +"일 뒤에 만난다");
	}
}
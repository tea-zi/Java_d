package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수3_문제 {
	/*
	   	[문제] 
	   		자전거로 운동장을 한바퀴도는데 철수는 90초 , 영희 는 60초 , 민수는 45초가 걸립니다.
	   		이와같은 속력으로 같은곳에서 동시에 출발하여 같은 방향으로 운동장을 돌때, 
	   		1) 세사람이 처음으로 출발점에서 다시만나게되는것은 몇초뒤입니까?
	   		2) 다시만다게되었을때 민수는 몇바퀴 돌았을때입니까?  		
	 */
	public static void main(String[] args) {
		int a = 90;
		int b = 60;
		int c = 45;
		int n1 = a;
		int n2 = b;
		int n3 = c;
		
		while(true) {
			if(n1 == n2 && n1 == n3 && n2 == n3) {
				break;
			}
			else if(n1 > n2 || n2 < n3) {
				n2 += b;
			}
			else if(n1 >  n3 || n2 > n3) {
				n3 += c;
			}
			else {
				n1 += a;
			}
		}
		System.out.println(n1);
		System.out.println(n1/c);
	}	
}

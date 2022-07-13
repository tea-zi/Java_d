package D3_반복문3_기본이론;

public class 반복문3_기본이론6_for무한 {
	/*
	 * [1]초기식, [2]조건식, [3]증감식 중에서 [3]증감식을 적지않으면 무한반복이된다.
	 */
	public static void main(String[] args) {
		
		int n = 0;
		for(int i = 0; i == 0;) {
			System.out.println(n);
			if(n >= 10) {
				break;
				//i = 1;
			}
			n += 1;
		}
	}
}
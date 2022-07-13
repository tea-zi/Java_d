package 테스트04_01_문제;
/*
	[문제] 
  		6의 배수를 순차적으로 검사한다. 
  		6배수중 100에 가장가까운 수를 출력 하시오.
 	[정답]
 		102
*/
public class 반복문2_문제06_배수가까운값 {
	public static void main(String[] args) {	
		int min = 0;
		for(int i=6; i<200; i++) {
			if(i%6 == 0) {
				int cha = i-100;
				int cha1 = min -100;
				if(cha < 0) {
					cha *=-1;
				}
				if(cha1 < 0) {
					cha1 *= -1;
				}
				if(cha1 > cha) {
					min = i;
				}
			}
		}
		System.out.println(min);
	}
}
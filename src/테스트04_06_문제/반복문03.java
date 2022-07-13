package 테스트04_06_문제;

public class 반복문03 {
	public static void main(String[] args) {
		/*
		 
		  	철수는 운동장을 한바퀴도는데 15분 걸리고,
		  	민수는 운동장을 한바퀴도는데 30분 걸리고,
		  	영희는 운동장을 한바퀴도는데 18분 이 걸린다. 
		  	
		  	[1] 오후 3시에 운동장에서 동시에 출발했다면 두번째 만나는 시간은 언제인가?
                  180분뒤
		 	[2] 위 조건일때 철수는 몇바퀴 완주했는지 출력하시오. 
                  12바퀴

		 */
		int a = 15;
		int b = 30;
		int c = 18;
		int 철수 = a;
		int 민수 = b;
		int 영희 = c;
		int i=0;
		while(true) {
			i++;
			if(철수 == 민수 && 민수 == 영희) {
				System.out.println(철수);
				break;
			}
			else if(철수 < 민수 || 철수 < 영희) {
				철수 += a;
			}
			else if(민수 < 철수 || 민수 <영희) {
				민수 += b;
			}
			else if(영희 < 철수 || 영희 <민수) {
				영희 += c;
			}
		}
		System.out.println("두번째 만나는 시간 : " + 철수*2);
		System.out.println("180분동안 철수가 완주한 바퀴수 : " + 철수*2/a);
	}
}
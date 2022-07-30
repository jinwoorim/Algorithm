package DynamicProgramming;

public class LastProblemClass {

	// 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 다음과 같이 총 7가지가 있음 - 정수 n이 입력으로 주어졌을 때, n을 1, 2, 3의 합으로 나타낼 수 있는 방법의 수를 구하시오
	// 재귀용법으로 풀어보기
//	public int recursiveCall(int data) {
//		if(data == 1) {
//			return 1;
//		}
//		else if(data == 2) {
//			return 2;
//		}
//		else if(data == 3) {
//			return 4;
//		}
//		else {
//			return this.recursiveCall(data-1) + this.recursiveCall(data-2) + this.recursiveCall(data-3);
//		}
//	}
	
	
	// 동적계획법으로 풀어보기(재귀용법보다 속도가 빠름. 데이터를 저장하고 불러오기만 하기때문에)
	public int dynamic(int data) {
		int[] cache = new int[data];
		cache[0] = 1;
		cache[1] = 2;
		cache[2] = 4;
		
		for (int i = 3; i < data; i++) {
			cache[i] = cache[i-1] + cache[i-2] + cache[i-3];
		}
		return cache[data-1];
	}
	
}

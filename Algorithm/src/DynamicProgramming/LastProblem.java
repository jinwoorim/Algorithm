package DynamicProgramming;

public class LastProblem {

	public static void main(String[] args) {

		// 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 다음과 같이 총 7가지가 있음 - 정수 n이 입력으로 주어졌을 때, n을 1, 2, 3의 합으로 나타낼 수 있는 방법의 수를 구하시오
		// 재귀용법으로 풀어보기
//		LastProblemClass lastProblemClass = new LastProblemClass();
//		System.out.println(lastProblemClass.recursiveCall(3));
		
		
		// 동적 계획법으로 풀어보기
		LastProblemClass lastProblemClass = new LastProblemClass();
		System.out.println(lastProblemClass.dynamic(5));
	}

}

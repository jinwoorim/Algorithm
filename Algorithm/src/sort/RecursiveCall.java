package sort;

import java.util.ArrayList;

public class RecursiveCall {

	public static void main(String[] args) {

		// RecursiveCall(재귀 호출) : 재귀용법이란 함수 안에서 동일한 함수를 호출하는 형태
		// 단순히 숫자가 주어졌을 때 , 숫자의 factorial을 리턴하는 코드
//		RecursiveCallFactorial recursiveCallFactorial = new RecursiveCallFactorial();
//		System.out.println(recursiveCallFactorial.factorial(5)); // 5*4*3*2*1 = 120
		
		
		// 숫자가 들어 있는 배열이 주어졌을 때, 배열의 합을 리턴하는 코드
//		ArrayList<Integer> testData = new ArrayList<>();
//		for (int data = 1; data < 5; data++) {
//		    testData.add(data);
//		}		
//		RecursiveCallFactorial recursiveCallFactorial = new RecursiveCallFactorial();
//		System.out.println(recursiveCallFactorial.factorial(testData));
		
		
		// 숫자가 들어 있는 배열이 주어졌을 때, 배열의 곱을 리턴하는 코드
//		ArrayList<Integer> testData = new ArrayList<>();
//		for (int data = 1; data < 5; data++) {
//		    testData.add(data);
//		}
//		RecursiveCallFactorial recursiveCallFactorial = new RecursiveCallFactorial();
//		System.out.println(recursiveCallFactorial.factorial(testData));
		
		
		// 정수 1을 1,2,3의 조합으로 나타내는 방법은 총 1가지이다
		// 정수 2을 1,2,3의 조합으로 나타내는 방법은 총 2가지이다
		// 정수 3을 1,2,3의 조합으로 나타내는 방법은 총 4가지이다
		// 정수 4을 1,2,3의 조합으로 나타내는 방법은 총 7가지이다
		// 정수 5를 1,2,3의 조합으로 나타내는 방법은 총 13가지이다 
		// 즉, 정수 n을 만들수 있는 경우의 수를 리턴하는 함수를 f(n)이라하면 f(n-1) + f(n-2) + f(n-3)을 리턴
		RecursiveCallFactorial recursiveCallFactorial = new RecursiveCallFactorial();
		System.out.println(recursiveCallFactorial.factorial(5));
	}

}

package DynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {

		// 피보나치 수열이란 F(0) = 0, F(1) = 1, F(N) = F(N-1) + F(N-2)
//		fibonacci(0):0
//		fibonacci(1):1
//		fibonacci(2):1
//		fibonacci(3):2
//		fibonacci(4):3
//		fibonacci(5):5
//		fibonacci(6):8
//		fibonacci(7):13
//		fibonacci(8):21
//		fibonacci(9):34
		
		// recursive call(재귀용법) 활용
//		FibonacciClass fibonacciClass = new FibonacciClass();
//		System.out.println(fibonacciClass.factorial(10) ); // 55
		
		
		// 동적 계획법 활용
		FibonacciClass fibonacciClass = new FibonacciClass();
		System.out.println(fibonacciClass.dynamic(10));
	}

}

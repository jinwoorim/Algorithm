package DynamicProgramming;

public class FibonacciClass {
	
	// recursive call(재귀용법) 활용
//	public int factorial(int data) {
//		if(data <= 1) {
//			return data;
//		}
//		else {
//			return this.factorial(data-1) + this.factorial(data-2); 
//		}
//	}
	
	
	// 동적 계획법 활용
	public int dynamic(int data) {
		int[] cache = new int[data+1];
		cache[0] = 0;
		cache[1] = 1;
		for (int i = 2; i < data+1; i++) {
			cache[i] = cache[i-1] + cache[i-2];
		}
		return cache[data];
	}
}

package sort;

import java.util.ArrayList;

public class RecursiveCallFactorial {

	// 단순히 숫자가 주어졌을 때 , 숫자의 factorial을 리턴하는 코드
//	public int factorial(int n) {
//		if(n>1) {
//			return n * this.factorial(n-1);
//		}
//		else {
//			return 1;
//		}
//	}
	
	
	// 숫자가 들어 있는 배열이 주어졌을 때, 배열의 합을 리턴하는 코드
//	 public int factorial(ArrayList<Integer> dataList) {
//	     if (dataList.size() <= 0) {
//	         return 0;
//	     }
//	     return dataList.get(0) + this.factorial(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
//	 }
	
	
	// 숫자가 들어 있는 배열이 주어졌을 때, 배열의 곱을 리턴하는 코드
//	public int factorial(ArrayList<Integer> datalist){
//		if(datalist.size() <= 1) {
//			return 1;
//		}
//		else {			
//			return datalist.remove(datalist.size()-1) * this.factorial(new ArrayList<Integer>(datalist));
//		}
//	}
	
	
	// 정수 1을 1,2,3의 조합으로 나타내는 방법은 총 1가지이다
	// 정수 2을 1,2,3의 조합으로 나타내는 방법은 총 2가지이다
	// 정수 3을 1,2,3의 조합으로 나타내는 방법은 총 4가지이다
	// 정수 4을 1,2,3의 조합으로 나타내는 방법은 총 7가지이다
	// 정수 5를 1,2,3의 조합으로 나타내는 방법은 총 13가지이다 
	// 즉, 정수 n을 만들수 있는 경우의 수를 리턴하는 함수를 f(n)이라하면 f(n-1) + f(n-2) + f(n-3)을 리턴
	public int factorial(int data) {
	       if (data == 1) {
	            return 1;
	        } else if (data == 2) {
	            return 2;
	        } else if (data == 3) {
	            return 4;
	        }
	        return this.factorial(data - 1) + this.factorial(data - 2) + this.factorial(data - 3);
	    }
}

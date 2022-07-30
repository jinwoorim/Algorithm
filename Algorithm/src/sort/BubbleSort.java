package sort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {

		// 데이터가 두 개 일 때 버블 정렬 알고리즘
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(2);
//		list.add(1);
//		if(list.get(1) < list.get(0)) {
//			Collections.swap(list, 0, 1);
//		}
//		System.out.println(list);
		
//		// 데이터가 여러 개 일 때 버블 정렬 알고리즘
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(9);
//		list.add(3);
//		list.add(2);
//		list.add(1);
//		
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = 0; j < list.size()-1; j++) {
//				if(list.get(j) > list.get(j+1)) {
//					Collections.swap(list, j, j+1);
//				}
//			}
//		System.out.println(list);
//		}
		
//		// 데이터가 정렬이 되면 더 이상 for문을 돌리지 않기(bl = false로두고 정렬과정에서 swap이 한번도 안일어나면 정렬이 끝난것이므로 bl = true가 되어 for문을 break로 빠져나온다)
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(9);
//		list.add(3);
//		list.add(2);
//		list.add(1);
//		
//		for (int i = 0; i < list.size(); i++) {
//			boolean bl = false;
//			for (int j = 0; j < list.size()-1; j++) {
//				if(list.get(j) > list.get(j+1)) {
//					Collections.swap(list, j, j+1);
//					bl = true;
//				}
//		}
//			if(bl == false) {
//				break;
//			}
//		}
//		System.out.println(list);
		
		// 내가만든 Sorting클래스를 이용해서 정렬하기
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add((int) (Math.random() * 100));
		}
		System.out.println(list);
		BubbleSortClass bubbleSortClass = new BubbleSortClass();
		bubbleSortClass.bubbleSort(list);
		System.out.println(list);
	
	}	
}

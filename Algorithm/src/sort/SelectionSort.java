package sort;

import java.util.ArrayList;

public class SelectionSort {

	public static void main(String[] args) {

		// 선택정렬 알고리즘이란 : 배열에서 가장 작은 숫자를 찾아내서 스위칭
		// 데이터가 두개 일 때 선택 정렬 알고리즘
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(9);
//		list.add(1);
//		if(list.get(0) > list.get(1)) {
//			Collections.swap(list, 0, 1);
//		}
//		System.out.println(list);
		
		
		// 데이터가 세개 이상일 때 선택 정렬 알고리즘
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(9);
//		list.add(1);
//		list.add(7);
//		int lowest;
//		
//		for (int i = 0; i < list.size()-1; i++) {
//			lowest = i;
//			for (int j = i+1; j < list.size(); j++) {
//				if(list.get(lowest) > list.get(j)) {
//					lowest = j;
//				}
//			}
//			Collections.swap(list, lowest, i);
//		}
//		System.out.println(list);
		
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add((int)(Math.random() * 100));
		}
		System.out.println(list);
		SelectionSortClass selectionSortClass = new SelectionSortClass();
		selectionSortClass.selectionSort(list);
		System.out.println(list);
		
	}

}

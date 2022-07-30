package sort;

import java.util.ArrayList;

public class MergeSort { //Nlogn

	public static void main(String[] args) {

//		ArrayList<Integer> testData = new ArrayList<Integer>();
//
//		for (int index = 0; index < 100; index++) {
//		    testData.add((int)(Math.random() * 100));
//		}
//		
//		MergeSplitAndMerge mergeSplitAndMerge = new MergeSplitAndMerge();
//		System.out.println(mergeSplitAndMerge.mergeSplitFunc(testData));
		
		
		
		ArrayList<Integer> testData = new ArrayList<Integer>();

		for (int index = 0; index < 8; index++) {
		    testData.add((int)(Math.random() * 8));
		}
		System.out.println(testData);
		MergeSplitAndMerge mergeSplitAndMerge = new MergeSplitAndMerge();
		//mergeSplitAndMerge.mergeSplitFunc(testData);
		System.out.println(mergeSplitAndMerge.mergeSplitFunc(testData));
	}
}

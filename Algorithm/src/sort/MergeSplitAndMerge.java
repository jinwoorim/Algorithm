package sort;

import java.util.ArrayList;

public class MergeSplitAndMerge {

	public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList){
		if(dataList.size() <= 1) {
			
			return dataList;
		}
		else {
			int medium = dataList.size() / 2;
			
			ArrayList<Integer> leftArr = new ArrayList<>();
			ArrayList<Integer> rightArr = new ArrayList<>();
			
			leftArr = mergeSplitFunc(new ArrayList<Integer>(dataList.subList(0, medium))); // medium 전까지 // return mergedList가 여기로오는겨
																						   // 이 한줄로 하나로 다 쪼개는split부터 merge해서 처음으로 돌아오는거까지 모두 처리. 만약 datalist가 8개면 4개까지 돌아온다는것
			
			
			rightArr = mergeSplitFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size()))); // medium 포함 마지막끝까지 // return mergedList가 여기로오는겨
																										 // 이 한줄로 하나로 다 쪼개는split부터 merge해서 처음으로 돌아오는거까지 모두 처리. 만약 datalist가 8개면 4개까지 돌아온다는것
			
			//System.out.println(leftArr);
			//System.out.println(rightArr);
			
			return mergeFunc(leftArr, rightArr);
		}
	}
	
	public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
	    ArrayList<Integer> mergedList = new ArrayList<Integer>();
	    int leftPoint = 0;
	    int rightPoint = 0;
	    
	    // CASE1: left/right 둘 다 아직 데이터가 있을 때
	    while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
	        if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
	            mergedList.add(rightList.get(rightPoint));
	            rightPoint += 1;
	        } else {
	            mergedList.add(leftList.get(leftPoint));
	            leftPoint += 1;
	        }
	    }
	    
	    // CASE2: right 데이터가 없을 때 (left 데이터만 있을 때)
	    while (leftList.size() > leftPoint) {
	        mergedList.add(leftList.get(leftPoint));
	        leftPoint += 1;        
	    }
	    // CASE3: left 데이터가 없을 때 (right 데이터만 있을 때)
	    while (rightList.size() > rightPoint) {
	        mergedList.add(rightList.get(rightPoint));
	        rightPoint += 1;        
	    }
	    
	    return mergedList;
	}
}

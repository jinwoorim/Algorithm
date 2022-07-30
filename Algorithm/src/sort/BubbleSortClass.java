package sort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSortClass{

	public ArrayList<Integer> bubbleSort(ArrayList<Integer> datalist){
		
		for (int i = 0; i < datalist.size(); i++) {
			boolean bl = false;
			for (int j = 0; j < datalist.size()-1; j++) {
				if(datalist.get(j) > datalist.get(j+1)) {
					Collections.swap(datalist, j, j+1);
					bl = true;
				}
		}
			if(bl == false) {
				break;
			}
		}
		return datalist;
	}
}

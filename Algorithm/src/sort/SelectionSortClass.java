package sort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSortClass {

	public ArrayList<Integer> selectionSort(ArrayList<Integer> datalist){
		
		int lowest;
		
		for (int i = 0; i < datalist.size()-1; i++) {
			lowest = i;
			for (int j = i+1; j < datalist.size(); j++) {
				if(datalist.get(lowest) > datalist.get(j)) {
					lowest = j;
				}
			}
			Collections.swap(datalist, lowest, i);
		}
		return datalist;
	}
}

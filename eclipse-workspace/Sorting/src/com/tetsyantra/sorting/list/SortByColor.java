package com.tetsyantra.sorting.list;

import java.util.Comparator;

public class SortByColor implements Comparator<Marker> {

	@Override
	public int compare(Marker m1, Marker m2) {
		
		
		return m1.color.compareToIgnoreCase(m2.color);
	}

}

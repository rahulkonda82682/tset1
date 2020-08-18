package assign2;

import java.util.Comparator;

public class SortCarName implements Comparator <Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getCarName().compareTo(o2.getCarName());
	} }



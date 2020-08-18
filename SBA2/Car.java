package assign2;

import java.util.Comparator;

public class Car  implements Comparator<Car>{
    private int ManufactureYear;
    private String CarName;
	public int getManufactureYear() {
		return ManufactureYear;
	}
	public void setManufactureYear(int manufactureYear) {
		ManufactureYear = manufactureYear;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public Car(int manufactureYear, String carName) {
		super();
		ManufactureYear = manufactureYear;
		CarName = carName;
	}
	@Override
	public String toString() {
		return "Car [ManufactureYear=" + ManufactureYear + ", CarName=" + CarName + "]";
	}
    public Car() {
    	
    }
	@Override
	public int compare(Car o1, Car o2) {
	return 0;
	}
}


	
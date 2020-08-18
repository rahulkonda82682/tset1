package assign2;

import java.util.List;

public class Showroom {
	private String ShowRoomName;
	private int ShowRoomID;
	List<Car>Cars;
	
	public String getShowRoomName() {
		return ShowRoomName;
	}
public void setShowRoomName(String showRoomName) {
ShowRoomName = showRoomName;
	}

	public int getShowRoomID() {
		return ShowRoomID;
	}

	public void setShowRoomID(int showRoomID) {
		ShowRoomID = showRoomID;
	}
	

	public List<Car> getCars() {
		return Cars;
	}
	public void setCars(List<Car> cars) {
		Cars = cars;
	}
	public Showroom(String showRoomName, int showRoomID, List<Car> cars) {
		super();
		this.ShowRoomName = showRoomName;
		this.ShowRoomID = showRoomID;
		this.Cars = cars;
	}
	@Override
	public String toString() {
		return "Showroom [ShowRoomName=" + ShowRoomName + ", ShowRoomID=" + ShowRoomID + ", Cars=" + Cars + "]";
	}

	public Showroom() {
		
	}
}

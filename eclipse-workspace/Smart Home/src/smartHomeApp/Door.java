package smartHomeApp;

public class Door {
	private String doorStatus;
	
	public Door(String doorStatus) {
		this.doorStatus=doorStatus;
	}
	
	public String getdoorStatus() {
		return doorStatus;
	}
	
	public void setdoorStatus(String doorStatus) {
		this.doorStatus=doorStatus;
	}
	
	public void turnDoorOpenClose(String changeDoorStatus) {
		this.doorStatus=changeDoorStatus;
	}
}

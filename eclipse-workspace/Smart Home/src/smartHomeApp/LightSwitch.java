package smartHomeApp;

public class LightSwitch {
	private String lightSwitchStatus;
	
	public LightSwitch(String lightSwitchStatus) {
		this.lightSwitchStatus=lightSwitchStatus;
	}
	
	public String getLightSwitchStatus() {
		return lightSwitchStatus;
	}
	
	public void setlightSwitchStatus(String lightSwitchStatus) {
		this.lightSwitchStatus=lightSwitchStatus;
	}
	
	public void turnlightSwitchOnOff(String changeLightStatus) {
		this.lightSwitchStatus=changeLightStatus;
	}
	
	/*public void toggle() {
		if("on".equals(lightSwitchStatus)) {
			lightSwitchStatus="off";
		} else {
			lightSwitchStatus="on";
		}
	}*/
}

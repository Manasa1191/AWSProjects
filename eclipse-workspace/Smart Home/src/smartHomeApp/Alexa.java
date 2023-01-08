package smartHomeApp;
//Alexa class - 'has-a' relationship with  light and door classes.
public class Alexa {
	private LightSwitch lightSwitchStatus_alexa;
	private Door doorStatus_alexa;
	//constructs Alexa object
	public Alexa(LightSwitch lightSwitchStatus_alexa, Door doorStatus_alexa) {
		this.lightSwitchStatus_alexa=lightSwitchStatus_alexa;
		this.doorStatus_alexa=doorStatus_alexa;
	}
	//returns light status
	public String getlightSwitchStatus_alexa() {
		return this.lightSwitchStatus_alexa.getLightSwitchStatus();
	}
	//sets light status
	public void setlightSwitchStatus_alexa(String lightSwitchStatus_alexa) {
		System.out.println("--Light status set through alexa--");
		this.lightSwitchStatus_alexa.setlightSwitchStatus(lightSwitchStatus_alexa);
	}
	//returns door status
	public String getdoorStatus_alexa() {
		return this.doorStatus_alexa.getdoorStatus();
	}
	//sets door status
	public void setdoorStatus_alexa(String doorStatus_alexa) {
		System.out.println("--Door status set through alexa--");
		this.doorStatus_alexa.setdoorStatus(doorStatus_alexa);
	}
	// change light status
	// same operation as setLightStatus_alexa 
	public void turnlightSwitchOnOff_alexa(LightSwitch changeLightStatus_alexa) {
		System.out.println("--Light status changed through alexa--");
		this.lightSwitchStatus_alexa=changeLightStatus_alexa;
	}
	//change door status
	//same operation as setDoorStatus_alexa
	public void turnDoorOpenClose_alexa(Door changeDoorStatus_alexa) {
		System.out.println("--Door status changed through alexa--");
		this.doorStatus_alexa=changeDoorStatus_alexa;
	}
	
	public void printLightStatus_alexa() {
		System.out.println("Alexa says light is: "+getlightSwitchStatus_alexa());
	}
	
	public void printDoorStatus_alexa() {
		System.out.println("Alexa says door is: "+getdoorStatus_alexa());
	}
	
}

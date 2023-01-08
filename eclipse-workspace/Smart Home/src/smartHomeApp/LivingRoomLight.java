package smartHomeApp;
// LivingRoomLight is a Light
public class LivingRoomLight extends LightSwitch{
	private int lightPercent;
	
	public LivingRoomLight(String lightSwitchStatus, int lightPercent) {
		super(lightSwitchStatus);
		this.lightPercent=lightPercent;
		System.out.println("\n Turning Living room light to: "+super.getLightSwitchStatus()+" with brightness: "+this.lightPercent);
	}

	//overriding method from super class
	public void turnlightSwitchOnOff(String changeLightStatus) {
		super.turnlightSwitchOnOff(changeLightStatus);
		adjustLivingRoomLightBrightness(100);
		System.out.println("Living room light adjusted to "+this.lightPercent);
	}
	
	//adjust brightness 
	public void adjustLivingRoomLightBrightness(int lightPercent) {
		this.lightPercent=lightPercent;
	
	}
}

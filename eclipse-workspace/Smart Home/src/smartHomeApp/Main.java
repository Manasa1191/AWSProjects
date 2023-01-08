package smartHomeApp;
// this class calls methods in Alexa class to turn on/off lights and open/close door
public class Main {

	public static void main(String[] args) {
		LightSwitch light = new LightSwitch("On");
		Door door = new Door("Open");
		Alexa alexa = new Alexa(light, door);
		//check current status of light, door and then toggle
		System.out.println("Current Light status: "+alexa.getlightSwitchStatus_alexa());
		System.out.println("Current Door status: "+alexa.getdoorStatus_alexa()+"\n");
		alexa.setlightSwitchStatus_alexa("off");
		alexa.setdoorStatus_alexa("Close");
		
		//check current status of light, door and then toggle
		System.out.println("Current Light status: "+alexa.getlightSwitchStatus_alexa());
		System.out.println("Current Door status: "+alexa.getdoorStatus_alexa()+"\n");
		LightSwitch light1 = new LightSwitch("On");
		Door door1 = new Door("Open");
		alexa.turnlightSwitchOnOff_alexa(light1);
		alexa.turnDoorOpenClose_alexa(door1);
		
		//print light door status
		alexa.printLightStatus_alexa();
		alexa.printDoorStatus_alexa();
		
		//setting living room light brightness to 100
		LightSwitch livinglight = new LivingRoomLight("dim",20);
		livinglight.turnlightSwitchOnOff("on");

	}

}

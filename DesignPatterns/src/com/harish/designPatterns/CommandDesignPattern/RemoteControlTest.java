package com.harish.designPatterns.CommandDesignPattern;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		LightOnCommand lightCommand = new LightOnCommand(light);
		remote.setCommand(lightCommand);
		remote.buttonWasPressed();
		
		System.out.print("\n===============\n");
		
		GargeDoor gargeDoor = new GargeDoor();
		GargeDoorOpenCommand gargeDoorCommand = new GargeDoorOpenCommand(gargeDoor);
		remote.setCommand(gargeDoorCommand);
		remote.buttonWasPressed();
	}
}

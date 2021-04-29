package com.harish.designPatterns.CommandDesignPattern;

public class GargeDoorOpenCommand implements Command{

	GargeDoor gargeDoor;
	
	public GargeDoorOpenCommand(GargeDoor gargeDoor){
		this.gargeDoor = gargeDoor;
	}
	public void execute(){
		gargeDoor.up();
	}
}

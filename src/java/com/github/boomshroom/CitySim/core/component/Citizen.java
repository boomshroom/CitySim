package com.github.boomshroom.CitySim.core.component;

import org.spout.api.component.components.EntityComponent;

import com.github.boomshroom.CitySim.api.component.block.building.Factory;
import com.github.boomshroom.CitySim.api.component.block.building.House;

public class Citizen extends EntityComponent{
	
	private int money;
	
	private House residence;
	
	private com.github.boomshroom.CitySim.api.component.block.building.Factory workPlace;
	
	public void onAttached() {
		
	}

	public House getResidence() {
		return residence;
	}

	public void setResidence(House residence) {
		this.residence = residence;
	}

	public Factory getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(Factory workPlace) {
		this.workPlace = workPlace;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}


}

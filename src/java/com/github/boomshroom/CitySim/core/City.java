package com.github.boomshroom.CitySim.core;

import java.util.ArrayList;

import com.github.boomshroom.CitySim.core.component.Citizen;
import com.github.boomshroom.CitySim.core.component.block.HouseComponent;

public class City {
	
	private ArrayList<Citizen> population = new ArrayList<Citizen>();
	private ArrayList<HouseComponent> resedences = new ArrayList<HouseComponent>();
	
	public void addCitizen(Citizen citizen){
		population.add(citizen);
	}
	
	public void removeCitizen(Citizen citizen){
		population.remove(citizen);
	}

	public ArrayList<Citizen> getPopulation(){
		return population;
	}
	
	public void buildHouse(HouseComponent house){
		resedences.add(house);
	}
	
	public void demoloishHouse(HouseComponent house){
		for(Citizen c:house.getOccupants()){
			c.setResidence(null);
		}
	}

}

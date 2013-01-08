package com.github.boomshroom.CitySim.core.component.block;

import java.util.HashMap;

import org.spout.api.component.components.BlockComponent;

import com.github.boomshroom.CitySim.api.component.block.building.House;
import com.github.boomshroom.CitySim.api.material.Resource;
import com.github.boomshroom.CitySim.api.material.block.building.HouseBlock;
import com.github.boomshroom.CitySim.core.component.Citizen;
import com.github.boomshroom.CitySim.core.material.CityMaterials;

public class HouseComponent extends BlockComponent implements House{
	
	private Citizen[] occupants;
	
	public HouseComponent(HouseBlock house){
		occupants=new Citizen[getFamilyCapacity()];
	}
	
	public int freeSpace(){
		int value=0;
		for(Citizen c:occupants){
			if(c==null) value++;
		}
		return value;
	}
	public Citizen[] getOccupants(){
		return occupants;
	}
	
	@Override
	public int getFamilyCapacity() {
		return 1;
	}

	@Override
	public HashMap<Resource, Integer> getConsumtion() {
		HashMap<Resource, Integer> val = new HashMap<Resource, Integer>();
		val.put(CityMaterials.ELECTRICITY, 1);
		return val;
	}

	@Override
	public HashMap<Resource, Integer> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaxWorkers() {
		// TODO Auto-generated method stub
		return 0;
	}


}

package com.github.boomshroom.CitySim.core.material.block.building;

import com.github.boomshroom.CitySim.api.material.block.building.House;
import com.github.boomshroom.CitySim.core.material.block.CityBuilding;

public class CityHouse extends CityBuilding implements House{

	public CityHouse(String name, int id) {
		super(name, id);
	}

	@Override
	public int[] getDimentions() {
		return new int[]{1,1};
	}

	@Override
	public int getFamilyCapacity() {
		return 1;
	}

}

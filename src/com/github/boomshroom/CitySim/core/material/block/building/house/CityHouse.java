package com.github.boomshroom.CitySim.core.material.block.building.house;

import java.util.HashMap;

import com.github.boomshroom.CitySim.api.material.Resource;
import com.github.boomshroom.CitySim.api.material.block.building.House;
import com.github.boomshroom.CitySim.base.material.block.building.BaseHouse;

public class CityHouse extends BaseHouse implements House {

	public CityHouse(String name) {
		super(name);
	}

	@Override
	public int[] getDimentions() {
		return new int[]{1,1};
	}

	@Override
	public int getFamilyCapacity() {
		return 1;
	}

	@Override
	public HashMap<Resource, Integer> getConsumtion() {
		// TODO Auto-generated method stub
		return null;
	}

}

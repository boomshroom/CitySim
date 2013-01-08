package com.github.boomshroom.CitySim.core.material.block.building.house;

import org.spout.api.component.components.BlockComponent;

import com.github.boomshroom.CitySim.base.material.block.building.BaseHouse;
import com.github.boomshroom.CitySim.core.component.block.HouseComponent;

public class CityHouse extends BaseHouse{

	public CityHouse(String name) {
		super(name);
	}

	@Override
	public int[] getDimentions() {
		return new int[]{1,1};
	}

	@Override
	public BlockComponent createBlockComponent() {
		return new HouseComponent(this);
	}

}

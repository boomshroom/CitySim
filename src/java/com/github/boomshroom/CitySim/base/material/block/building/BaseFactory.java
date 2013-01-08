package com.github.boomshroom.CitySim.base.material.block.building;

import com.github.boomshroom.CitySim.api.component.block.building.Factory;
import com.github.boomshroom.CitySim.base.material.block.BaseBuilding;

public abstract class BaseFactory extends BaseBuilding implements Factory{

	protected BaseFactory(String name) {
		super(name);
	}

}

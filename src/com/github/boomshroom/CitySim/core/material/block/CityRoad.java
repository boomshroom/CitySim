package com.github.boomshroom.CitySim.core.material.block;

import com.github.boomshroom.CitySim.api.material.block.Building;
import com.github.boomshroom.CitySim.core.material.CityBlockMaterial;

public abstract class CityRoad extends CityBlockMaterial implements Building {

	protected CityRoad(String name, int id) {
		super(name, id);
	}

}

package com.github.boomshroom.CitySim.base.material.block;

import com.github.boomshroom.CitySim.api.material.block.Building;
import com.github.boomshroom.CitySim.base.material.BaseBlockMaterial;
import com.github.boomshroom.CitySim.core.material.CityMaterials;

public abstract class BaseBuilding extends BaseBlockMaterial implements Building {

	protected BaseBuilding(String name) {
		super(name);
		CityMaterials.placeable.add((BaseBlockMaterial)this);
	}

}

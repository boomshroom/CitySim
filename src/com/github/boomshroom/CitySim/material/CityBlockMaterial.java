package com.github.boomshroom.CitySim.material;

import org.spout.api.material.BlockMaterial;

public class CityBlockMaterial extends BlockMaterial implements CityMaterial{

	protected CityBlockMaterial(String name, int id) {
		super(name, (short)id);
	}

}

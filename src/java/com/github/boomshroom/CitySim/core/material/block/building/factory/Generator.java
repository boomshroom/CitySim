package com.github.boomshroom.CitySim.core.material.block.building.factory;

import java.util.HashMap;

import com.github.boomshroom.CitySim.api.material.Resource;
import com.github.boomshroom.CitySim.base.material.block.building.BaseFactory;
import com.github.boomshroom.CitySim.core.material.CityMaterials;

public class Generator extends BaseFactory {

	public Generator(String name) {
		super(name);
	}

	@Override
	public HashMap<Resource,Integer> getProduct() {
		HashMap<Resource, Integer> val = new HashMap<Resource, Integer>();
		val.put(CityMaterials.ELECTRICITY, 1);
		return val;
	}

	@Override
	public int[] getDimentions() {
		return null;
	}

	@Override
	public HashMap<Resource, Integer> getConsumtion() {
		HashMap<Resource, Integer> val = new HashMap<Resource, Integer>();
		val.put(CityMaterials.COAL, 1);
		return val;
	}

}

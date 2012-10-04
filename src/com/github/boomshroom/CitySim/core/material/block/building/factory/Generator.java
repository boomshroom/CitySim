package com.github.boomshroom.CitySim.core.material.block.building.factory;

import java.util.HashMap;

import com.github.boomshroom.CitySim.api.material.Resource;
import com.github.boomshroom.CitySim.base.material.block.building.BaseFactory;

public class Generator extends BaseFactory {

	protected Generator(String name) {
		super(name);
	}

	@Override
	public Resource getProduct() {
		return null;
	}

	@Override
	public int[] getDimentions() {
		return null;
	}

	@Override
	public HashMap<Resource, Integer> getConsumtion() {
		return null;
	}

}

package com.github.boomshroom.CitySim.core.material.block.building.factory;

import java.util.HashMap;

import org.spout.api.component.components.BlockComponent;

import com.github.boomshroom.CitySim.api.material.Resource;
import com.github.boomshroom.CitySim.base.material.block.building.BaseFactory;
import com.github.boomshroom.CitySim.core.component.block.GeneratorComponent;
import com.github.boomshroom.CitySim.core.material.CityMaterials;

public class Generator extends BaseFactory {

	public Generator(String name) {
		super(name);
	}

	@Override
	public int[] getDimentions() {
		return null;
	}


	@Override
	public BlockComponent createBlockComponent() {
		return new GeneratorComponent();
	}

	@Override
	public HashMap<Resource, Integer> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<Resource, Integer> getConsumtion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaxWorkers() {
		// TODO Auto-generated method stub
		return 0;
	}


}

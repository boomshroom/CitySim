package com.github.boomshroom.CitySim.core.component.block;

import java.util.HashMap;

import org.spout.api.component.components.BlockComponent;

import com.github.boomshroom.CitySim.api.component.block.building.Factory;
import com.github.boomshroom.CitySim.api.material.Resource;

public class GeneratorComponent extends BlockComponent implements Factory {

	@Override
	public HashMap<Resource, Integer> getProduct() {
		return null;
	}

	@Override
	public HashMap<Resource, Integer> getConsumtion() {
		return null;
	}

	@Override
	public int getMaxWorkers() {
		return 0;
	}

}

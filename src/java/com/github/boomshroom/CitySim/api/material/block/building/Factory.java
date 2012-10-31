package com.github.boomshroom.CitySim.api.material.block.building;

import java.util.HashMap;

import com.github.boomshroom.CitySim.api.material.Resource;
import com.github.boomshroom.CitySim.api.material.block.Building;

public interface Factory extends Building {
	
	public HashMap<Resource,Integer> getProduct();
	
}

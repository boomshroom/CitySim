package com.github.boomshroom.CitySim.api.component.block.building;

import java.util.HashMap;

import com.github.boomshroom.CitySim.api.material.Resource;

public interface Factory{
	
	public HashMap<Resource,Integer> getProduct();
	
	public HashMap<Resource,Integer> getConsumtion();
	
	public int getMaxWorkers();
	
}

package com.github.boomshroom.CitySim.api.material.block;

import java.util.HashMap;

import com.github.boomshroom.CitySim.api.material.Resource;

public interface Building {
	
	/**
	 * returns a 2d array of ints representing the dimmensions of the building
	 * @return size of building
	 */
	public int[] getDimentions();
	
	public HashMap<Resource,Integer> getConsumtion();
}

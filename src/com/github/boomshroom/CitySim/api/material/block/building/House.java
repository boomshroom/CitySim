package com.github.boomshroom.CitySim.api.material.block.building;

import com.github.boomshroom.CitySim.api.material.block.Building;

public interface House extends Building{
	
	/**
	 * get number of families that can live here
	 * @return max number of families
	 */
	public int getFamilyCapacity();
	
}

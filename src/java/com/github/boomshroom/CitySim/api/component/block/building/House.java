package com.github.boomshroom.CitySim.api.component.block.building;

public interface House extends Factory{
	
	/**
	 * get number of families that can live here
	 * @return max number of families
	 */
	public int getFamilyCapacity();
	
}

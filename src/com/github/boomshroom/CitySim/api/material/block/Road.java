package com.github.boomshroom.CitySim.api.material.block;

public interface Road {
	
	/**
	 * The number of lanes going north or west.
	 * 
	 * @return number of lanes
	 */
	public int getlanesNW();
	
	/**
	 * The number of lanes going south or east.
	 * seprate meathods for one way roads.
	 * 
	 * @return number of lanes
	 */
	public int getlanesSE();
}

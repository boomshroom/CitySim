package com.github.boomshroom.CitySim.api.material.block;

import org.spout.api.material.ComplexMaterial;

public interface Building extends ComplexMaterial{
	
	/**
	 * returns a 2d array of ints representing the dimmensions of the building
	 * @return size of building
	 */
	public int[] getDimentions();

}

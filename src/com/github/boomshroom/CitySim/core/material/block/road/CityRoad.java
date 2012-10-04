package com.github.boomshroom.CitySim.core.material.block.road;

import com.github.boomshroom.CitySim.base.material.block.BaseRoad;

public class CityRoad extends BaseRoad{

	public CityRoad(String string) {
		super(string);
	}

	public int[] getDimentions() {
		return new int[]{1,1};
	}

	@Override
	public int getlanesNW() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getlanesSE() {
		// TODO Auto-generated method stub
		return 0;
	}

}

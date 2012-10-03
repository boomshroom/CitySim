package com.github.boomshroom.CitySim.core.material.block;

import org.spout.api.geo.cuboid.Block;
import org.spout.api.material.block.BlockFace;
import org.spout.api.math.Vector3;

import com.github.boomshroom.CitySim.core.material.CityBlockMaterial;

public class Ground extends CityBlockMaterial {

	public Ground(String name, int id) {
		super(name, (short)id);
		this.setHardness(-1.0F);
	}

	@Override
	public boolean canPlace(Block block, short data, BlockFace against, Vector3 clickedPos, boolean isClickedBlock) {
		return false;
	}
}

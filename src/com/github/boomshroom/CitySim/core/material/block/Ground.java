package com.github.boomshroom.CitySim.core.material.block;

import org.spout.api.geo.cuboid.Block;
import org.spout.api.material.block.BlockFace;
import org.spout.api.math.Vector3;

import com.github.boomshroom.CitySim.base.material.BaseBlockMaterial;

public class Ground extends BaseBlockMaterial {

	public Ground(String name) {
		super(name);
		this.setHardness(-1.0F);
	}

	@Override
	public boolean canPlace(Block block, short data, BlockFace against, Vector3 clickedPos, boolean isClickedBlock) {
		return false;
	}
}

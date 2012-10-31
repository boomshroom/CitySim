package com.github.boomshroom.CitySim.core.world.generator;

import org.spout.api.generator.WorldGenerator;
import org.spout.api.generator.biome.BiomeGenerator;
import org.spout.api.generator.biome.BiomeManager;
import org.spout.api.geo.World;
import org.spout.api.geo.cuboid.Chunk;
import org.spout.api.util.cuboid.CuboidShortBuffer;

public class CityGenerator extends BiomeGenerator implements WorldGenerator {

	@Override
	public int[][] getSurfaceHeight(World world, int chunkX, int chunkZ) {
		int[][] heights = new int[Chunk.BLOCKS.SIZE][Chunk.BLOCKS.SIZE];
		for (int x = 0; x < Chunk.BLOCKS.SIZE; x++) {
			for (int z = 0; z < Chunk.BLOCKS.SIZE; z++) {
				heights[x][z] = 15;
			}
		}
		return heights;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "City World";
	}

	@Override
	public void registerBiomes() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void generateTerrain(CuboidShortBuffer blockData, int x, int y,int z, BiomeManager manager, long seed) {
		// TODO Auto-generated method stub

	}

}

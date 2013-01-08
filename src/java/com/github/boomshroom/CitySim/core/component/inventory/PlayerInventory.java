package com.github.boomshroom.CitySim.core.component.inventory;

import org.spout.api.component.components.EntityComponent;
import org.spout.api.entity.Entity;
import org.spout.api.material.BlockMaterial;

import com.github.boomshroom.CitySim.api.material.Unlockable;
import com.github.boomshroom.CitySim.core.component.PlayerComponent;
import com.github.boomshroom.CitySim.core.material.CityMaterials;

public class PlayerInventory extends EntityComponent {
	
	@Override
	public void onAttached() {
		super.onAttached();
		Entity holder = getOwner();
		holder.add(PlayerInventory.class);
	}
	
	public boolean canUse(BlockMaterial mat){
		if(!CityMaterials.placeable.contains(mat)) return false;
		if(mat instanceof Unlockable){
			return ((Unlockable) mat).isUnlocked(getOwner().get(PlayerComponent.class));
		}
		return true;
	}

}

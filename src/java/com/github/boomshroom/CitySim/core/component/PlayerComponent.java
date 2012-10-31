package com.github.boomshroom.CitySim.core.component;

import org.spout.api.component.components.EntityComponent;
import org.spout.api.entity.Entity;

import com.github.boomshroom.CitySim.core.component.inventory.PlayerInventory;


public class PlayerComponent extends EntityComponent {
	
	@Override
	public void onAttached() {
		super.onAttached();
		Entity holder = getOwner();
		holder.add(PlayerInventory.class);
	}
	
}

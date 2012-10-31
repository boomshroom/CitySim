package com.github.boomshroom.CitySim.core.component.inventory.window;

import org.spout.api.component.components.EntityComponent;
import org.spout.api.inventory.Inventory;
import org.spout.api.inventory.InventoryViewer;
import org.spout.api.inventory.ItemStack;
import org.spout.vanilla.component.inventory.PlayerInventory;
import org.spout.vanilla.inventory.util.InventoryConverter;
import org.spout.vanilla.inventory.window.WindowType;

public class InvWindow extends EntityComponent implements InventoryViewer {

	private boolean isPlacing;
	
	@Override
	public void onAttached() {
		
	}
	
	@Override
	public void onSlotSet(Inventory inventory, int slot, ItemStack item) {
		// TODO Auto-generated method stub
		
	}

}

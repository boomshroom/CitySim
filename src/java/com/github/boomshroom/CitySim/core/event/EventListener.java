package com.github.boomshroom.CitySim.core.event;

import org.spout.api.entity.Player;
import org.spout.api.event.EventHandler;
import org.spout.api.event.Listener;
import org.spout.api.event.player.PlayerJoinEvent;

import com.github.boomshroom.CitySim.core.component.PlayerComponent;
import com.github.boomshroom.CitySim.core.component.inventory.window.InvWindow;


public class EventListener implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.add(PlayerComponent.class);
		player.add(InvWindow.class);
	}
	
}

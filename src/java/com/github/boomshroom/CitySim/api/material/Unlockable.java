package com.github.boomshroom.CitySim.api.material;

import com.github.boomshroom.CitySim.core.component.PlayerComponent;

public interface Unlockable {
	
	public boolean isUnlocked(PlayerComponent player);
}

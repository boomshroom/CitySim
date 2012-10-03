package com.github.boomshroom.CitySim.core;

import java.util.logging.Level;

import org.spout.api.Engine;
import org.spout.api.UnsafeMethod;
import org.spout.api.plugin.CommonPlugin;

import com.github.boomshroom.CitySim.core.world.generator.CityGenerator;

public class CitySimPlugin extends CommonPlugin {
	
	private static CitySimPlugin instance;
	private static Engine engine;
	private static final CityGenerator generator = new CityGenerator();

	@Override
	@UnsafeMethod
	public void onEnable() {
		/*if(instance!=null){
			getLogger().log(Level.WARNING, "Plugin already enabled. Disabling.");
			engine.getPluginManager().disablePlugin(this);
		}*/
		engine.loadWorld("world", generator);

	}

	@Override
	@UnsafeMethod
	public void onDisable() {
		// TODO Auto-generated method stub

	}
	
	public void onLoad(){
		instance = this;
		engine=getEngine();
	}

}

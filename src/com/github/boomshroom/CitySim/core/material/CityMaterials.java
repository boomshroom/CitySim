package com.github.boomshroom.CitySim.core.material;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.spout.api.Spout;
import org.spout.api.material.BlockMaterial;

import com.github.boomshroom.CitySim.base.material.BaseMaterial;
import com.github.boomshroom.CitySim.core.material.block.Ground;
import com.github.boomshroom.CitySim.core.material.block.building.house.CityHouse;
import com.github.boomshroom.CitySim.core.material.block.road.CityRoad;

public class CityMaterials {
	// == Eviroment Blocks ==
	public static final BlockMaterial AIR =BlockMaterial.AIR;
	public static final Ground GROUND = new Ground("Ground");
	// == Buildings ==
	public static final CityHouse HOUSE = new CityHouse("House");
	// == Roads ==
	public static final CityRoad ROAD = new CityRoad("Road");
	// == Resources ==
	public static final CityResource ELECTRICTY = new CityResource("electricty");
	private static boolean initialized =false;
	
	public static void initialize(){
		if (initialized){
			return;
		}
		for(Field field : CityMaterials.class.getFields()){
			try{
				if(field==null||((field.getModifiers()&(Modifier.STATIC|Modifier.PUBLIC))!=(Modifier.STATIC|Modifier.PUBLIC))||!BaseMaterial.class.isAssignableFrom(field.getType())){
					continue;
				}
				BaseMaterial material = (BaseMaterial) field.get(null);
				if(material==null){
					Spout.getLogger().severe("City Material field '"+field.getName()+"' is not yet initialized");
					continue;
				}
			}catch(Throwable t){
				Spout.getLogger().severe("An exeption occurred while reading City Material field '"+field.getName()+"':");
				t.printStackTrace();
			}
		}
		initialized=true;
	}
}

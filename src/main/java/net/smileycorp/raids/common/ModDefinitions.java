package net.smileycorp.raids.common;

import net.minecraft.util.ResourceLocation;

public class ModDefinitions {
	
	public static final String NAME = "Raids";
	public static final String MODID = "raids";
	public static final String VERSION = "0.1.1";
	public static final String DEPENDENCIES = "required-after:atlaslib;after:futuremc";
	public static final String PATH = "net.smileycorp.raids.";
	public static final String CLIENT = PATH + "client.ClientProxy";
	public static final String SERVER = PATH + "common.CommonProxy";
	
	public static String getName(String name) {
		return MODID + "." + name.replace("_", "");
	}
	
	public static ResourceLocation getResource(String name) {
		return new ResourceLocation(MODID, name.toLowerCase());
	}
	
}

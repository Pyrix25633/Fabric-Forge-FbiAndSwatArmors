package net.rupyber_studios.fbi_swat_armors;

import net.fabricmc.api.ModInitializer;
import net.rupyber_studios.fbi_swat_armors.item.ModItems;
import net.rupyber_studios.fbi_swat_armors.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class FbiSwatArmors implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("fbi_swat_armors");

	public static final String MOD_ID = "fbi_swat_armors";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();

		GeckoLib.initialize();


		LOGGER.info("Hello Fabric world!");
	}
}
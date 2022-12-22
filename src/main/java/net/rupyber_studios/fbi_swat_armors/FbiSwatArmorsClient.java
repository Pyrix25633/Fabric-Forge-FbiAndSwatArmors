package net.rupyber_studios.fbi_swat_armors;

import net.fabricmc.api.ClientModInitializer;
import net.rupyber_studios.fbi_swat_armors.entity.client.armor.Fbi0Renderer;
import net.rupyber_studios.fbi_swat_armors.entity.client.armor.Fbi1Renderer;
import net.rupyber_studios.fbi_swat_armors.entity.client.armor.Swat1Renderer;
import net.rupyber_studios.fbi_swat_armors.item.ModItems;
import net.rupyber_studios.fbi_swat_armors.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FbiSwatArmorsClient implements ClientModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("fbi_swat_armors");

	public static final String MOD_ID = "fbi_swat_armors";

	@Override
	public void onInitializeClient() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();

		GeckoLib.initialize();

		ModRegistries.registerAttributes();

		ModRegistries.registerRenderers();

		GeoArmorRenderer.registerArmorRenderer(new Fbi0Renderer(), ModItems.SUNGLASSES, ModItems.FBI_JACKET,
				ModItems.FBI_BLUE_TROUSERS, ModItems.SHOES);
		GeoArmorRenderer.registerArmorRenderer(new Fbi1Renderer(), ModItems.FBI_HELMET, ModItems.FBI_BULLETPROOF_VEST,
				ModItems.FBI_GREEN_TROUSERS);
		GeoArmorRenderer.registerArmorRenderer(new Swat1Renderer(), ModItems.SWAT_HELMET, ModItems.SWAT_BULLETPROOF_VEST,
				ModItems.SWAT_TROUSERS);

		LOGGER.info("Hello Fabric world!");
	}
}
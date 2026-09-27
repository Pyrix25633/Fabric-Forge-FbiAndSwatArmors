package net.rupyber_studios.fbi_swat_armors;

import net.fabricmc.api.ModInitializer;
import net.rupyber_studios.fbi_swat_armors.item.ModItemGroups;
import net.rupyber_studios.fbi_swat_armors.item.ModItems;

public final class FbiSwatArmors implements ModInitializer {
    public static final String MOD_ID = "fbi_swat_armors";

    @Override
    public void onInitialize() {
        ModItems.register();
        ModItemGroups.register();
    }
}

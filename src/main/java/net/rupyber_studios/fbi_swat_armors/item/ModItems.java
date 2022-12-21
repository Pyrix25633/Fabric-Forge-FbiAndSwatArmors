package net.rupyber_studios.fbi_swat_armors.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FbiSwatArmors.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering ModItems for " + FbiSwatArmors.MOD_ID);
    }
}
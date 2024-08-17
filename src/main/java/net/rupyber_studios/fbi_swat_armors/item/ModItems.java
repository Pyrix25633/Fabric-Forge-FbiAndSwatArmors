package net.rupyber_studios.fbi_swat_armors.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi0Item;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi1Item;
import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ALL = new ArrayList<>();

    private static final Item.Settings settings = new Item.Settings();

    public static final Item SUNGLASSES = registerItem("sunglasses",
            new Fbi0Item(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    settings));
    public static final Item FBI_JACKET = registerItem("fbi_jacket",
            new Fbi0Item(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    settings));
    public static final Item FBI_BLUE_TROUSERS = registerItem("fbi_blue_trousers",
            new Fbi0Item(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    settings));
    public static final Item SHOES = registerItem("shoes",
            new Fbi0Item(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    settings));
    public static final Item FBI_HELMET = registerItem("fbi_helmet",
            new Fbi1Item(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    settings));
    public static final Item FBI_BULLETPROOF_VEST = registerItem("fbi_bulletproof_vest",
            new Fbi1Item(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    settings));
    public static final Item FBI_GREEN_TROUSERS = registerItem("fbi_green_trousers",
            new Fbi1Item(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    settings));
    public static final Item SWAT_HELMET = registerItem("swat_helmet",
            new Swat1Item(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    settings));
    public static final Item SWAT_BULLETPROOF_VEST = registerItem("swat_bulletproof_vest",
            new Swat1Item(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    settings));
    public static final Item SWAT_TROUSERS = registerItem("swat_trousers",
            new Swat1Item(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    settings));

    private static Item registerItem(String name, Item item) {
        ALL.add(item);
        Item registered = Registry.register(Registries.ITEM, Identifier.of(FbiSwatArmors.MOD_ID, name), item);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.FBI_SWAT_ARMORS).register(entries -> entries.add(item));
        return registered;
    }

    public static void registerModItems() {
        System.out.println("Registering ModItems for " + FbiSwatArmors.MOD_ID);
    }
}
package net.rupyber_studios.fbi_swat_armors.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi0Item;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi1Item;
import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;

public class ModItems {
    private static final FabricItemSettings settings = new FabricItemSettings().group(ModItemGroup.FBI_SWAT_ARMORS);

    public static final Item SUNGLASSES = registerItem("sunglasses",
            new Fbi0Item(ArmorMaterials.IRON, EquipmentSlot.HEAD,
                    settings));
    public static final Item FBI_JACKET = registerItem("fbi_jacket",
            new Fbi0Item(ArmorMaterials.IRON, EquipmentSlot.CHEST,
                    settings));
    public static final Item FBI_BLUE_TROUSERS = registerItem("fbi_blue_trousers",
            new Fbi0Item(ArmorMaterials.IRON, EquipmentSlot.LEGS,
                    settings));
    public static final Item SHOES = registerItem("shoes",
            new Fbi0Item(ArmorMaterials.IRON, EquipmentSlot.FEET,
                    settings));
    public static final Item FBI_HELMET = registerItem("fbi_helmet",
            new Fbi1Item(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD,
                    settings));
    public static final Item FBI_BULLETPROOF_VEST = registerItem("fbi_bulletproof_vest",
            new Fbi1Item(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST,
                    settings));
    public static final Item FBI_GREEN_TROUSERS = registerItem("fbi_green_trousers",
            new Fbi1Item(ArmorMaterials.IRON, EquipmentSlot.LEGS,
                    settings));
    public static final Item SWAT_HELMET = registerItem("swat_helmet",
            new Swat1Item(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD,
                    settings));
    public static final Item SWAT_BULLETPROOF_VEST = registerItem("swat_bulletproof_vest",
            new Swat1Item(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST,
                    settings));
    public static final Item SWAT_TROUSERS = registerItem("swat_trousers",
            new Swat1Item(ArmorMaterials.IRON, EquipmentSlot.LEGS,
                    settings));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FbiSwatArmors.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering ModItems for " + FbiSwatArmors.MOD_ID);
    }
}
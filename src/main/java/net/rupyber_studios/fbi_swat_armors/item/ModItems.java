package net.rupyber_studios.fbi_swat_armors.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.FbiArmorItem;

import java.util.ArrayList;
import java.util.List;

public final class ModItems {
    public static final List<Item> ALL = new ArrayList<>();

    public static final Item SUNGLASSES = armor("sunglasses", ArmorMaterials.IRON, ArmorType.HELMET, "armor0", "fbi0");
    public static final Item FBI_JACKET = armor("fbi_jacket", ArmorMaterials.IRON, ArmorType.CHESTPLATE, "armor0", "fbi0");
    public static final Item FBI_BLUE_TROUSERS = armor("fbi_blue_trousers", ArmorMaterials.IRON, ArmorType.LEGGINGS, "armor0", "fbi0");
    public static final Item SHOES = armor("shoes", ArmorMaterials.IRON, ArmorType.BOOTS, "armor0", "fbi0");
    public static final Item FBI_HELMET = armor("fbi_helmet", ArmorMaterials.DIAMOND, ArmorType.HELMET, "armor1", "fbi1");
    public static final Item FBI_BULLETPROOF_VEST = armor("fbi_bulletproof_vest", ArmorMaterials.DIAMOND, ArmorType.CHESTPLATE, "armor1", "fbi1");
    public static final Item FBI_GREEN_TROUSERS = armor("fbi_green_trousers", ArmorMaterials.IRON, ArmorType.LEGGINGS, "armor1", "fbi1");
    public static final Item SWAT_HELMET = armor("swat_helmet", ArmorMaterials.DIAMOND, ArmorType.HELMET, "armor1", "swat1");
    public static final Item SWAT_BULLETPROOF_VEST = armor("swat_bulletproof_vest", ArmorMaterials.DIAMOND, ArmorType.CHESTPLATE, "armor1", "swat1");
    public static final Item SWAT_TROUSERS = armor("swat_trousers", ArmorMaterials.IRON, ArmorType.LEGGINGS, "armor1", "swat1");

    private static Item armor(String name, ArmorMaterial material, ArmorType type, String model, String variant) {
        Identifier id = Identifier.fromNamespaceAndPath(FbiSwatArmors.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Item item = new FbiArmorItem(new Item.Properties().setId(key).humanoidArmor(material, type), model, variant);
        ALL.add(item);
        return Registry.register(BuiltInRegistries.ITEM, id, item);
    }

    public static void register() {
    }
}

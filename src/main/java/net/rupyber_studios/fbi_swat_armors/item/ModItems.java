package net.rupyber_studios.fbi_swat_armors.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.ArmorMaterials;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi0Item;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi1Item;
import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ModItems {
    public static final List<Item> ALL = new ArrayList<>();

    public static final Item SUNGLASSES = registerArmorItem("sunglasses", Fbi0Item::new,
            ArmorMaterials.IRON, EquipmentType.HELMET);
    public static final Item FBI_JACKET = registerArmorItem("fbi_jacket", Fbi0Item::new,
            ArmorMaterials.IRON, EquipmentType.CHESTPLATE);
    public static final Item FBI_BLUE_TROUSERS = registerArmorItem("fbi_blue_trousers", Fbi0Item::new,
            ArmorMaterials.IRON, EquipmentType.LEGGINGS);
    public static final Item SHOES = registerArmorItem("shoes", Fbi0Item::new,
            ArmorMaterials.IRON, EquipmentType.BOOTS);
    public static final Item FBI_HELMET = registerArmorItem("fbi_helmet", Fbi1Item::new,
            ArmorMaterials.DIAMOND, EquipmentType.HELMET);
    public static final Item FBI_BULLETPROOF_VEST = registerArmorItem("fbi_bulletproof_vest", Fbi1Item::new,
            ArmorMaterials.DIAMOND, EquipmentType.CHESTPLATE);
    public static final Item FBI_GREEN_TROUSERS = registerArmorItem("fbi_green_trousers", Fbi1Item::new,
            ArmorMaterials.IRON, EquipmentType.LEGGINGS);
    public static final Item SWAT_HELMET = registerArmorItem("swat_helmet", Swat1Item::new,
            ArmorMaterials.DIAMOND, EquipmentType.HELMET);
    public static final Item SWAT_BULLETPROOF_VEST = registerArmorItem("swat_bulletproof_vest", Swat1Item::new,
            ArmorMaterials.DIAMOND, EquipmentType.CHESTPLATE);
    public static final Item SWAT_TROUSERS = registerArmorItem("swat_trousers", Swat1Item::new,
            ArmorMaterials.IRON, EquipmentType.LEGGINGS);

    private static Item registerArmorItem(String name, Function<Item.Settings, Item> factory,
                                          ArmorMaterial material, EquipmentType type) {
        Identifier id = Identifier.of(FbiSwatArmors.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item item = factory.apply(new Item.Settings().registryKey(key).armor(material, type));
        ALL.add(item);
        Item registered = Registry.register(Registries.ITEM, key, item);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.FBI_SWAT_ARMORS).register(entries -> entries.add(registered));
        return registered;
    }

    public static void registerModItems() {
        System.out.println("Registering ModItems for " + FbiSwatArmors.MOD_ID);
    }
}

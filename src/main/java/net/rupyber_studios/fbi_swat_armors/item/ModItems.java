package net.rupyber_studios.fbi_swat_armors.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi0Item;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi1Item;
import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FbiSwatArmors.MOD_ID);

    public static final RegistryObject<Item> SUNGLASSES = ITEMS.register("sunglasses",
            () -> new Fbi0Item(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<Item> FBI_JACKET = ITEMS.register("fbi_jacket",
            () -> new Fbi0Item(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<Item> FBI_BLUE_TROUSERS = ITEMS.register("fbi_blue_trousers",
            () -> new Fbi0Item(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> SHOES = ITEMS.register("shoes",
            () -> new Fbi0Item(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties()));
    public static final RegistryObject<Item> FBI_HELMET = ITEMS.register("fbi_helmet",
            () -> new Fbi1Item(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<Item> FBI_BULLETPROOF_VEST = ITEMS.register("fbi_bulletproof_vest",
            () -> new Fbi1Item(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<Item> FBI_GREEN_TROUSERS = ITEMS.register("fbi_green_trousers",
            () -> new Fbi1Item(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> SWAT_HELMET = ITEMS.register("swat_helmet",
            () -> new Swat1Item(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<Item> SWAT_BULLETPROOF_VEST = ITEMS.register("swat_bulletproof_vest",
            () -> new Swat1Item(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<Item> SWAT_TROUSERS = ITEMS.register("swat_trousers",
            () -> new Swat1Item(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
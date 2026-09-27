package net.rupyber_studios.fbi_swat_armors;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rupyber_studios.fbi_swat_armors.item.custom.FbiArmorItem;

import java.util.List;

@Mod(FbiSwatArmors.MOD_ID)
public final class FbiSwatArmors {
    public static final String MOD_ID = "fbi_swat_armors";
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    private static final DeferredItem<Item> SUNGLASSES = armor("sunglasses", ArmorMaterials.IRON, ArmorType.HELMET, "armor0", "fbi0");
    private static final DeferredItem<Item> FBI_JACKET = armor("fbi_jacket", ArmorMaterials.IRON, ArmorType.CHESTPLATE, "armor0", "fbi0");
    private static final DeferredItem<Item> FBI_BLUE_TROUSERS = armor("fbi_blue_trousers", ArmorMaterials.IRON, ArmorType.LEGGINGS, "armor0", "fbi0");
    private static final DeferredItem<Item> SHOES = armor("shoes", ArmorMaterials.IRON, ArmorType.BOOTS, "armor0", "fbi0");
    private static final DeferredItem<Item> FBI_HELMET = armor("fbi_helmet", ArmorMaterials.DIAMOND, ArmorType.HELMET, "armor1", "fbi1");
    private static final DeferredItem<Item> FBI_BULLETPROOF_VEST = armor("fbi_bulletproof_vest", ArmorMaterials.DIAMOND, ArmorType.CHESTPLATE, "armor1", "fbi1");
    private static final DeferredItem<Item> FBI_GREEN_TROUSERS = armor("fbi_green_trousers", ArmorMaterials.IRON, ArmorType.LEGGINGS, "armor1", "fbi1");
    private static final DeferredItem<Item> SWAT_HELMET = armor("swat_helmet", ArmorMaterials.DIAMOND, ArmorType.HELMET, "armor1", "swat1");
    private static final DeferredItem<Item> SWAT_BULLETPROOF_VEST = armor("swat_bulletproof_vest", ArmorMaterials.DIAMOND, ArmorType.CHESTPLATE, "armor1", "swat1");
    private static final DeferredItem<Item> SWAT_TROUSERS = armor("swat_trousers", ArmorMaterials.IRON, ArmorType.LEGGINGS, "armor1", "swat1");

    private static final List<DeferredItem<Item>> ALL = List.of(SUNGLASSES, FBI_JACKET, FBI_BLUE_TROUSERS, SHOES,
            FBI_HELMET, FBI_BULLETPROOF_VEST, FBI_GREEN_TROUSERS, SWAT_HELMET, SWAT_BULLETPROOF_VEST, SWAT_TROUSERS);

    @SuppressWarnings("unused")
    private static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = TABS.register("fbi_swat_armors", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("item_group.fbi_swat_armors.fbi_swat_armors"))
                    .icon(() -> SUNGLASSES.get().getDefaultInstance())
                    .displayItems((context, output) -> ALL.forEach(output::accept))
                    .build());

    private static DeferredItem<Item> armor(String name, ArmorMaterial material, ArmorType type, String model, String variant) {
        return ITEMS.registerItem(name, properties -> new FbiArmorItem(properties, model, variant),
                properties -> properties.humanoidArmor(material, type));
    }

    public FbiSwatArmors(IEventBus bus) {
        ITEMS.register(bus);
        TABS.register(bus);
    }
}

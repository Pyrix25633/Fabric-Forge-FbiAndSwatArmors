package net.rupyber_studios.fbi_swat_armors.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;

public final class ModItemGroups {
    public static void register() {
        Identifier id = Identifier.fromNamespaceAndPath(FbiSwatArmors.MOD_ID, "fbi_swat_armors");
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, id,
                FabricCreativeModeTab.builder()
                        .title(Component.translatable("item_group.fbi_swat_armors.fbi_swat_armors"))
                        .icon(() -> new ItemStack(ModItems.SUNGLASSES))
                        .displayItems((context, entries) -> ModItems.ALL.forEach(entries::accept))
                        .build());
    }
}

package net.rupyber_studios.fbi_swat_armors.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;

public class ModItemGroups {
    private static final Identifier FBI_SWAT_ARMORS_ID = new Identifier(FbiSwatArmors.MOD_ID, "fbi_swat_armors");
    public static final RegistryKey<ItemGroup> FBI_SWAT_ARMORS = RegistryKey.of(RegistryKeys.ITEM_GROUP, FBI_SWAT_ARMORS_ID);

    public static void buildItemGroups() {
        Registry.register(Registries.ITEM_GROUP, FBI_SWAT_ARMORS_ID,
                FabricItemGroup.builder().displayName(Text.translatable("item_group.fbi_swat_armors.fbi_swat_armors"))
                        .icon(() -> new ItemStack(ModItems.SUNGLASSES)).build());
    }
}
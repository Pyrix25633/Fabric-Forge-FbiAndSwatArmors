package net.rupyber_studios.fbi_swat_armors.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;

public class ModItemGroup {
    public static final ItemGroup FBI_SWAT_ARMORS = FabricItemGroupBuilder.build(new Identifier(FbiSwatArmors.MOD_ID, "fbi_swat_armors"),
            () -> new ItemStack(ModItems.SUNGLASSES));
}
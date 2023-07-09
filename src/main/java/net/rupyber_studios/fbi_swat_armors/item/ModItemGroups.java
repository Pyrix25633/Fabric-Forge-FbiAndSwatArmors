package net.rupyber_studios.fbi_swat_armors.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;

public class ModItemGroups {
    public static ItemGroup FBI_SWAT_ARMORS;

    public static void registerItemGroups() {
        FBI_SWAT_ARMORS = FabricItemGroup.builder(new Identifier(FbiSwatArmors.MOD_ID, "fbi_swat_armors"))
                .displayName(Text.translatable("item_group.fbi_swat_armors.fbi_swat_armors"))
                .icon(() -> new ItemStack(ModItems.SUNGLASSES)).build();
    }
}
package net.rupyber_studios.fbi_swat_armors.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModItemGroup {
    public static final CreativeModeTab FBI_SWAT_ARMORS = new CreativeModeTab("fbi_swat_armors") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.SUNGLASSES.get());
        }
    };
}
package net.rupyber_studios.fbi_swat_armors.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = FbiSwatArmors.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroup {
    public static CreativeModeTab FBI_SWAT_ARMORS;
    public static final ArrayList<Item> FBI_SWAT_ARMORS_ITEMS = new ArrayList<>();

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        FBI_SWAT_ARMORS = event.registerCreativeModeTab(new ResourceLocation(FbiSwatArmors.MOD_ID, "fbi_swat_armors"),
                builder -> builder.icon(() -> new ItemStack(ModItems.SUNGLASSES.get()))
                        .title(Component.translatable("item_group.fbi_swat_armors.fbi_swat_armors")));
    }
}
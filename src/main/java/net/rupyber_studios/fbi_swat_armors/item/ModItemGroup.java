package net.rupyber_studios.fbi_swat_armors.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = FbiSwatArmors.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroup {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            FbiSwatArmors.MOD_ID);
    public static RegistryObject<CreativeModeTab> FBI_SWAT_ARMORS = CREATIVE_MODE_TABS.register("fbi_swat_armors",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SUNGLASSES.get()))
                    .title(Component.translatable("item_group.fbi_swat_armors.fbi_swat_armors")).build());
    public static final ArrayList<Item> FBI_SWAT_ARMORS_ITEMS = new ArrayList<>();

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
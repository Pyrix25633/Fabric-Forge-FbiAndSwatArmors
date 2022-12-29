package net.rupyber_studios.fbi_swat_armors.event;


import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.entity.client.armor.Fbi0Renderer;
import net.rupyber_studios.fbi_swat_armors.entity.client.armor.Fbi1Renderer;
import net.rupyber_studios.fbi_swat_armors.entity.client.armor.Swat1Renderer;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi0Item;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi1Item;
import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = FbiSwatArmors.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClient {

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(Fbi0Item.class, new Supplier<>() {
            private final GeoArmorRenderer<Fbi0Item> renderer = new Fbi0Renderer();
            @Override
            public GeoArmorRenderer<Fbi0Item> get() {
                return renderer;
            }
        });
        GeoArmorRenderer.registerArmorRenderer(Fbi1Item.class, new Supplier<>() {
            private final GeoArmorRenderer<Fbi1Item> renderer = new Fbi1Renderer();
            @Override
            public GeoArmorRenderer<Fbi1Item> get() {
                return renderer;
            }
        });
        GeoArmorRenderer.registerArmorRenderer(Swat1Item.class, new Supplier<>() {
            private final GeoArmorRenderer<Swat1Item> renderer = new Swat1Renderer();
            @Override
            public GeoArmorRenderer<Swat1Item> get() {
                return renderer;
            }
        });
    }
}
package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi1Item;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class Fbi1Renderer<R extends BipedEntityRenderState & GeoRenderState> extends GeoArmorRenderer<Fbi1Item, R> {
    public Fbi1Renderer() {
        super(new Fbi1Model());
    }
}

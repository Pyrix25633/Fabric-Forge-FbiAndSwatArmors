package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class Swat1Renderer<R extends BipedEntityRenderState & GeoRenderState> extends GeoArmorRenderer<Swat1Item, R> {
    public Swat1Renderer() {
        super(new Swat1Model());
    }
}

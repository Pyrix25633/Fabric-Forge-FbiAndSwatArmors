package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi0Item;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class Fbi0Renderer<R extends BipedEntityRenderState & GeoRenderState> extends GeoArmorRenderer<Fbi0Item, R> {
    public Fbi0Renderer() {
        super(new Fbi0Model());
    }
}

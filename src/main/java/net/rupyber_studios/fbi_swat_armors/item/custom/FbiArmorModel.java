package net.rupyber_studios.fbi_swat_armors.item.custom;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import net.minecraft.resources.Identifier;

public final class FbiArmorModel extends GeoModel<FbiArmorItem> {
    private final Identifier model;
    private final Identifier texture;
    private final Identifier animation;

    public FbiArmorModel(Identifier model, Identifier texture, Identifier animation) {
        this.model = model;
        this.texture = texture;
        this.animation = animation;
    }

    @Override
    public Identifier getModelResource(GeoRenderState state) {
        return this.model;
    }

    @Override
    public Identifier getTextureResource(GeoRenderState state) {
        return this.texture;
    }

    @Override
    public Identifier getAnimationResource(FbiArmorItem item) {
        return this.animation;
    }
}

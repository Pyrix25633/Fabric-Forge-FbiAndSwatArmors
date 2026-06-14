package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.util.Identifier;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class Swat1Model extends GeoModel<Swat1Item> {
    private static final Identifier MODEL_RESOURCE = Identifier.of(FbiSwatArmors.MOD_ID, "armor1");
    private static final Identifier TEXTURE_RESOURCE = Identifier.of(FbiSwatArmors.MOD_ID, "textures/models/armor/swat1.png");
    private static final Identifier ANIMATION_RESOURCE = Identifier.of(FbiSwatArmors.MOD_ID, "swat1");

    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        return MODEL_RESOURCE;
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return TEXTURE_RESOURCE;
    }

    @Override
    public Identifier getAnimationResource(Swat1Item animatable) {
        return ANIMATION_RESOURCE;
    }
}

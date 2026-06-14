package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.util.Identifier;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi1Item;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class Fbi1Model extends GeoModel<Fbi1Item> {
    private static final Identifier MODEL_RESOURCE = Identifier.of(FbiSwatArmors.MOD_ID, "armor1");
    private static final Identifier TEXTURE_RESOURCE = Identifier.of(FbiSwatArmors.MOD_ID, "textures/models/armor/fbi1.png");
    private static final Identifier ANIMATION_RESOURCE = Identifier.of(FbiSwatArmors.MOD_ID, "fbi1");

    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        return MODEL_RESOURCE;
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return TEXTURE_RESOURCE;
    }

    @Override
    public Identifier getAnimationResource(Fbi1Item animatable) {
        return ANIMATION_RESOURCE;
    }
}

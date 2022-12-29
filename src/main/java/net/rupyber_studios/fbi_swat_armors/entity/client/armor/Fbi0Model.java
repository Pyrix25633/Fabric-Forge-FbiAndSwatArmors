package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi0Item;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Fbi0Model extends AnimatedGeoModel<Fbi0Item> {
    private static final ResourceLocation MODEL_RESOURCE = new ResourceLocation(FbiSwatArmors.MOD_ID, "geo/armor0.geo.json");
    private static final ResourceLocation TEXTURE_RESOURCE = new ResourceLocation(FbiSwatArmors.MOD_ID, "textures/models/armor/fbi0.png");
    private static final ResourceLocation ANIMATION_RESOURCE = new ResourceLocation(FbiSwatArmors.MOD_ID, "animations/fbi0.animations.json");

    @Override
    public ResourceLocation getModelResource(Fbi0Item object) {
        return MODEL_RESOURCE;
    }

    @Override
    public ResourceLocation getTextureResource(Fbi0Item object) {
        return TEXTURE_RESOURCE;
    }

    @Override
    public ResourceLocation getAnimationResource(Fbi0Item animatable) {
        return ANIMATION_RESOURCE;
    }
}
package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Swat1Model extends AnimatedGeoModel<Swat1Item> {
    private static final ResourceLocation MODEL_RESOURCE = new ResourceLocation(FbiSwatArmors.MOD_ID, "geo/armor1.geo.json");
    private static final ResourceLocation TEXTURE_RESOURCE = new ResourceLocation(FbiSwatArmors.MOD_ID, "textures/models/armor/swat1.png");
    private static final ResourceLocation ANIMATION_RESOURCE = new ResourceLocation(FbiSwatArmors.MOD_ID, "animations/swat1.animations.json");

    @Override
    public ResourceLocation getModelResource(Swat1Item object) {
        return MODEL_RESOURCE;
    }

    @Override
    public ResourceLocation getTextureResource(Swat1Item object) {
        return TEXTURE_RESOURCE;
    }

    @Override
    public ResourceLocation getAnimationResource(Swat1Item animatable) {
        return ANIMATION_RESOURCE;
    }
}
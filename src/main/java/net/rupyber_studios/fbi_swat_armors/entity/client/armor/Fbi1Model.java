package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi1Item;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Fbi1Model extends AnimatedGeoModel<Fbi1Item> {
    private static final ResourceLocation MODEL_RESOURCE = new ResourceLocation(FbiSwatArmors.MOD_ID, "geo/armor1.geo.json");
    private static final ResourceLocation TEXTURE_RESOURCE = new ResourceLocation(FbiSwatArmors.MOD_ID, "textures/models/armor/fbi1.png");
    private static final ResourceLocation ANIMATION_RESOURCE = new ResourceLocation(FbiSwatArmors.MOD_ID, "animations/fbi1.animations.json");

    @Override
    public ResourceLocation getModelResource(Fbi1Item object) {
        return MODEL_RESOURCE;
    }

    @Override
    public ResourceLocation getTextureResource(Fbi1Item object) {
        return TEXTURE_RESOURCE;
    }

    @Override
    public ResourceLocation getAnimationResource(Fbi1Item animatable) {
        return ANIMATION_RESOURCE;
    }
}
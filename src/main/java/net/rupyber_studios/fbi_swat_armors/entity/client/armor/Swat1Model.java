package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.util.Identifier;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;
import software.bernie.geckolib.model.GeoModel;

public class Swat1Model extends GeoModel<Swat1Item> {
    private static final Identifier MODEL_RESOURCE = new Identifier(FbiSwatArmors.MOD_ID, "geo/armor1.geo.json");
    private static final Identifier TEXTURE_RESOURCE = new Identifier(FbiSwatArmors.MOD_ID, "textures/models/armor/swat1.png");
    private static final Identifier ANIMATION_RESOURCE = new Identifier(FbiSwatArmors.MOD_ID, "animations/swat1.animations.json");

    @Override
    public Identifier getModelResource(Swat1Item object) {
        return MODEL_RESOURCE;
    }

    @Override
    public Identifier getTextureResource(Swat1Item object) {
        return TEXTURE_RESOURCE;
    }

    @Override
    public Identifier getAnimationResource(Swat1Item animatable) {
        return ANIMATION_RESOURCE;
    }
}
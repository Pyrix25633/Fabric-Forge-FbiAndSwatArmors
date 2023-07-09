package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.util.Identifier;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi1Item;
import software.bernie.geckolib.model.GeoModel;

public class Fbi1Model extends GeoModel<Fbi1Item> {
    private static final Identifier MODEL_RESOURCE = new Identifier(FbiSwatArmors.MOD_ID, "geo/armor1.geo.json");
    private static final Identifier TEXTURE_RESOURCE = new Identifier(FbiSwatArmors.MOD_ID, "textures/models/armor/fbi1.png");
    private static final Identifier ANIMATION_RESOURCE = new Identifier(FbiSwatArmors.MOD_ID, "animations/fbi1.animations.json");

    @Override
    public Identifier getModelResource(Fbi1Item object) {
        return MODEL_RESOURCE;
    }

    @Override
    public Identifier getTextureResource(Fbi1Item object) {
        return TEXTURE_RESOURCE;
    }

    @Override
    public Identifier getAnimationResource(Fbi1Item animatable) {
        return ANIMATION_RESOURCE;
    }
}
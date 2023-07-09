package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.minecraft.util.Identifier;
import net.rupyber_studios.fbi_swat_armors.FbiSwatArmors;
import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi0Item;
import software.bernie.geckolib.model.GeoModel;

public class Fbi0Model extends GeoModel<Fbi0Item> {
    private static final Identifier MODEL_RESOURCE = new Identifier(FbiSwatArmors.MOD_ID, "geo/armor0.geo.json");
    private static final Identifier TEXTURE_RESOURCE = new Identifier(FbiSwatArmors.MOD_ID, "textures/models/armor/fbi0.png");
    private static final Identifier ANIMATION_RESOURCE = new Identifier(FbiSwatArmors.MOD_ID, "animations/fbi0.animations.json");

    @Override
    public Identifier getModelResource(Fbi0Item object) {
        return MODEL_RESOURCE;
    }

    @Override
    public Identifier getTextureResource(Fbi0Item object) {
        return TEXTURE_RESOURCE;
    }

    @Override
    public Identifier getAnimationResource(Fbi0Item animatable) {
        return ANIMATION_RESOURCE;
    }
}
package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi1Item;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class Fbi1Renderer extends GeoArmorRenderer<Fbi1Item> {
    public Fbi1Renderer() {
        super(new Fbi1Model());
        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorLeftArm";
        this.leftArmBone = "armorRightArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
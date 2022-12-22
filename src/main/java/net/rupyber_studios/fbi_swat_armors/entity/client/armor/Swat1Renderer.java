package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class Swat1Renderer extends GeoArmorRenderer<Swat1Item> {
    public Swat1Renderer() {
        super(new Swat1Model());
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
package net.rupyber_studios.fbi_swat_armors.entity.client.armor;

import net.rupyber_studios.fbi_swat_armors.item.custom.Swat1Item;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Swat1Renderer extends GeoArmorRenderer<Swat1Item> {
    public Swat1Renderer() {
        super(new Swat1Model());
    }
}
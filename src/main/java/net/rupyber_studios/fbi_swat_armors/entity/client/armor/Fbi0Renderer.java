package net.rupyber_studios.fbi_swat_armors.entity.client.armor;


import net.rupyber_studios.fbi_swat_armors.item.custom.Fbi0Item;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class Fbi0Renderer extends GeoArmorRenderer<Fbi0Item> {
    public Fbi0Renderer() {
        super(new Fbi0Model());
    }
}
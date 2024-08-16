package net.rupyber_studios.fbi_swat_armors;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.rupyber_studios.fbi_swat_armors.datagen.ModRecipeProvider;
import org.jetbrains.annotations.NotNull;

public class FbiSwatArmorsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(@NotNull FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(ModRecipeProvider::new);
    }
}
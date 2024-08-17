package net.rupyber_studios.fbi_swat_armors.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.rupyber_studios.fbi_swat_armors.item.ModItems;
import net.rupyber_studios.fbi_swat_armors.item.custom.Armor;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        for(Item item : ModItems.ALL) {
            if(item instanceof Armor armor)
                generateArmor(exporter, item, armor.getPattern(), armor.getInputs());
        }
    }

    private void generateArmor(RecipeExporter exporter, Item armor, @NotNull List<String> pattern,
                               Map<Character, ItemConvertible> inputs) {
        ShapedRecipeJsonBuilder builder = ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, armor)
                .group("fbi_and_swat");
        for(String line : pattern)
            builder.pattern(line);
        for(char c : inputs.keySet()) {
            ItemConvertible item = inputs.get(c);
            builder.input(c, item)
                    .criterion(FabricRecipeProvider.hasItem(item),
                            FabricRecipeProvider.conditionsFromItem(item));
        }
        builder.offerTo(exporter);
        System.out.println("end");
    }
}
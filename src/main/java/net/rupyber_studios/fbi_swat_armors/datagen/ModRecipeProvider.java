package net.rupyber_studios.fbi_swat_armors.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
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
    public String getName() {
        return "FBI And SWAT Armors Recipes";
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                for(Item item : ModItems.ALL) {
                    if(item instanceof Armor armor)
                        generateArmor(item, armor.getPattern(), armor.getInputs());
                }
            }

            private void generateArmor(Item armor, @NotNull List<String> pattern,
                                       Map<Character, ItemConvertible> inputs) {
                ShapedRecipeJsonBuilder builder = createShaped(RecipeCategory.COMBAT, armor)
                        .group("fbi_and_swat");
                for(String line : pattern)
                    builder.pattern(line);
                for(char c : inputs.keySet()) {
                    ItemConvertible item = inputs.get(c);
                    builder.input(c, item)
                            .criterion(hasItem(item), conditionsFromItem(item));
                }

                Identifier itemId = Registries.ITEM.getId(armor);
                RegistryKey<Recipe<?>> recipeKey = RegistryKey.of(RegistryKeys.RECIPE, itemId);
                builder.offerTo(exporter, recipeKey);
            }
        };
    }
}

package net.rupyber_studios.fbi_swat_armors.item.custom;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.rupyber_studios.fbi_swat_armors.entity.client.armor.Fbi1Renderer;
import net.rupyber_studios.fbi_swat_armors.item.ModItems;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.animatable.manager.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Fbi1Item extends Item implements GeoItem, Armor {
    private static final RawAnimation IDLE_ANIMATION = RawAnimation.begin().thenLoop("idle");
    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public Fbi1Item(Settings settings) {
        super(settings);
    }

    @Override
    public List<String> getPattern() {
        if(this == ModItems.FBI_HELMET) return List.of("###", "#G#");
        if(this == ModItems.FBI_BULLETPROOF_VEST) return List.of("#G#", "###", "###");
        if(this == ModItems.FBI_GREEN_TROUSERS) return List.of("###", "#G#", "X X");
        return List.of();
    }

    @Override
    public Map<Character, ItemConvertible> getInputs() {
        Map<Character, ItemConvertible> inputs = new HashMap<>();
        inputs.put('G', Items.GREEN_DYE);
        if(this == ModItems.FBI_HELMET || this == ModItems.FBI_BULLETPROOF_VEST)
            inputs.put('#', Items.DIAMOND);
        else if(this == ModItems.FBI_GREEN_TROUSERS) {
            inputs.put('#', Items.IRON_INGOT);
            inputs.put('X', Items.IRON_NUGGET);
        }
        return inputs;
    }

    @Override
    public void createGeoRenderer(@NotNull Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private GeoArmorRenderer<?, ?> renderer;

            @Override
            public @NotNull GeoArmorRenderer<?, ?> getGeoArmorRenderer(ItemStack itemStack, EquipmentSlot equipmentSlot) {
                if(this.renderer == null)
                    this.renderer = new Fbi1Renderer<>();
                return this.renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimatableManager.@NotNull ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>("Idle", 20, state -> state.setAndContinue(IDLE_ANIMATION)));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}

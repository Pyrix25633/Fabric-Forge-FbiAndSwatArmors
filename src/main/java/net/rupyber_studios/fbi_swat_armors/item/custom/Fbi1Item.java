package net.rupyber_studios.fbi_swat_armors.item.custom;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.rupyber_studios.fbi_swat_armors.entity.client.armor.Fbi1Renderer;
import net.rupyber_studios.fbi_swat_armors.item.ModItems;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.constant.DefaultAnimations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Fbi1Item extends ArmorItem implements GeoItem, Armor {
    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public Fbi1Item(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings);
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
            private Fbi1Renderer renderer;

            @Override
            public <T extends LivingEntity> @NotNull BipedEntityModel<?> getGeoArmorRenderer(@Nullable T livingEntity,
                                                                                             ItemStack itemStack,
                                                                                             @Nullable EquipmentSlot equipmentSlot,
                                                                                             @Nullable BipedEntityModel<T> original) {
                if(this.renderer == null)
                    this.renderer = new Fbi1Renderer();
                return this.renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimatableManager.@NotNull ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, 20, state -> {
            state.setAnimation(DefaultAnimations.IDLE);
            return PlayState.CONTINUE;
        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
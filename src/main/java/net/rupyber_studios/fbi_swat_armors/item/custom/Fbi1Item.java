package net.rupyber_studios.fbi_swat_armors.item.custom;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.rupyber_studios.fbi_swat_armors.entity.client.armor.Fbi1Renderer;
import net.rupyber_studios.fbi_swat_armors.item.ModItems;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Fbi1Item extends ArmorItem implements GeoItem, Armor {
    private final AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache(this);
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);

    public Fbi1Item(ArmorMaterial material, Type type, Settings settings) {
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

    private PlayState predicate(@NotNull AnimationState<Fbi1Item> state) {
        state.getController().setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimatableManager.@NotNull ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller", 20, this::predicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return factory;
    }

    @Override
    public void createRenderer(@NotNull Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private Fbi1Renderer renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity entity, ItemStack stack,
                                                                        EquipmentSlot slot, BipedEntityModel<LivingEntity> original) {
                if(renderer == null) renderer = new Fbi1Renderer();
                renderer.prepForRender(entity, stack, slot, original);
                return renderer;
            }
        });
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return renderProvider;
    }
}
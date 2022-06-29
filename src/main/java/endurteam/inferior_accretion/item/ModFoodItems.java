package endurteam.inferior_accretion.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodItems {
    @SuppressWarnings("unused")
    public static final FoodProperties ROTTEN_HIDE = (
            new FoodProperties.Builder())
            .nutrition(0)
            .saturationMod(0F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400, 0), 1F).meat().build();
}

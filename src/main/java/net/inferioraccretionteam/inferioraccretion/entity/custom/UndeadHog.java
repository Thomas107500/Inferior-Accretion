package net.inferioraccretionteam.inferioraccretion.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.hoglin.HoglinBase;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class UndeadHog extends Zoglin implements Enemy, HoglinBase {

    public UndeadHog(EntityType<? extends Zoglin> p_34204_, Level p_34205_) {
        super(p_34204_, p_34205_);
    }

    protected boolean isSunSensitive() {
        return true;
    }



    public static AttributeSupplier setAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 40.0D).add(Attributes.MOVEMENT_SPEED, (double)0.3F).add(Attributes.KNOCKBACK_RESISTANCE, (double)0.6F).add(Attributes.ATTACK_KNOCKBACK, 1.0D).add(Attributes.ATTACK_DAMAGE, 6.0D).build();
    }

    @Override
    public void aiStep() {

        if (this.isAlive()) {
            boolean flag = isSunSensitive() && this.isSunBurnTick();
            if (flag) {
                this.setSecondsOnFire(8);
            }
        }

        super.aiStep();
    }
}

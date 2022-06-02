package net.inferioraccretionteam.inferioraccretion.entity.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import net.inferioraccretionteam.inferioraccretion.entity.ModEntityTypes;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.Brain;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.behavior.*;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.memory.NearestVisibleLivingEntities;
import net.minecraft.world.entity.ai.sensing.Sensor;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.hoglin.HoglinBase;
import net.minecraft.world.entity.schedule.Activity;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Optional;

public class UndeadHog extends Zoglin implements Enemy, HoglinBase{

    public UndeadHog(EntityType<? extends Zoglin> p_34204_, Level p_34205_) {
        super(p_34204_, p_34205_);
    }

    protected boolean isSunSensitive() {
        return true;
    }

    protected Brain.Provider<UndeadHog> hogBrainProvider() {
        return Brain.provider(MEMORY_TYPES, SENSOR_TYPES);
    }

    protected Brain<?> makeBrain(Dynamic<?> pDynamic) {
        //Brain<UndeadHog> brain = this.brainProvider().makeBrain(pDynamic);
        Brain<UndeadHog> brain = this.hogBrainProvider().makeBrain(pDynamic);
        initCoreActivity(brain);
        initIdleActivity(brain);
        initFightActivity(brain);
        brain.setCoreActivities(ImmutableSet.of(Activity.CORE));
        brain.setDefaultActivity(Activity.IDLE);
        brain.useDefaultActivity();
        return brain;
    }

    private static void initCoreActivity(Brain<UndeadHog> brain) {
        brain.addActivity(Activity.CORE, 0, ImmutableList.of(new LookAtTargetSink(45, 90), new MoveToTargetSink()));
    }

    private static void initIdleActivity(Brain<UndeadHog> brain) {
        brain.addActivity(Activity.IDLE, 10, ImmutableList.of(new StartAttacking<UndeadHog>(UndeadHog::findNearestValidAttackTarget), new RunSometimes<UndeadHog>(new SetEntityLookTarget(8.0F), UniformInt.of(30, 60)), new RunOne<UndeadHog>(ImmutableList.of(Pair.of(new RandomStroll(0.4F), 2), Pair.of(new SetWalkTargetFromLookTarget(0.4F, 3), 2), Pair.of(new DoNothing(30, 60), 1)))));
    }

    private static void initFightActivity(Brain<UndeadHog> brain) {
        brain.addActivityAndRemoveMemoryWhenStopped(Activity.FIGHT, 10, ImmutableList.<net.minecraft.world.entity.ai.behavior.Behavior<net.minecraft.world.entity.Mob>>of(new SetWalkTargetFromAttackTargetIfTargetOutOfReach(1.0F), (net.minecraft.world.entity.ai.behavior.Behavior<net.minecraft.world.entity.Mob>)(net.minecraft.world.entity.ai.behavior.Behavior)new RunIf<Zoglin>(Zoglin::isAdult, new MeleeAttack(40)), (net.minecraft.world.entity.ai.behavior.Behavior<net.minecraft.world.entity.Mob>)(net.minecraft.world.entity.ai.behavior.Behavior)new RunIf<Zoglin>(Zoglin::isBaby, new MeleeAttack(15)), new StopAttackingIfTargetInvalid()), MemoryModuleType.ATTACK_TARGET);
    }

    private Optional<? extends LivingEntity> findNearestValidAttackTarget() {
        return this.getBrain().getMemory(MemoryModuleType.NEAREST_VISIBLE_LIVING_ENTITIES).orElse(NearestVisibleLivingEntities.empty()).findClosest(this::isTargetable);
    }

    private boolean isTargetable(LivingEntity p_34253_) {
        EntityType<?> entitytype = p_34253_.getType();
        return entitytype != ModEntityTypes.UNDEAD_HOG.get() && entitytype != EntityType.CREEPER && Sensor.isEntityAttackable(this, p_34253_);
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

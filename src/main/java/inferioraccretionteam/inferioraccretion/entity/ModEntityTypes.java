package inferioraccretionteam.inferioraccretion.entity;

import inferioraccretionteam.inferioraccretion.InferiorAccretion;
import inferioraccretionteam.inferioraccretion.entity.custom.UndeadHog;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, InferiorAccretion.MOD_ID);

    public static final RegistryObject<EntityType<UndeadHog>> UNDEAD_HOG = ENTITY_TYPES.register("undead_hog",() ->
            EntityType.Builder.of(UndeadHog::new, MobCategory.MONSTER)
                    .sized(1.3965f,1.4f)
                    .build(new ResourceLocation(InferiorAccretion.MOD_ID,"undead_hog").toString()));


    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}

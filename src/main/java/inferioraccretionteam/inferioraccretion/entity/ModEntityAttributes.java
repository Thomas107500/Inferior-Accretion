package inferioraccretionteam.inferioraccretion.entity;

import inferioraccretionteam.inferioraccretion.InferiorAccretion;
import inferioraccretionteam.inferioraccretion.entity.custom.UndeadHog;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static inferioraccretionteam.inferioraccretion.InferiorAccretion.LOGGER;

@Mod.EventBusSubscriber(modid = InferiorAccretion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityAttributes {

    @SubscribeEvent
    public static void registerAttribute(EntityAttributeCreationEvent event){
        LOGGER.debug("Registering Entity Attributes...");
        event.put(ModEntityTypes.UNDEAD_HOG.get(), UndeadHog.setAttributes());

    }
}

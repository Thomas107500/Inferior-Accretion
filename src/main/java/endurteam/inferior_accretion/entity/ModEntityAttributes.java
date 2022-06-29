package endurteam.inferior_accretion.entity;

import endurteam.inferior_accretion.InferiorAccretion;
import endurteam.inferior_accretion.entity.custom.UndeadHog;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static endurteam.inferior_accretion.InferiorAccretion.LOGGER;

@Mod.EventBusSubscriber(modid = InferiorAccretion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityAttributes {

    @SubscribeEvent
    public static void registerAttribute(EntityAttributeCreationEvent event){
        LOGGER.debug("Registering Entity Attributes...");
        event.put(ModEntityTypes.UNDEAD_HOG.get(), UndeadHog.setAttributes());

    }
}

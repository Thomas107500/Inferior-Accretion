package net.inferioraccretionteam.inferioraccretion.entity;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.inferioraccretionteam.inferioraccretion.entity.custom.UndeadHog;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.inferioraccretionteam.inferioraccretion.InferiorAccretion.LOGGER;

@Mod.EventBusSubscriber(modid = InferiorAccretion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityAttributes {

    @SubscribeEvent
    public static void registerAttribute(EntityAttributeCreationEvent event){
        LOGGER.info("[Inferior Accretion] Registering Entity Attributes...");
        event.put(ModEntityTypes.UNDEAD_HOG.get(), UndeadHog.setAttributes());

    }
}

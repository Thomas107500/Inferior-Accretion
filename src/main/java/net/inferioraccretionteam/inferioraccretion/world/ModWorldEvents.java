package net.inferioraccretionteam.inferioraccretion.world;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.inferioraccretionteam.inferioraccretion.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.inferioraccretionteam.inferioraccretion.InferiorAccretion.LOGGER;

@Mod.EventBusSubscriber(modid = InferiorAccretion.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        LOGGER.info("[Inferior Accretion] Handling Ore Generation...");
        ModOreGeneration.generateOres(event);
    }
}

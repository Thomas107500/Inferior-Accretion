package net.inferioraccretionteam.inferioraccretion.entity;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.inferioraccretionteam.inferioraccretion.entity.client.UndeadHogModel;
import net.inferioraccretionteam.inferioraccretion.entity.client.UndeadHogRenderer;
import net.inferioraccretionteam.inferioraccretion.entity.custom.UndeadHog;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InferiorAccretion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEntityRenderers {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(UndeadHogModel.LAYER_LOCATION,UndeadHogModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(ModEntityTypes.UNDEAD_HOG.get(), UndeadHogRenderer::new);
    }



}

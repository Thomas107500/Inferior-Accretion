package endurteam.inferior_accretion.entity;

import endurteam.inferior_accretion.entity.client.UndeadHogModel;
import endurteam.inferior_accretion.entity.client.UndeadHogRenderer;
import endurteam.inferior_accretion.InferiorAccretion;
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

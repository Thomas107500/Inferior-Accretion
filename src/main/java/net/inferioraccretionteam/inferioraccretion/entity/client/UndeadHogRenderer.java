package net.inferioraccretionteam.inferioraccretion.entity.client;

import net.inferioraccretionteam.inferioraccretion.entity.custom.UndeadHog;
import net.minecraft.client.model.HoglinModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
public class UndeadHogRenderer extends MobRenderer<UndeadHog, UndeadHogModel<UndeadHog>> {
    private static final ResourceLocation UNDEADHOG_LOCATION = new ResourceLocation("inferioraccretion:textures/entity/undead_hog/undead_hog.png");

    public UndeadHogRenderer(EntityRendererProvider.Context p_174454_) {
        super(p_174454_, new UndeadHogModel<>(p_174454_.bakeLayer(UndeadHogModel.LAYER_LOCATION)), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(UndeadHog pEntity) {
        return UNDEADHOG_LOCATION;
    }
}

package endurteam.inferior_accretion.world.level.levelgen.feature;

import endurteam.inferior_accretion.InferiorAccretion;
import endurteam.inferior_accretion.world.level.levelgen.feature.configurations.CaveCoverConfiguration;
import endurteam.inferior_accretion.world.level.levelgen.feature.configurations.SimpleBlockWithBambooConfiguration;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures
{
	public static final DeferredRegister<Feature<?>> FEATURES =
			DeferredRegister.create(Registry.FEATURE_REGISTRY, InferiorAccretion.MOD_ID);



	@SuppressWarnings("unused")
	public static final RegistryObject<Feature<CaveCoverConfiguration>> CAVE_COVER = FEATURES.register("cave_cover", () ->
			new CaveCoverFeature(CaveCoverConfiguration.CODEC));

	@SuppressWarnings("unused")
	public static final RegistryObject<Feature<SimpleBlockWithBambooConfiguration>> SIMPLE_BLOCK_WITH_BAMBOO
			= FEATURES.register("simple_block_with_bamboo", () ->
			new SimpleBlockWithBambooFeature(SimpleBlockWithBambooConfiguration.CODEC));



	public static void register(IEventBus eventBus){
		FEATURES.register(eventBus);
	}
}

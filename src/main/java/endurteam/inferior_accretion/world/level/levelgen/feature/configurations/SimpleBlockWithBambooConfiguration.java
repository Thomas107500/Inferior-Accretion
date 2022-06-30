package endurteam.inferior_accretion.world.level.levelgen.feature.configurations;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public record SimpleBlockWithBambooConfiguration(float probability, BlockStateProvider toPlace) implements FeatureConfiguration
{
	public static final Codec<SimpleBlockWithBambooConfiguration> CODEC = RecordCodecBuilder.create((instance) ->
			instance.group(
					Codec.floatRange(0.0F, 1.0F).fieldOf("probability")
							.forGetter((configuration) -> configuration.probability),
					BlockStateProvider.CODEC.fieldOf("to_place")
							.forGetter((configuration) -> configuration.toPlace))
					.apply(instance, SimpleBlockWithBambooConfiguration::new));
}

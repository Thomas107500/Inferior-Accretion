package endurteam.inferior_accretion.world.level.levelgen.feature.configurations;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public record CaveCoverConfiguration(BlockState state, IntProvider sphereRadius) implements FeatureConfiguration
{
	public static final Codec<CaveCoverConfiguration> CODEC = RecordCodecBuilder.create((instance) ->
			instance.group(BlockState.CODEC.fieldOf("state")
									.forGetter((configuration) -> configuration.state),
							IntProvider.codec(8, 16).fieldOf("sphereRadius")
									.forGetter((configuration) -> configuration.sphereRadius))
					.apply(instance, CaveCoverConfiguration::new));


}

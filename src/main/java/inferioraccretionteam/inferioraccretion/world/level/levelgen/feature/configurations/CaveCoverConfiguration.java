package inferioraccretionteam.inferioraccretion.world.level.levelgen.feature.configurations;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class CaveCoverConfiguration implements FeatureConfiguration
{
	public static final Codec<CaveCoverConfiguration> CODEC = RecordCodecBuilder.create((instance) ->
			instance.group(BlockState.CODEC.fieldOf("state")
							.forGetter((caveCoverConfiguration) -> caveCoverConfiguration.state),
							Codec.intRange(0, 64).fieldOf("sphereRadius")
									.forGetter((caveCoverConfiguration) -> caveCoverConfiguration.sphereRadius))
					.apply(instance, CaveCoverConfiguration::new));
	public final BlockState state;
	public final int sphereRadius;

	public CaveCoverConfiguration(BlockState state, int sphereRadius)
	{
		this.state = state;
		this.sphereRadius = sphereRadius;
	}
}

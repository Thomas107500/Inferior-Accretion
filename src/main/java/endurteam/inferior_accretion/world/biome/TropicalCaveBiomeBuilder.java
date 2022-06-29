package endurteam.inferior_accretion.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.SharedConstants;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;
import terrablender.api.ParameterUtils;

import java.util.List;
import java.util.function.Consumer;

public class TropicalCaveBiomeBuilder extends OverworldBiomeBuilder
{
	@Override
	@SuppressWarnings("NullableProblems")
	protected void addBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
	{
		super.addBiomes(mapper);
		List<Climate.ParameterPoint> tropicalCavePoints = new ParameterUtils.ParameterPointListBuilder()
				.temperature(ParameterUtils.Temperature.WARM)
				.humidity(ParameterUtils.Humidity.HUMID, ParameterUtils.Humidity.NEUTRAL, ParameterUtils.Humidity.WET)
				.continentalness(
						ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.NEAR_INLAND,
								ParameterUtils.Continentalness.FAR_INLAND))
				.erosion(ParameterUtils.Erosion.FULL_RANGE)
				.depth(Climate.Parameter.span(0.7f, 1.0f))
				.weirdness(ParameterUtils.Weirdness.FULL_RANGE)
				.offset(0L)
				.build();
		if (!SharedConstants.debugGenerateSquareTerrainWithoutNoise) {
			tropicalCavePoints.forEach((point) -> mapper.accept(Pair.of(point, ModBiomes.TROPICAL_CAVE.getKey())));
		}
	}
}

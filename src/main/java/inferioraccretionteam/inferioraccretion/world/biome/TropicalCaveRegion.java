package inferioraccretionteam.inferioraccretion.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.levelgen.SurfaceRules;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.List;
import java.util.function.Consumer;

public class TropicalCaveRegion extends Region {
    public TropicalCaveRegion(ResourceLocation name, RegionType type, int weight) {
        super(name, type, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper){
        //this.addBiomeSimilar(mapper, Biomes.LUSH_CAVES, ModBiomes.TROPICAL_CAVE.getKey());

        List<Climate.ParameterPoint> tropicalCavePoints = new ParameterUtils.ParameterPointListBuilder()
                .temperature(ParameterUtils.Temperature.WARM)
                .humidity(ParameterUtils.Humidity.HUMID, ParameterUtils.Humidity.NEUTRAL, ParameterUtils.Humidity.WET)
                .continentalness(
                        ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.FAR_INLAND, ParameterUtils.Continentalness.MID_INLAND),
                        ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.NEAR_INLAND))
                .erosion(ParameterUtils.Erosion.FULL_RANGE)
                .depth(Climate.Parameter.span(0.7F, 1.0F))
                .weirdness(ParameterUtils.Weirdness.FULL_RANGE)
                .build();

        tropicalCavePoints.forEach((point) -> {
            this.addBiome(mapper, point, ModBiomes.TROPICAL_CAVE.getKey());
        });
    }
    //LevelAccessor
}

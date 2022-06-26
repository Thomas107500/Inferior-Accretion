package inferioraccretionteam.inferioraccretion.world.feature;

import inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Optional;

import static inferioraccretionteam.inferioraccretion.InferiorAccretion.LOGGER;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, InferiorAccretion.MOD_ID);

    @SuppressWarnings("unused")
    public static final RegistryObject<PlacedFeature> ALABASTER_PLACED = PLACED_FEATURES.register("alabaster_placed",
            () -> {
                Optional<Holder<ConfiguredFeature<?, ?>>> alabasterHolder = ModConfiguredFeatures.ALABASTER.getHolder();
                if (alabasterHolder.isPresent()) {
                    return new PlacedFeature(alabasterHolder.get(),
                            //veins per chunk
                            List.of(CountPlacement.of(3) ,
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(-45)),
                                    BiomeFilter.biome()));
                } else {
                    LOGGER.warn("Alabaster holder optional is empty, ignoring...");
                    return null;
                }
    });

    @SuppressWarnings("unused")
    public static final RegistryObject<PlacedFeature> SERENE_PLACED = PLACED_FEATURES.register("serene_placed",
            () -> {
                Optional<Holder<ConfiguredFeature<?, ?>>> sereneHolder = ModConfiguredFeatures.SERENE.getHolder();
                if (sereneHolder.isPresent())
                {
                    return new PlacedFeature(sereneHolder.get(),
                            //veins per chunk
                            List.of(CountPlacement.of(3),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.triangle(VerticalAnchor.absolute(45), VerticalAnchor.absolute(62)),
                                    BiomeFilter.biome()));
                }
                else
                {
                    LOGGER.warn("Serene holder optional is empty, ignoring...");
                    return null;
                }
    });

    @SuppressWarnings("unused")
    public static final RegistryObject<PlacedFeature> DRYSTONE_PLACED = PLACED_FEATURES.register("drystone_placed",
            () -> {
                Optional<Holder<ConfiguredFeature<?, ?>>> drystoneHolder = ModConfiguredFeatures.DRYSTONE.getHolder();
                if (drystoneHolder.isPresent())
                {
                    return new PlacedFeature(drystoneHolder.get(),
                            //veins per chunk
                            List.of(CountPlacement.of(4) ,
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.absolute(40), VerticalAnchor.absolute(146)),
                                    BiomeFilter.biome()));
                }
                else
                {
                    LOGGER.warn("Drystone holder optional is empty, ignoring...");
                    return null;
                }
            });

    @SuppressWarnings("unused")
    public static final RegistryObject<PlacedFeature> LIMESTONE_PLACED = PLACED_FEATURES.register("drystone_placed",
            () -> {
                Optional<Holder<ConfiguredFeature<?, ?>>> limestoneHolder = ModConfiguredFeatures.DRYSTONE.getHolder();
                if (limestoneHolder.isPresent())
                {
                    return new PlacedFeature(limestoneHolder.get(),
                            //veins per chunk
                            List.of(CountPlacement.of(125) ,
                                    InSquarePlacement.spread(),
                                    PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                                    BiomeFilter.biome()));
                }
                else
                {
                    LOGGER.warn("Limestone holder optional is empty, ignoring...");
                    return null;
                }
            });

    @SuppressWarnings("unused")
    public static final RegistryObject<PlacedFeature> TROPICAL_CAVE_VEGETATION = PLACED_FEATURES.register("drystone_placed",
            () -> {
                Optional<Holder<ConfiguredFeature<?, ?>>> tropicalCaveVegetationHolder = ModConfiguredFeatures.DRYSTONE.getHolder();
                if (tropicalCaveVegetationHolder.isPresent())
                {
                    return new PlacedFeature(tropicalCaveVegetationHolder.get(),
                            //veins per chunk
                            List.of(CountPlacement.of(125) ,
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(20)),
                                    BiomeFilter.biome()));
                }
                else
                {
                    LOGGER.warn("Tropical Cave Vegetation holder optional is empty, ignoring...");
                    return null;
                }
            });

    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }

}

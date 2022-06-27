package inferioraccretionteam.inferioraccretion.world.level.levelgen.feature;

import inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, InferiorAccretion.MOD_ID);

    @SuppressWarnings("unused")
    public static final RegistryObject<PlacedFeature> ALABASTER_PLACED = PLACED_FEATURES.register("alabaster_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ALABASTER.getHolder().orElseThrow(),
                            //veins per chunk
                            List.of(CountPlacement.of(3) ,
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(-45)),
                                    BiomeFilter.biome()))
                );

    @SuppressWarnings("unused")
    public static final RegistryObject<PlacedFeature> SERENE_PLACED = PLACED_FEATURES.register("serene_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SERENE.getHolder().orElseThrow(),
                            //veins per chunk
                            List.of(CountPlacement.of(3),
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.triangle(VerticalAnchor.absolute(45), VerticalAnchor.absolute(62)),
                                    BiomeFilter.biome())));

    @SuppressWarnings("unused")
    public static final RegistryObject<PlacedFeature> DRYSTONE_PLACED = PLACED_FEATURES.register("drystone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.DRYSTONE.getHolder().orElseThrow(),
                            //veins per chunk
                            List.of(CountPlacement.of(4) ,
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.absolute(40), VerticalAnchor.absolute(146)),
                                    BiomeFilter.biome())));

    @SuppressWarnings("unused")
    public static final RegistryObject<PlacedFeature> LIMESTONE_CAVE_COVER = PLACED_FEATURES.register("limestone_cave_cover",
            () -> new PlacedFeature(ModConfiguredFeatures.LIMESTONE_CAVE_COVER.getHolder().orElseThrow(),
                    //veins per chunk
                    List.of(CountPlacement.of(256),
                            InSquarePlacement.spread(),
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(20)),
                            BiomeFilter.biome())));

    @SuppressWarnings("unused")
    public static final RegistryObject<PlacedFeature> TROPICAL_CAVE_FLOOR_VEGETATION = PLACED_FEATURES.register("tropical_cave_floor_vegetation",
            () -> new PlacedFeature(ModConfiguredFeatures.TROPICAL_MOSS_PATCH.getHolder().orElseThrow(),
                            //veins per chunk
                            List.of(CountPlacement.of(125) ,
                                    InSquarePlacement.spread(),
                                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(20)),
                                    BiomeFilter.biome())));

    /*
    public static final RegistryObject<PlacedFeature> TROPICAL_CAVE_BAMBOO = PLACED_FEATURES.register("tropical_cave_bamboo",
            () -> new PlacedFeature(ModConfiguredFeatures.TROPICAL_BAMBOO.getHolder().orElseThrow(),
                    List.of(CountPlacement.of(10),
                            InSquarePlacement.spread(),
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(-53), VerticalAnchor.absolute(20)),
                            BiomeFilter.biome()))
                    );

     */

    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }

}

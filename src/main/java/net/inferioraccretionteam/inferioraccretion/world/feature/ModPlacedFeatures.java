package net.inferioraccretionteam.inferioraccretion.world.feature;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
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

    public static final RegistryObject<PlacedFeature> ALABASTER_PLACED = PLACED_FEATURES.register("alabaster_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ALABASTER.getHolder().get(),
                    //veins per chunk
                    List.of(CountPlacement.of(3) ,
                            InSquarePlacement.spread(),
                            HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(-45)),
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> SERENE_PLACED = PLACED_FEATURES.register("serene_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SERENE.getHolder().get(),
                    //veins per chunk
                    List.of(CountPlacement.of(3) ,
                            InSquarePlacement.spread(),
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(45), VerticalAnchor.absolute(62)),
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> DRYSTONE_PLACED = PLACED_FEATURES.register("drystone_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.DRYSTONE.getHolder().get(),
                    //veins per chunk
                    List.of(CountPlacement.of(4) ,
                            InSquarePlacement.spread(),
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(40), VerticalAnchor.absolute(146)),
                            BiomeFilter.biome())));

    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }

}

package net.inferioraccretionteam.inferioraccretion.world.feature;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.inferioraccretionteam.inferioraccretion.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, InferiorAccretion.MOD_ID);

    //TODO: this cannot be static, but we need it in the thing below, maybe use another constructor?
    /*public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ALABASTER = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ALABASTER.get().defaultBlockState())
    );*/

    //TODO: should spawn next to deepslate diamond instead, improvement needed
    public static final RegistryObject<ConfiguredFeature<?,?>> ALABASTER = CONFIGURED_FEATURES.register("alabaster",
            ()->new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(
                    List.of(
                            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ALABASTER.get().defaultBlockState())
                    ),16)));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }



    /*
    public static final Holder<ConfiguredFeature<OreConfiguration,?>> ALABASTER = CONFIGURED_FEATURES.register(
            "alabaster",
            Feature.ORE,
            new OreConfiguration(OVERWORLD_ALABASTER,15));*/
}

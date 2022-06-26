package inferioraccretionteam.inferioraccretion.world.feature;

import inferioraccretionteam.inferioraccretion.InferiorAccretion;
import inferioraccretionteam.inferioraccretion.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, InferiorAccretion.MOD_ID);



    //TODO: should spawn next to deepslate diamond instead, improvement needed
    @SuppressWarnings("unused")
    public static final RegistryObject<ConfiguredFeature<?,?>> ALABASTER = CONFIGURED_FEATURES.register("alabaster",
            ()->new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(
                    List.of(
                            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ALABASTER.get().defaultBlockState())
                    ),16)));

    @SuppressWarnings("unused")
    public static final RegistryObject<ConfiguredFeature<?,?>> SERENE = CONFIGURED_FEATURES.register("serene",
            ()->new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(
                    List.of(
                            OreConfiguration.target(new BlockMatchTest(Blocks.SANDSTONE), ModBlocks.SERENE.get().defaultBlockState())
                    ),16)));

    @SuppressWarnings("unused")
    public static final RegistryObject<ConfiguredFeature<?,?>> DRYSTONE = CONFIGURED_FEATURES.register("drystone",
            ()->new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(
                    List.of(
                            OreConfiguration.target(new BlockMatchTest(Blocks.RED_TERRACOTTA), ModBlocks.DRYSTONE.get().defaultBlockState())
                    ),34)));



    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}

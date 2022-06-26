package net.inferioraccretionteam.inferioraccretion.world.biome;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.inferioraccretionteam.inferioraccretion.item.ModItems;
import net.inferioraccretionteam.inferioraccretion.world.feature.ModPlacedFeatures;
import net.minecraft.core.Registry;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.CavePlacements;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBiomes {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, InferiorAccretion.MOD_ID);


    private static MobSpawnSettings.Builder createBuilderWithDefaultSpawns(){
        MobSpawnSettings.Builder builder = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.commonSpawns(builder);
        return builder;
    }

    private static int calculateSkyColor(float temperature) {
        float $$1 = temperature / 3.0F;
        $$1 = Mth.clamp($$1, -1.0F, 1.0F);
        return Mth.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }



    public static final RegistryObject<Biome> TROPICAL_CAVE = BIOMES.register("tropical_cave",() -> new Biome.BiomeBuilder()
            .biomeCategory(Biome.BiomeCategory.UNDERGROUND)
            .precipitation(Biome.Precipitation.RAIN)
            .temperature(0.5f)
            .downfall(0.5f)
            .mobSpawnSettings(
                     createBuilderWithDefaultSpawns()
                    .addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.TROPICAL_FISH, 25, 8, 8))
                    .build())
            .generationSettings(new BiomeGenerationSettings.Builder()
                    .addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.LIMESTONE_PLACED.getHolder().get())
                    .addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.TROPICAL_CAVE_VEGETATION.getHolder().get())
                    .build())
            .specialEffects(new BiomeSpecialEffects.Builder()
                    .fogColor(12638463)
                    .waterColor(4159204)
                    .waterFogColor(4159204)
                    .skyColor(calculateSkyColor(0.5f))
                    .build())
            .build());







    public static void register(IEventBus eventBus){
        BIOMES.register(eventBus);
    }

}

package net.inferioraccretionteam.inferioraccretion.world.gen;

import net.inferioraccretionteam.inferioraccretion.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event){

        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,ModPlacedFeatures.ALABASTER_PLACED.getHolder().get());

        if(event.getCategory() == Biome.BiomeCategory.DESERT){
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,ModPlacedFeatures.SERENE_PLACED.getHolder().get());
        }
    }
}

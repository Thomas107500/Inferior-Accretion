package endurteam.inferior_accretion;

import com.mojang.logging.LogUtils;
import endurteam.inferior_accretion.block.ModBlocks;
import endurteam.inferior_accretion.datafix.ModItemMapper;
import endurteam.inferior_accretion.entity.ModEntityTypes;
import endurteam.inferior_accretion.item.ModItems;
import endurteam.inferior_accretion.world.biome.ModBiomes;
import endurteam.inferior_accretion.world.level.levelgen.feature.ModConfiguredFeatures;
import endurteam.inferior_accretion.world.level.levelgen.feature.ModPlacedFeatures;
import endurteam.inferior_accretion.world.biome.TropicalCaveRegion;
import endurteam.inferior_accretion.world.level.levelgen.feature.ModFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(InferiorAccretion.MOD_ID)
public class InferiorAccretion
{
    public static final String MOD_ID = "inferior_accretion";

    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    public InferiorAccretion()
    {
        // Register the setup method for modloading

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::setup);
        ModBlocks.register(eventBus);
        ModItems.register(eventBus);
        ModEntityTypes.register(eventBus);
        ModConfiguredFeatures.register(eventBus);
        ModPlacedFeatures.register(eventBus);
        ModFeatures.register(eventBus);
        ModBiomes.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        ModItemMapper.register();
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            Regions.register(new TropicalCaveRegion(new ResourceLocation(MOD_ID, "tropical_cave_region"), RegionType.OVERWORLD, 2));

            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, SurfaceRules.sequence());
        });
    }
}

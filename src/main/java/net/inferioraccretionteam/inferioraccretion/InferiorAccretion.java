package net.inferioraccretionteam.inferioraccretion;

import com.mojang.logging.LogUtils;
import net.inferioraccretionteam.inferioraccretion.block.ModBlocks;
import net.inferioraccretionteam.inferioraccretion.entity.ModEntityTypes;
import net.inferioraccretionteam.inferioraccretion.item.ModItems;
import net.inferioraccretionteam.inferioraccretion.world.biome.ModBiomes;
import net.inferioraccretionteam.inferioraccretion.world.biome.TropicalCaveRegion;
import net.inferioraccretionteam.inferioraccretion.world.biome.surface_rule.TropicalCaveSurfaceRuleData;
import net.inferioraccretionteam.inferioraccretion.world.feature.ModConfiguredFeatures;
import net.inferioraccretionteam.inferioraccretion.world.feature.ModPlacedFeatures;
import net.minecraft.resources.ResourceLocation;
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
    public static final String MOD_ID = "inferioraccretion";

    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    public InferiorAccretion()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(eventBus);
        ModItems.register(eventBus);
        ModEntityTypes.register(eventBus);
        ModConfiguredFeatures.register(eventBus);
        ModPlacedFeatures.register(eventBus);
        ModBiomes.register(eventBus);






        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        /*
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        */

    }


    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            Regions.register(new TropicalCaveRegion(new ResourceLocation(MOD_ID, "tropical_cave_region"), RegionType.OVERWORLD, 2));

            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, TropicalCaveSurfaceRuleData.makeRules());
        });
    }





    /*
    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // Some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // Some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.messageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
            // Register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
    */
}

package inferioraccretionteam.inferioraccretion;

import com.mojang.logging.LogUtils;
import inferioraccretionteam.inferioraccretion.block.ModBlocks;
import inferioraccretionteam.inferioraccretion.entity.ModEntityTypes;
import inferioraccretionteam.inferioraccretion.item.ModItems;
import inferioraccretionteam.inferioraccretion.world.feature.ModConfiguredFeatures;
import inferioraccretionteam.inferioraccretion.world.feature.ModPlacedFeatures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

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

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}

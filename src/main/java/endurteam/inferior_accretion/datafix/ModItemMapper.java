package endurteam.inferior_accretion.datafix;

import endurteam.inferior_accretion.InferiorAccretion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.registries.MissingMappingsEvent;


public class ModItemMapper
{
	public static void register()
	{
		MinecraftForge.EVENT_BUS.addListener(ModItemMapper::onMissingMappingsEvent);
	}

	private static void onMissingMappingsEvent(MissingMappingsEvent event)
	{
		InferiorAccretion.LOGGER.debug(event.getKey().toString() + ", " + event.getRegistry().getRegistryName().toString());
	}
}

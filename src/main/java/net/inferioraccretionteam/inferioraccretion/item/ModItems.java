package net.inferioraccretionteam.inferioraccretion.item;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.inferioraccretionteam.inferioraccretion.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InferiorAccretion.MOD_ID);

    public static final RegistryObject<Item> UNDEAD_HOG_SPAWN_EGG = ITEMS.register("undead_hog_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.UNDEAD_HOG,
                    0x888958,
                    0x524e30,
                    new Item.Properties().tab(ModCreativeModeTab.INFERIOR_ACCRETION_TAB)));

    public static final RegistryObject<Item> ROTTEN_HIDE = ITEMS.register("rotten_hide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INFERIOR_ACCRETION_TAB).food(ModFoodItems.ROTTEN_HIDE)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

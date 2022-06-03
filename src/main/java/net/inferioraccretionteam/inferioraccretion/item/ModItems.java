package net.inferioraccretionteam.inferioraccretion.item;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.inferioraccretionteam.inferioraccretion.entity.ModEntityTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
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

    public static final RegistryObject<Item> STALE_CAP = ITEMS.register("stale_cap",
            () -> new ArmorItem(ModArmorMaterials.STALE, EquipmentSlot.HEAD,new Item.Properties().tab(ModCreativeModeTab.INFERIOR_ACCRETION_TAB)));

    public static final RegistryObject<Item> STALE_TUNIC = ITEMS.register("stale_tunic",
            () -> new ArmorItem(ModArmorMaterials.STALE, EquipmentSlot.CHEST,new Item.Properties().tab(ModCreativeModeTab.INFERIOR_ACCRETION_TAB)));

    public static final RegistryObject<Item> STALE_PANTS = ITEMS.register("stale_pants",
            () -> new ArmorItem(ModArmorMaterials.STALE, EquipmentSlot.LEGS,new Item.Properties().tab(ModCreativeModeTab.INFERIOR_ACCRETION_TAB)));

    public static final RegistryObject<Item> STALE_BOOTS = ITEMS.register("stale_boots",
            () -> new ArmorItem(ModArmorMaterials.STALE, EquipmentSlot.FEET,new Item.Properties().tab(ModCreativeModeTab.INFERIOR_ACCRETION_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

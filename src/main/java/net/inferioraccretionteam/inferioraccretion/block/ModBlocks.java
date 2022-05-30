package net.inferioraccretionteam.inferioraccretion.block;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.inferioraccretionteam.inferioraccretion.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, InferiorAccretion.MOD_ID);

    public static final RegistryObject<Block> LIMESTONE = registerBlock(
            "limestone",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                        .strength(0.75f)
                        .sound(SoundType.CALCITE)
                        .requiresCorrectToolForDrops())
            ,CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> POLISHED_LIMESTONE = registerBlock(
            "polished_limestone",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(0.75f)
                            .sound(SoundType.CALCITE)
                            .requiresCorrectToolForDrops())
            ,CreativeModeTab.TAB_BUILDING_BLOCKS);





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

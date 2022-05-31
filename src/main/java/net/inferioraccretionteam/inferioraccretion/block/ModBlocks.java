package net.inferioraccretionteam.inferioraccretion.block;

import net.inferioraccretionteam.inferioraccretion.InferiorAccretion;
import net.inferioraccretionteam.inferioraccretion.item.ModCreativeModeTab;
import net.inferioraccretionteam.inferioraccretion.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
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
                        .explosionResistance(0.75f)
                        .sound(SoundType.CALCITE)
                        .requiresCorrectToolForDrops())
            , ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerBlock(
            "limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(0.75f)
                            .explosionResistance(0.75f)
                            .sound(SoundType.CALCITE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> LIMESTONE_SLAB = registerBlock(
            "limestone_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(0.75f)
                            .explosionResistance(0.75f)
                            .sound(SoundType.CALCITE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> LIMESTONE_WALL = registerBlock(
            "limestone_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(0.75f)
                            .explosionResistance(0.75f)
                            .sound(SoundType.CALCITE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);




    public static final RegistryObject<Block> POLISHED_LIMESTONE = registerBlock(
            "polished_limestone",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(0.75f)
                            .explosionResistance(0.75f)
                            .sound(SoundType.CALCITE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> POLISHED_LIMESTONE_STAIRS = registerBlock(
            "polished_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(0.75f)
                            .explosionResistance(0.75f)
                            .sound(SoundType.CALCITE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> POLISHED_LIMESTONE_SLAB = registerBlock(
            "polished_limestone_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(0.75f)
                            .explosionResistance(0.75f)
                            .sound(SoundType.CALCITE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);


    public static final RegistryObject<Block> ALABASTER = registerBlock(
            "alabaster",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> ALABASTER_STAIRS = registerBlock(
            "alabaster_stairs",
            () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> ALABASTER_SLAB = registerBlock(
            "alabaster_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> ALABASTER_WALL = registerBlock(
            "alabaster_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);




    public static final RegistryObject<Block> POLISHED_ALABASTER = registerBlock(
            "polished_alabaster",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> POLISHED_ALABASTER_STAIRS = registerBlock(
            "polished_alabaster_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> POLISHED_ALABASTER_SLAB = registerBlock(
            "polished_alabaster_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);




    public static final RegistryObject<Block> TRAVERTINE = registerBlock(
            "travertine",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> TRAVERTINE_STAIRS = registerBlock(
            "travertine_stairs",
            () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> TRAVERTINE_SLAB = registerBlock(
            "travertine_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> TRAVERTINE_WALL = registerBlock(
            "travertine_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> TRAVERTINE_PILLAR = registerBlock(
            "travertine_pillar",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);




    public static final RegistryObject<Block> POLISHED_TRAVERTINE = registerBlock(
            "polished_travertine",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> POLISHED_TRAVERTINE_STAIRS = registerBlock(
            "polished_travertine_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> POLISHED_TRAVERTINE_SLAB = registerBlock(
            "polished_travertine_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> TRAVERTINE_BRICKS = registerBlock(
            "travertine_bricks",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> TRAVERTINE_BRICK_STAIRS = registerBlock(
            "travertine_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> TRAVERTINE_BRICK_SLAB = registerBlock(
            "travertine_brick_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> TRAVERTINE_BRICK_WALL = registerBlock(
            "travertine_brick_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.TUFF)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);





    public static final RegistryObject<Block> RUSSET = registerBlock(
            "russet",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> RUSSET_STAIRS = registerBlock(
            "russet_stairs",
            () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> RUSSET_SLAB = registerBlock(
            "russet_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> RUSSET_WALL = registerBlock(
            "russet_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);


    public static final RegistryObject<Block> POLISHED_RUSSET = registerBlock(
            "polished_russet",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> POLISHED_RUSSET_STAIRS = registerBlock(
            "polished_russet_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> POLISHED_RUSSET_SLAB = registerBlock(
            "polished_russet_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> RUSSET_BRICKS = registerBlock(
            "russet_bricks",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> RUSSET_BRICK_STAIRS = registerBlock(
            "russet_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> RUSSET_BRICK_SLAB = registerBlock(
            "russet_brick_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> RUSSET_BRICK_WALL = registerBlock(
            "russet_brick_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> CRACKED_RUSSET_BRICKS = registerBlock(
            "cracked_russet_bricks",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);

    public static final RegistryObject<Block> CHISELED_RUSSET_BRICKS = registerBlock(
            "chiseled_russet_bricks",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops())
            ,ModCreativeModeTab.INFERIOR_ACCRETION_TAB);







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

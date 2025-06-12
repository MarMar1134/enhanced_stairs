package net.marmar.enhanced_stairs.block;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    //Deferred registers
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EnhancedStairs.MOD_ID);
    public static final DeferredRegister<Item> BLOCK_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnhancedStairs.MOD_ID);

    //Registry objects
        //Stone
        public static final RegistryObject<Block> STONE_WALL = registerBlockWithItem("stone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

        //Polished diorite, andesite and granite walls
        public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlockWithItem("polished_diorite_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE_WALL).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlockWithItem("polished_andesite_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE_WALL).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlockWithItem("polished_granite_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_WALL).requiresCorrectToolForDrops()));

        //Cut Sandstone
        public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = registerBlockWithItem("cut_sandstone_stairs",
                () -> new StairBlock(Blocks.CUT_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> CUT_SANDSTONE_WALL = registerBlockWithItem("cut_sandstone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).requiresCorrectToolForDrops()));

        //Smooth sandstone
        public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = registerBlockWithItem("smooth_sandstone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).requiresCorrectToolForDrops()));

        //Cut red sandstone
        public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = registerBlockWithItem("cut_red_sandstone_stairs",
                () -> new StairBlock(Blocks.CUT_RED_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = registerBlockWithItem("cut_red_sandstone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).requiresCorrectToolForDrops()));

        //Smooth red sandstone
        public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlockWithItem("smooth_red_sandstone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).requiresCorrectToolForDrops()));

        //Prismarine bricks
        public static final RegistryObject<Block> PRISMARINE_BRICKS_WALL = registerBlockWithItem("prismarine_bricks_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops()));

        //Dark prismarine
        public static final RegistryObject<Block> DARK_PRISMARINE_WALL = registerBlockWithItem("dark_prismarine_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE).requiresCorrectToolForDrops()));

        //Dripstone
        public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlockWithItem("dripstone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlockWithItem("dripstone_stairs",
                () -> new StairBlock(Blocks.DRIPSTONE_BLOCK::defaultBlockState,BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlockWithItem("dripstone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

        //Calcite
        public static final RegistryObject<Block> CALCITE_SLAB = registerBlockWithItem("calcite_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> CALCITE_STAIRS = registerBlockWithItem("calcite_stairs",
                () -> new StairBlock(Blocks.CALCITE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> CALCITE_WALL = registerBlockWithItem("calcite_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

        //Smooth Basalt
        public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlockWithItem("smooth_basalt_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerBlockWithItem("smooth_basalt_stairs",
                () -> new StairBlock(Blocks.SMOOTH_BASALT::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerBlockWithItem("smooth_basalt_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

        //Deepslate
        public static final RegistryObject<Block> DEEPSLATE_SLAB = registerBlockWithItem("deepslate_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> DEEPSLATE_STAIRS = registerBlockWithItem("deepslate_stairs",
                () -> new StairBlock(Blocks.DEEPSLATE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> DEEPSLATE_WALL = registerBlockWithItem("deepslate_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

        //Smooth stone
        public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlockWithItem("smooth_stone_stairs",
                () -> new StairBlock(Blocks.SMOOTH_STONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> SMOOTH_STONE_WALL = registerBlockWithItem("smooth_stone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

        //Quartz
        public static final RegistryObject<Block> QUARTZ_BLOCK_WALL = registerBlockWithItem("quartz_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).requiresCorrectToolForDrops()));

        //Smooth quartz
        public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = registerBlockWithItem("smooth_quartz_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).requiresCorrectToolForDrops()));

        // Quartz Bricks
        public static final RegistryObject<Block> QUARTZ_BRICKS_SLAB = registerBlockWithItem("quartz_bricks_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> QUARTZ_BRICKS_STAIRS = registerBlockWithItem("quartz_bricks_stairs",
                () -> new StairBlock(Blocks.QUARTZ_BRICKS::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> QUARTZ_BRICKS_WALL = registerBlockWithItem("quartz_bricks_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops()));

        //End stone
        public static final RegistryObject<Block> END_STONE_SLAB = registerBlockWithItem("end_stone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> END_STONE_STAIRS = registerBlockWithItem("end_stone_stairs",
                () -> new StairBlock(Blocks.END_STONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> END_STONE_WALL = registerBlockWithItem("end_stone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));

        //Purpur
        public static final RegistryObject<Block> PURPUR_BLOCK_WALL = registerBlockWithItem("purpur_block_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK).requiresCorrectToolForDrops()));

        //Concrete
            //Slabs
            public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerBlockWithItem("white_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlockWithItem("light_gray_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerBlockWithItem("gray_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerBlockWithItem("black_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerBlockWithItem("brown_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerBlockWithItem("red_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerBlockWithItem("orange_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerBlockWithItem("yellow_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerBlockWithItem("lime_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerBlockWithItem("green_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerBlockWithItem("cyan_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlockWithItem("light_blue_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerBlockWithItem("blue_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerBlockWithItem("purple_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerBlockWithItem("magenta_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerBlockWithItem("pink_concrete_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).requiresCorrectToolForDrops()));

            //Stairs
            public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = registerBlockWithItem("white_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerBlockWithItem("light_gray_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = registerBlockWithItem("gray_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = registerBlockWithItem("black_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = registerBlockWithItem("brown_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> RED_CONCRETE_STAIRS = registerBlockWithItem("red_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = registerBlockWithItem("orange_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = registerBlockWithItem("yellow_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = registerBlockWithItem("lime_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = registerBlockWithItem("green_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = registerBlockWithItem("cyan_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerBlockWithItem("light_blue_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = registerBlockWithItem("blue_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = registerBlockWithItem("purple_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = registerBlockWithItem("magenta_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = registerBlockWithItem("pink_concrete_stairs",
                    () -> new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).requiresCorrectToolForDrops()));

            //Walls
            public static final RegistryObject<Block> WHITE_CONCRETE_WALL = registerBlockWithItem("white_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = registerBlockWithItem("light_gray_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GRAY_CONCRETE_WALL = registerBlockWithItem("gray_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLACK_CONCRETE_WALL = registerBlockWithItem("black_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BROWN_CONCRETE_WALL = registerBlockWithItem("brown_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> RED_CONCRETE_WALL = registerBlockWithItem("red_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = registerBlockWithItem("orange_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = registerBlockWithItem("yellow_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIME_CONCRETE_WALL = registerBlockWithItem("lime_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GREEN_CONCRETE_WALL = registerBlockWithItem("green_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> CYAN_CONCRETE_WALL = registerBlockWithItem("cyan_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = registerBlockWithItem("light_blue_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLUE_CONCRETE_WALL = registerBlockWithItem("blue_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = registerBlockWithItem("purple_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = registerBlockWithItem("magenta_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PINK_CONCRETE_WALL = registerBlockWithItem("pink_concrete_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).requiresCorrectToolForDrops()));


        //Terracotta
            //Slabs
            public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlockWithItem("white_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlockWithItem("light_gray_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = registerBlockWithItem("gray_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = registerBlockWithItem("black_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = registerBlockWithItem("brown_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlockWithItem("red_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlockWithItem("orange_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = registerBlockWithItem("yellow_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = registerBlockWithItem("lime_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = registerBlockWithItem("green_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = registerBlockWithItem("cyan_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlockWithItem("light_blue_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = registerBlockWithItem("blue_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = registerBlockWithItem("purple_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = registerBlockWithItem("magenta_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = registerBlockWithItem("pink_terracotta_slab",
                    () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).requiresCorrectToolForDrops()));

            //Stairs
            public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = registerBlockWithItem("white_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlockWithItem("light_gray_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = registerBlockWithItem("gray_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = registerBlockWithItem("black_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = registerBlockWithItem("brown_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = registerBlockWithItem("red_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = registerBlockWithItem("orange_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = registerBlockWithItem("yellow_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = registerBlockWithItem("lime_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = registerBlockWithItem("green_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = registerBlockWithItem("cyan_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlockWithItem("light_blue_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = registerBlockWithItem("blue_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = registerBlockWithItem("purple_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = registerBlockWithItem("magenta_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = registerBlockWithItem("pink_terracotta_stairs",
                    () -> new StairBlock(Blocks.WHITE_TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));

            //Walls
            public static final RegistryObject<Block> WHITE_TERRACOTTA_WALL = registerBlockWithItem("white_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_WALL = registerBlockWithItem("light_gray_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GRAY_TERRACOTTA_WALL = registerBlockWithItem("gray_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLACK_TERRACOTTA_WALL = registerBlockWithItem("black_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BROWN_TERRACOTTA_WALL = registerBlockWithItem("brown_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> RED_TERRACOTTA_WALL = registerBlockWithItem("red_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> ORANGE_TERRACOTTA_WALL = registerBlockWithItem("orange_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> YELLOW_TERRACOTTA_WALL = registerBlockWithItem("yellow_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIME_TERRACOTTA_WALL = registerBlockWithItem("lime_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> GREEN_TERRACOTTA_WALL = registerBlockWithItem("green_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> CYAN_TERRACOTTA_WALL = registerBlockWithItem("cyan_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_WALL = registerBlockWithItem("light_blue_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> BLUE_TERRACOTTA_WALL = registerBlockWithItem("blue_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PURPLE_TERRACOTTA_WALL = registerBlockWithItem("purple_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> MAGENTA_TERRACOTTA_WALL = registerBlockWithItem("magenta_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).requiresCorrectToolForDrops()));
            public static final RegistryObject<Block> PINK_TERRACOTTA_WALL = registerBlockWithItem("pink_terracotta_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).requiresCorrectToolForDrops()));

    //Helper methods
    private static <T extends Block> RegistryObject<T> registerBlockWithItem(String name, Supplier<T> block){
        RegistryObject<T> ToReturn = BLOCKS.register(name, block);
        registerBlockItem(name, ToReturn);
        return ToReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
        BLOCK_ITEMS.register(eventBus);
    }

}

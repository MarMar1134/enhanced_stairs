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

        //Dripstone
        public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlockWithItem("dripstone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlockWithItem("dripstone_stair",
                () -> new StairBlock(Blocks.DRIPSTONE_BLOCK::defaultBlockState,BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlockWithItem("dripstone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

        //Calcite
        public static final RegistryObject<Block> CALCITE_SLAB = registerBlockWithItem("calcite_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> CALCITE_STAIRS = registerBlockWithItem("calcite_stair",
                () -> new StairBlock(Blocks.CALCITE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
        public static final RegistryObject<Block> CALCITE_WALL = registerBlockWithItem("calcite_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

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

package net.marmar.enhanced_stairs.data.model;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.marmar.enhanced_stairs.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EnhancedStairs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Stone
        wallBlock((WallBlock) ModBlocks.STONE_WALL.get(), blockTexture(Blocks.STONE));

        //Polished diorite, andesite and granite
        wallBlock((WallBlock) ModBlocks.POLISHED_DIORITE_WALL.get(), blockTexture(Blocks.POLISHED_DIORITE));
        wallBlock((WallBlock) ModBlocks.POLISHED_ANDESITE_WALL.get(), blockTexture(Blocks.POLISHED_ANDESITE));
        wallBlock((WallBlock) ModBlocks.POLISHED_GRANITE_WALL.get(), blockTexture(Blocks.POLISHED_GRANITE));

        //Cut sandstone
        wallBlock((WallBlock) ModBlocks.CUT_SANDSTONE_WALL.get(), blockTexture(Blocks.CUT_SANDSTONE));

        //Smooth sandstone
        wallBlock((WallBlock) ModBlocks.SMOOTH_SANDSTONE_WALL.get(), modLoc("block/sandstone_top"));

        //Cut red sandstone
        wallBlock((WallBlock) ModBlocks.CUT_RED_SANDSTONE_WALL.get(), blockTexture(Blocks.CUT_RED_SANDSTONE));

        //Smooth red sandstone
        wallBlock((WallBlock) ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), modLoc("block/red_sandstone_top"));

        //Prismarine bricks
        wallBlock((WallBlock) ModBlocks.PRISMARINE_BRICKS_WALL.get(), blockTexture(Blocks.PRISMARINE_BRICKS));

        //Dark prismarine
        wallBlock((WallBlock) ModBlocks.DARK_PRISMARINE_WALL.get(), blockTexture(Blocks.DARK_PRISMARINE));

        //Dripstone
        slabBlock((SlabBlock) ModBlocks.DRIPSTONE_SLAB.get(), blockTexture(Blocks.DRIPSTONE_BLOCK), blockTexture(Blocks.DRIPSTONE_BLOCK));
        stairsBlock((StairBlock) ModBlocks.DRIPSTONE_STAIRS.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));
        wallBlock((WallBlock) ModBlocks.DRIPSTONE_WALL.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));

        //Calcite
        slabBlock((SlabBlock) ModBlocks.CALCITE_SLAB.get(), blockTexture(Blocks.CALCITE), blockTexture(Blocks.CALCITE));
        stairsBlock((StairBlock) ModBlocks.CALCITE_STAIRS.get(), blockTexture(Blocks.CALCITE));
        wallBlock((WallBlock) ModBlocks.CALCITE_WALL.get(), blockTexture(Blocks.CALCITE));

        //Smooth basalt
        slabBlock((SlabBlock) ModBlocks.SMOOTH_BASALT_SLAB.get(), blockTexture(Blocks.SMOOTH_BASALT), blockTexture(Blocks.SMOOTH_BASALT));
        stairsBlock((StairBlock) ModBlocks.SMOOTH_BASALT_STAIRS.get(), blockTexture(Blocks.SMOOTH_BASALT));
        wallBlock((WallBlock) ModBlocks.SMOOTH_BASALT_WALL.get(), blockTexture(Blocks.SMOOTH_BASALT));

        //Deepslate
        slabBlock((SlabBlock) ModBlocks.DEEPSLATE_SLAB.get(), blockTexture(Blocks.DEEPSLATE), blockTexture(Blocks.DEEPSLATE));
        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_STAIRS.get(), blockTexture(Blocks.DEEPSLATE));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_WALL.get(), blockTexture(Blocks.DEEPSLATE));

        //Smooth stone
        stairsBlock((StairBlock) ModBlocks.SMOOTH_STONE_STAIRS.get(), blockTexture(Blocks.SMOOTH_STONE));
        wallBlock((WallBlock) ModBlocks.SMOOTH_STONE_WALL.get(), blockTexture(Blocks.SMOOTH_STONE));

        //Quartz
        wallBlock((WallBlock) ModBlocks.QUARTZ_BLOCK_WALL.get(), modLoc("block/quartz_block_side"));

        //Smooth quartz
        wallBlock((WallBlock) ModBlocks.SMOOTH_QUARTZ_WALL.get(), modLoc("block/quartz_block_bottom"));

        //Quartz bricks
        slabBlock((SlabBlock) ModBlocks.QUARTZ_BRICKS_SLAB.get(), blockTexture(Blocks.QUARTZ_BRICKS), blockTexture(Blocks.QUARTZ_BRICKS));
        stairsBlock((StairBlock) ModBlocks.QUARTZ_BRICKS_STAIRS.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        wallBlock((WallBlock) ModBlocks.QUARTZ_BRICKS_WALL.get(), blockTexture(Blocks.QUARTZ_BRICKS));

        //End stone
        slabBlock((SlabBlock) ModBlocks.END_STONE_SLAB.get(), blockTexture(Blocks.END_STONE), blockTexture(Blocks.END_STONE));
        stairsBlock((StairBlock) ModBlocks.END_STONE_STAIRS.get(), blockTexture(Blocks.END_STONE));
        wallBlock((WallBlock) ModBlocks.END_STONE_WALL.get(), blockTexture(Blocks.END_STONE));

        //Purpur
        wallBlock((WallBlock) ModBlocks.PURPUR_BLOCK_WALL.get(), blockTexture(Blocks.PURPUR_BLOCK));

        //Concrete
            //Slabs
            slabBlock((SlabBlock) ModBlocks.WHITE_CONCRETE_SLAB.get(), blockTexture(Blocks.WHITE_CONCRETE), blockTexture(Blocks.WHITE_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.GRAY_CONCRETE_SLAB.get(), blockTexture(Blocks.GRAY_CONCRETE), blockTexture(Blocks.GRAY_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.BLACK_CONCRETE_SLAB.get(), blockTexture(Blocks.BLACK_CONCRETE), blockTexture(Blocks.BLACK_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.BROWN_CONCRETE_SLAB.get(), blockTexture(Blocks.BROWN_CONCRETE), blockTexture(Blocks.BROWN_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.RED_CONCRETE_SLAB.get(), blockTexture(Blocks.RED_CONCRETE), blockTexture(Blocks.RED_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.ORANGE_CONCRETE_SLAB.get(), blockTexture(Blocks.ORANGE_CONCRETE), blockTexture(Blocks.ORANGE_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.YELLOW_CONCRETE_SLAB.get(), blockTexture(Blocks.YELLOW_CONCRETE), blockTexture(Blocks.YELLOW_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.LIME_CONCRETE_SLAB.get(), blockTexture(Blocks.LIME_CONCRETE), blockTexture(Blocks.LIME_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.GREEN_CONCRETE_SLAB.get(), blockTexture(Blocks.GREEN_CONCRETE), blockTexture(Blocks.GREEN_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.CYAN_CONCRETE_SLAB.get(), blockTexture(Blocks.CYAN_CONCRETE), blockTexture(Blocks.CYAN_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.BLUE_CONCRETE_SLAB.get(), blockTexture(Blocks.BLUE_CONCRETE), blockTexture(Blocks.BLUE_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.PURPLE_CONCRETE_SLAB.get(), blockTexture(Blocks.PURPLE_CONCRETE), blockTexture(Blocks.PURPLE_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.MAGENTA_CONCRETE_SLAB.get(), blockTexture(Blocks.MAGENTA_CONCRETE), blockTexture(Blocks.MAGENTA_CONCRETE));
            slabBlock((SlabBlock) ModBlocks.PINK_CONCRETE_SLAB.get(), blockTexture(Blocks.PINK_CONCRETE), blockTexture(Blocks.PINK_CONCRETE));

            //Stairs
            stairsBlock((StairBlock) ModBlocks.WHITE_CONCRETE_STAIRS.get(), blockTexture(Blocks.WHITE_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.GRAY_CONCRETE_STAIRS.get(), blockTexture(Blocks.GRAY_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.BLACK_CONCRETE_STAIRS.get(), blockTexture(Blocks.BLACK_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.BROWN_CONCRETE_STAIRS.get(), blockTexture(Blocks.BROWN_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.RED_CONCRETE_STAIRS.get(), blockTexture(Blocks.RED_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.ORANGE_CONCRETE_STAIRS.get(), blockTexture(Blocks.ORANGE_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.YELLOW_CONCRETE_STAIRS.get(), blockTexture(Blocks.YELLOW_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.LIME_CONCRETE_STAIRS.get(), blockTexture(Blocks.LIME_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.GREEN_CONCRETE_STAIRS.get(), blockTexture(Blocks.GREEN_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.CYAN_CONCRETE_STAIRS.get(), blockTexture(Blocks.CYAN_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.BLUE_CONCRETE_STAIRS.get(), blockTexture(Blocks.BLUE_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.PURPLE_CONCRETE_STAIRS.get(), blockTexture(Blocks.PURPLE_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), blockTexture(Blocks.MAGENTA_CONCRETE));
            stairsBlock((StairBlock) ModBlocks.PINK_CONCRETE_STAIRS.get(), blockTexture(Blocks.PINK_CONCRETE));

            //Walls
            wallBlock((WallBlock) ModBlocks.WHITE_CONCRETE_WALL.get(), blockTexture(Blocks.WHITE_CONCRETE));
            wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
            wallBlock((WallBlock) ModBlocks.GRAY_CONCRETE_WALL.get(), blockTexture(Blocks.GRAY_CONCRETE));
            wallBlock((WallBlock) ModBlocks.BLACK_CONCRETE_WALL.get(), blockTexture(Blocks.BLACK_CONCRETE));
            wallBlock((WallBlock) ModBlocks.BROWN_CONCRETE_WALL.get(), blockTexture(Blocks.BROWN_CONCRETE));
            wallBlock((WallBlock) ModBlocks.RED_CONCRETE_WALL.get(), blockTexture(Blocks.RED_CONCRETE));
            wallBlock((WallBlock) ModBlocks.ORANGE_CONCRETE_WALL.get(), blockTexture(Blocks.ORANGE_CONCRETE));
            wallBlock((WallBlock) ModBlocks.YELLOW_CONCRETE_WALL.get(), blockTexture(Blocks.YELLOW_CONCRETE));
            wallBlock((WallBlock) ModBlocks.LIME_CONCRETE_WALL.get(), blockTexture(Blocks.LIME_CONCRETE));
            wallBlock((WallBlock) ModBlocks.GREEN_CONCRETE_WALL.get(), blockTexture(Blocks.GREEN_CONCRETE));
            wallBlock((WallBlock) ModBlocks.CYAN_CONCRETE_WALL.get(), blockTexture(Blocks.CYAN_CONCRETE));
            wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
            wallBlock((WallBlock) ModBlocks.BLUE_CONCRETE_WALL.get(), blockTexture(Blocks.BLUE_CONCRETE));
            wallBlock((WallBlock) ModBlocks.PURPLE_CONCRETE_WALL.get(), blockTexture(Blocks.PURPLE_CONCRETE));
            wallBlock((WallBlock) ModBlocks.MAGENTA_CONCRETE_WALL.get(), blockTexture(Blocks.MAGENTA_CONCRETE));
            wallBlock((WallBlock) ModBlocks.PINK_CONCRETE_WALL.get(), blockTexture(Blocks.PINK_CONCRETE));

        //Terracotta
            //Slabs
            slabBlock((SlabBlock) ModBlocks.WHITE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.WHITE_TERRACOTTA), blockTexture(Blocks.WHITE_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.GRAY_TERRACOTTA_SLAB.get(), blockTexture(Blocks.GRAY_TERRACOTTA), blockTexture(Blocks.GRAY_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.BLACK_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BLACK_TERRACOTTA), blockTexture(Blocks.BLACK_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.BROWN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BROWN_TERRACOTTA), blockTexture(Blocks.BROWN_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.RED_TERRACOTTA_SLAB.get(), blockTexture(Blocks.RED_TERRACOTTA), blockTexture(Blocks.RED_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.ORANGE_TERRACOTTA), blockTexture(Blocks.ORANGE_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), blockTexture(Blocks.YELLOW_TERRACOTTA), blockTexture(Blocks.YELLOW_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.LIME_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIME_TERRACOTTA), blockTexture(Blocks.LIME_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.GREEN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.GREEN_TERRACOTTA), blockTexture(Blocks.GREEN_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.CYAN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.CYAN_TERRACOTTA), blockTexture(Blocks.CYAN_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.BLUE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BLUE_TERRACOTTA), blockTexture(Blocks.BLUE_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.PURPLE_TERRACOTTA), blockTexture(Blocks.PURPLE_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA), blockTexture(Blocks.MAGENTA_TERRACOTTA));
            slabBlock((SlabBlock) ModBlocks.PINK_TERRACOTTA_SLAB.get(), blockTexture(Blocks.PINK_TERRACOTTA), blockTexture(Blocks.PINK_TERRACOTTA));

            //Stairs
            stairsBlock((StairBlock) ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.WHITE_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.GRAY_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BLACK_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BROWN_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.RED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.RED_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.LIME_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIME_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.GREEN_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.CYAN_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BLUE_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));
            stairsBlock((StairBlock) ModBlocks.PINK_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.PINK_TERRACOTTA));

            //Walls
            wallBlock((WallBlock) ModBlocks.WHITE_TERRACOTTA_WALL.get(), blockTexture(Blocks.WHITE_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.GRAY_TERRACOTTA_WALL.get(), blockTexture(Blocks.GRAY_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.BLACK_TERRACOTTA_WALL.get(), blockTexture(Blocks.BLACK_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.BROWN_TERRACOTTA_WALL.get(), blockTexture(Blocks.BROWN_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.RED_TERRACOTTA_WALL.get(), blockTexture(Blocks.RED_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.ORANGE_TERRACOTTA_WALL.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.YELLOW_TERRACOTTA_WALL.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.LIME_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIME_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.GREEN_TERRACOTTA_WALL.get(), blockTexture(Blocks.GREEN_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.CYAN_TERRACOTTA_WALL.get(), blockTexture(Blocks.CYAN_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.BLUE_TERRACOTTA_WALL.get(), blockTexture(Blocks.BLUE_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.PURPLE_TERRACOTTA_WALL.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.MAGENTA_TERRACOTTA_WALL.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));
            wallBlock((WallBlock) ModBlocks.PINK_TERRACOTTA_WALL.get(), blockTexture(Blocks.PINK_TERRACOTTA));
    }
}

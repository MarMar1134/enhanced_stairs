package net.marmar.enhanced_stairs.data.recipe;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.marmar.enhanced_stairs.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        craftingRecipes(consumer);
        stoneCuttingRecipes(consumer);
    }

    //Crafting
        public static void craftingRecipes(Consumer<FinishedRecipe> pConsumer){
            //Stone
            wallBlockRecipe(Blocks.STONE, ModBlocks.STONE_WALL.get(), pConsumer);

            //Polished diorite, andesite and granite walls
            wallBlockRecipe(Blocks.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_WALL.get(), pConsumer);
            wallBlockRecipe(Blocks.POLISHED_ANDESITE, ModBlocks.POLISHED_ANDESITE_WALL.get(), pConsumer);
            wallBlockRecipe(Blocks.POLISHED_GRANITE, ModBlocks.POLISHED_GRANITE_WALL.get(), pConsumer);

            //Cut sandstone
            stairBlockRecipe(Blocks.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_STAIRS.get(), pConsumer);
            wallBlockRecipe(Blocks.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_WALL.get(), pConsumer);

            //Smooth sandstone
            wallBlockRecipe(Blocks.SMOOTH_SANDSTONE, ModBlocks.SMOOTH_SANDSTONE_WALL.get(), pConsumer);

            //Prismarine bricks
            wallBlockRecipe(Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICKS_WALL.get(), pConsumer);

            //Dark prismarine
            wallBlockRecipe(Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_WALL.get(), pConsumer);

            //Dripstone
            blockWithoutPolishedVersion(Blocks.DRIPSTONE_BLOCK, ModBlocks.DRIPSTONE_WALL.get(), ModBlocks.DRIPSTONE_STAIRS.get(),
                    ModBlocks.DRIPSTONE_SLAB.get(), pConsumer);

            //Calcite
            blockWithoutPolishedVersion(Blocks.CALCITE, ModBlocks.CALCITE_WALL.get(), ModBlocks.CALCITE_STAIRS.get(),
                    ModBlocks.CALCITE_SLAB.get(), pConsumer);

            //Deepslate
            blockWithoutPolishedVersion(Blocks.DEEPSLATE, ModBlocks.DEEPSLATE_WALL.get(), ModBlocks.DEEPSLATE_STAIRS.get(),
                    ModBlocks.DEEPSLATE_SLAB.get(), pConsumer);

            //Smooth stone
            stairBlockRecipe(Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS.get(), pConsumer);
            wallBlockRecipe(Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_WALL.get(), pConsumer);

            //Quartz
            wallBlockRecipe(Blocks.QUARTZ_BLOCK, ModBlocks.QUARTZ_BLOCK_WALL.get(), pConsumer);

            //Smooth quartz
            wallBlockRecipe(Blocks.SMOOTH_QUARTZ, ModBlocks.SMOOTH_QUARTZ_WALL.get(), pConsumer);

            //Quartz bricks
            blockWithoutPolishedVersion(Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICKS_WALL.get(), ModBlocks.QUARTZ_BRICKS_STAIRS.get(),
                    ModBlocks.QUARTZ_BRICKS_SLAB.get(), pConsumer);

            //End stone
            blockWithoutPolishedVersion(Blocks.END_STONE, ModBlocks.END_STONE_WALL.get(), ModBlocks.END_STONE_STAIRS.get(),
                    ModBlocks.END_STONE_SLAB.get(), pConsumer);

            //Purpur
            wallBlockRecipe(Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_BLOCK_WALL.get(), pConsumer);

            //Concrete
            blockWithoutPolishedVersion(Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_WALL.get(), ModBlocks.WHITE_CONCRETE_STAIRS.get(), ModBlocks.WHITE_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_WALL.get(), ModBlocks.GRAY_CONCRETE_STAIRS.get(), ModBlocks.GRAY_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_WALL.get(), ModBlocks.BLACK_CONCRETE_STAIRS.get(), ModBlocks.BLACK_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_WALL.get(), ModBlocks.BROWN_CONCRETE_STAIRS.get(), ModBlocks.BROWN_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_WALL.get(), ModBlocks.RED_CONCRETE_STAIRS.get(), ModBlocks.RED_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_WALL.get(), ModBlocks.ORANGE_CONCRETE_STAIRS.get(), ModBlocks.ORANGE_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_WALL.get(), ModBlocks.YELLOW_CONCRETE_STAIRS.get(), ModBlocks.YELLOW_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_WALL.get(), ModBlocks.LIME_CONCRETE_STAIRS.get(), ModBlocks.LIME_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_WALL.get(), ModBlocks.GREEN_CONCRETE_STAIRS.get(), ModBlocks.GREEN_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_WALL.get(), ModBlocks.CYAN_CONCRETE_STAIRS.get(), ModBlocks.CYAN_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_WALL.get(), ModBlocks.BLUE_CONCRETE_STAIRS.get(), ModBlocks.BLUE_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_WALL.get(), ModBlocks.PURPLE_CONCRETE_STAIRS.get(), ModBlocks.PURPLE_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_WALL.get(), ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), ModBlocks.MAGENTA_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_WALL.get(), ModBlocks.PINK_CONCRETE_STAIRS.get(), ModBlocks.PINK_CONCRETE_SLAB.get(), pConsumer);

            //Terracotta
            blockWithoutPolishedVersion(Blocks.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_WALL.get(), ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), ModBlocks.WHITE_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_WALL.get(), ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), ModBlocks.GRAY_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_WALL.get(), ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), ModBlocks.BLACK_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_WALL.get(), ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), ModBlocks.BROWN_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_WALL.get(), ModBlocks.RED_TERRACOTTA_STAIRS.get(), ModBlocks.RED_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_WALL.get(), ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_WALL.get(), ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_WALL.get(), ModBlocks.LIME_TERRACOTTA_STAIRS.get(), ModBlocks.LIME_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_WALL.get(), ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), ModBlocks.GREEN_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_WALL.get(), ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), ModBlocks.CYAN_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_WALL.get(), ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), ModBlocks.BLUE_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_WALL.get(), ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_WALL.get(), ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), pConsumer);
            blockWithoutPolishedVersion(Blocks.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_WALL.get(), ModBlocks.PINK_TERRACOTTA_STAIRS.get(), ModBlocks.PINK_TERRACOTTA_SLAB.get(), pConsumer);
        }

        //Helper methods
            private static void wallBlockRecipe(Block baseBlock, Block wallBlock, Consumer<FinishedRecipe> pConsumer){
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, wallBlock, 6)
                        .pattern("###")
                        .pattern("###")
                        .define('#', baseBlock)
                        .group(getItemName(wallBlock))
                        .unlockedBy(getHasName(baseBlock), has(baseBlock))
                        .unlockedBy(getHasName(wallBlock), has(wallBlock))
                        .save(pConsumer);
            }
            private static void stairBlockRecipe(Block baseBlock, Block stairBlock, Consumer<FinishedRecipe> pConsumer){
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, stairBlock, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', baseBlock)
                        .group(getItemName(stairBlock))
                        .unlockedBy(getHasName(baseBlock), has(baseBlock))
                        .unlockedBy(getHasName(stairBlock), has(stairBlock))
                        .save(pConsumer);
            }
            private static void slabBlockRecipe(Block pBlock, Block slabBlock, Consumer<FinishedRecipe> pConsumer){
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, slabBlock, 6)
                        .pattern("###")
                        .define('#', pBlock)
                        .group(getItemName(slabBlock))
                        .unlockedBy(getHasName(pBlock), has(pBlock))
                        .unlockedBy(getHasName(slabBlock), has(slabBlock))
                        .save(pConsumer);
            }
            protected static void blockWithoutPolishedVersion(Block baseBlock, Block wallBlock, Block stairBlock,
                                                              Block slabBlock, Consumer<FinishedRecipe> consumer){
                baseAddRock(baseBlock, null, wallBlock, stairBlock, slabBlock, consumer);
            }
            protected static void blockWithoutWallNorPolished(Block baseBlock, Block stairBlock,
                                                              Block slabBlock, Consumer<FinishedRecipe> consumer){
                baseAddRock(baseBlock, null, null, stairBlock, slabBlock, consumer);
            }
            private static void baseAddRock(Block baseBlock, @Nullable Block polishedBlock, Block wallBlock, Block stairBlock,
                                            Block slabBlock, Consumer<FinishedRecipe> pConsumer){
            if (polishedBlock != null){
                wallBlockRecipe(polishedBlock, wallBlock, pConsumer);
                stairBlockRecipe(polishedBlock, stairBlock, pConsumer);
                slabBlockRecipe(polishedBlock, slabBlock, pConsumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, polishedBlock, 4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', baseBlock)
                        .group(getItemName(polishedBlock))
                        .unlockedBy(getHasName(baseBlock), has(baseBlock))
                        .unlockedBy(getHasName(polishedBlock), has(polishedBlock))
                        .save(pConsumer);
            } else if (wallBlock != null){
                wallBlockRecipe(baseBlock, wallBlock, pConsumer);
            } else {
                stairBlockRecipe(baseBlock, stairBlock, pConsumer);
                slabBlockRecipe(baseBlock, slabBlock, pConsumer);
            }
        }

    //Stonecutting
        public static void stoneCuttingRecipes(Consumer<FinishedRecipe> pConsumer){
            //Stone
            stoneCutting(pConsumer, Items.STONE, ModBlocks.STONE_WALL.get(), 1);

            //Polished diorite, andesite and granite walls
            stoneCutting(pConsumer, Items.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.POLISHED_ANDESITE, ModBlocks.POLISHED_ANDESITE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.POLISHED_GRANITE, ModBlocks.POLISHED_GRANITE_WALL.get(), 1);

            //Cut sandstone
            stoneCutting(pConsumer, Items.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_WALL.get(), 1);

            //Smooth sandstone
            stoneCutting(pConsumer, Items.SMOOTH_SANDSTONE, ModBlocks.SMOOTH_SANDSTONE_WALL.get(), 1);

            //Cut red sandstone
            stoneCutting(pConsumer, Items.CUT_RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.CUT_RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_WALL.get(), 1);

            //Smooth red sandstone
            stoneCutting(pConsumer, Items.SMOOTH_RED_SANDSTONE, ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), 1);

            //Prismarine bricks
            stoneCutting(pConsumer, Items.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICKS_WALL.get(), 1);

            //Dark prismarine
            stoneCutting(pConsumer, Items.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_WALL.get(), 1);

            //Dripstone
            stoneCutting(pConsumer, Items.DRIPSTONE_BLOCK, ModBlocks.DRIPSTONE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.DRIPSTONE_BLOCK, ModBlocks.DRIPSTONE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.DRIPSTONE_BLOCK, ModBlocks.DRIPSTONE_WALL.get(), 1);

            //Calcite
            stoneCutting(pConsumer, Items.CALCITE, ModBlocks.CALCITE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.CALCITE, ModBlocks.CALCITE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.CALCITE, ModBlocks.CALCITE_WALL.get(), 1);

            //Smooth basalt
            stoneCutting(pConsumer, Items.SMOOTH_BASALT, ModBlocks.SMOOTH_BASALT_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.SMOOTH_BASALT, ModBlocks.SMOOTH_BASALT_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.SMOOTH_BASALT, ModBlocks.SMOOTH_BASALT_WALL.get(), 1);

            //Deepslate
            stoneCutting(pConsumer, Items.DEEPSLATE, ModBlocks.DEEPSLATE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.DEEPSLATE, ModBlocks.DEEPSLATE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.DEEPSLATE, ModBlocks.DEEPSLATE_WALL.get(), 1);

            //Smooth stone
            stoneCutting(pConsumer, Items.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS.get(), 1);

            //Quartz
            stoneCutting(pConsumer, Items.QUARTZ_BLOCK, ModBlocks.QUARTZ_BLOCK_WALL.get(), 1);

            //Smooth quartz
            stoneCutting(pConsumer, Items.SMOOTH_QUARTZ, ModBlocks.SMOOTH_QUARTZ_WALL.get(), 1);

            //Quartz bricks
            stoneCutting(pConsumer, Items.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICKS_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICKS_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICKS_WALL.get(), 1);

            //End stone
            stoneCutting(pConsumer, Items.END_STONE, ModBlocks.END_STONE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.END_STONE, ModBlocks.END_STONE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.END_STONE, ModBlocks.END_STONE_WALL.get(), 1);

            //Purpur
            stoneCutting(pConsumer, Items.PURPUR_BLOCK, ModBlocks.PURPUR_BLOCK_WALL.get(), 1);

            //Concrete
            stoneCutting(pConsumer, Items.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.RED_CONCRETE, ModBlocks.RED_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.RED_CONCRETE, ModBlocks.RED_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.RED_CONCRETE, ModBlocks.RED_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_WALL.get(), 1);
            stoneCutting(pConsumer, Items.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_WALL.get(), 1);

            //Terracotta
            stoneCutting(pConsumer, Items.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_WALL.get(), 1);
            stoneCutting(pConsumer, Items.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_WALL.get(), 1);
        }

    //Helper methods
        protected static void stoneCutting(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output, int count){
            stoneCuttingBuilder(consumer, input, RecipeCategory.BUILDING_BLOCKS, output, count, "from_stone_cutting");
        }

        //Serializer
        protected static void stoneCuttingBuilder(Consumer<FinishedRecipe> consumer, ItemLike input, RecipeCategory category, ItemLike result, int count, String recipeName){
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), category, result, count)
                    .unlockedBy(getHasName(input), has(input))
                    .save(consumer, EnhancedStairs.MOD_ID + ":" + getItemName(result) + "_" + recipeName + "_" + getItemName(input));
        }
}

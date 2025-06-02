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

            //Dripstone
            blockWithoutPolishedVersion(Blocks.DRIPSTONE_BLOCK, ModBlocks.DRIPSTONE_WALL.get(), ModBlocks.DRIPSTONE_STAIRS.get(),
                    ModBlocks.DRIPSTONE_SLAB.get(), pConsumer);

            //Calcite
            blockWithoutPolishedVersion(Blocks.CALCITE, ModBlocks.CALCITE_WALL.get(), ModBlocks.CALCITE_STAIRS.get(),
                    ModBlocks.CALCITE_SLAB.get(), pConsumer);

            //Concrete
            blockWithoutWallNorPolished(Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_STAIRS.get(), ModBlocks.WHITE_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_STAIRS.get(), ModBlocks.GRAY_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_STAIRS.get(), ModBlocks.BLACK_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_STAIRS.get(), ModBlocks.BROWN_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_STAIRS.get(), ModBlocks.RED_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), ModBlocks.ORANGE_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), ModBlocks.YELLOW_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_STAIRS.get(), ModBlocks.LIME_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_STAIRS.get(), ModBlocks.GREEN_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_STAIRS.get(), ModBlocks.CYAN_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_STAIRS.get(), ModBlocks.BLUE_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), ModBlocks.PURPLE_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), ModBlocks.MAGENTA_CONCRETE_SLAB.get(), pConsumer);
            blockWithoutWallNorPolished(Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_STAIRS.get(), ModBlocks.PINK_CONCRETE_SLAB.get(), pConsumer);
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
                                            Block slabBlock, Consumer<FinishedRecipe> consumer){
            if (polishedBlock != null){
                wallBlockRecipe(polishedBlock, wallBlock, consumer);
                stairBlockRecipe(polishedBlock, stairBlock, consumer);
                slabBlockRecipe(polishedBlock, slabBlock, consumer);

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, polishedBlock, 4)
                        .pattern("##")
                        .pattern("##")
                        .define('#', baseBlock)
                        .group(getItemName(polishedBlock))
                        .unlockedBy(getHasName(baseBlock), has(baseBlock))
                        .unlockedBy(getHasName(polishedBlock), has(polishedBlock))
                        .save(consumer);
            } else if (wallBlock != null){
                wallBlockRecipe(baseBlock, wallBlock, consumer);
            } else {
                stairBlockRecipe(baseBlock, stairBlock, consumer);
                slabBlockRecipe(baseBlock, slabBlock, consumer);
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

            //Dripstone
            stoneCutting(pConsumer, Items.DRIPSTONE_BLOCK, ModBlocks.DRIPSTONE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.DRIPSTONE_BLOCK, ModBlocks.DRIPSTONE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.DRIPSTONE_BLOCK, ModBlocks.DRIPSTONE_WALL.get(), 1);

            //Calcite
            stoneCutting(pConsumer, Items.CALCITE, ModBlocks.CALCITE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.CALCITE, ModBlocks.CALCITE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.CALCITE, ModBlocks.CALCITE_WALL.get(), 1);

            //Concrete
            stoneCutting(pConsumer, Items.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.RED_CONCRETE, ModBlocks.RED_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.RED_CONCRETE, ModBlocks.RED_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), 1);
            stoneCutting(pConsumer, Items.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_SLAB.get(), 2);
            stoneCutting(pConsumer, Items.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_STAIRS.get(), 1);
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

package net.marmar.enhanced_stairs.data.tag;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.marmar.enhanced_stairs.block.ModBlocks;
import net.marmar.enhanced_stairs.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EnhancedStairs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.NEEDS_STEEL_TOOL).add(
                ModBlocks.DEEPSLATE_STAIRS.get(),
                ModBlocks.DEEPSLATE_SLAB.get(),
                ModBlocks.DEEPSLATE_WALL.get()
        );

        this.tag(BlockTags.STAIRS).add(
                ModBlocks.CUT_SANDSTONE_STAIRS.get(),
                ModBlocks.CUT_RED_SANDSTONE_STAIRS.get(),
                ModBlocks.DRIPSTONE_STAIRS.get(),
                ModBlocks.CALCITE_STAIRS.get(),
                ModBlocks.SMOOTH_BASALT_STAIRS.get(),
                ModBlocks.DEEPSLATE_STAIRS.get(),
                ModBlocks.SMOOTH_STONE_STAIRS.get(),
                ModBlocks.QUARTZ_BRICKS_STAIRS.get(),
                ModBlocks.END_STONE_STAIRS.get(),

                //Concrete
                ModBlocks.WHITE_CONCRETE_STAIRS.get(),
                ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(),
                ModBlocks.GRAY_CONCRETE_STAIRS.get(),
                ModBlocks.BLACK_CONCRETE_STAIRS.get(),
                ModBlocks.BROWN_CONCRETE_STAIRS.get(),
                ModBlocks.RED_CONCRETE_STAIRS.get(),
                ModBlocks.ORANGE_CONCRETE_STAIRS.get(),
                ModBlocks.YELLOW_CONCRETE_STAIRS.get(),
                ModBlocks.LIME_CONCRETE_STAIRS.get(),
                ModBlocks.GREEN_CONCRETE_STAIRS.get(),
                ModBlocks.CYAN_CONCRETE_STAIRS.get(),
                ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(),
                ModBlocks.BLUE_CONCRETE_STAIRS.get(),
                ModBlocks.PURPLE_CONCRETE_STAIRS.get(),
                ModBlocks.MAGENTA_CONCRETE_STAIRS.get(),
                ModBlocks.PINK_CONCRETE_STAIRS.get(),

                //Terracotta
                ModBlocks.WHITE_TERRACOTTA_STAIRS.get(),
                ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(),
                ModBlocks.GRAY_TERRACOTTA_STAIRS.get(),
                ModBlocks.BLACK_TERRACOTTA_STAIRS.get(),
                ModBlocks.BROWN_TERRACOTTA_STAIRS.get(),
                ModBlocks.RED_TERRACOTTA_STAIRS.get(),
                ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(),
                ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(),
                ModBlocks.LIME_TERRACOTTA_STAIRS.get(),
                ModBlocks.GREEN_TERRACOTTA_STAIRS.get(),
                ModBlocks.CYAN_TERRACOTTA_STAIRS.get(),
                ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(),
                ModBlocks.BLUE_TERRACOTTA_STAIRS.get(),
                ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(),
                ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(),
                ModBlocks.PINK_TERRACOTTA_STAIRS.get()
        );

        this.tag(BlockTags.SLABS).add(
                ModBlocks.DRIPSTONE_SLAB.get(),
                ModBlocks.CALCITE_SLAB.get(),
                ModBlocks.SMOOTH_BASALT_SLAB.get(),
                ModBlocks.DEEPSLATE_SLAB.get(),
                ModBlocks.QUARTZ_BRICKS_SLAB.get(),
                ModBlocks.END_STONE_SLAB.get(),

                //Concrete
                ModBlocks.WHITE_CONCRETE_SLAB.get(),
                ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(),
                ModBlocks.GRAY_CONCRETE_SLAB.get(),
                ModBlocks.BLACK_CONCRETE_SLAB.get(),
                ModBlocks.BROWN_CONCRETE_SLAB.get(),
                ModBlocks.RED_CONCRETE_SLAB.get(),
                ModBlocks.ORANGE_CONCRETE_SLAB.get(),
                ModBlocks.YELLOW_CONCRETE_SLAB.get(),
                ModBlocks.LIME_CONCRETE_SLAB.get(),
                ModBlocks.GREEN_CONCRETE_SLAB.get(),
                ModBlocks.CYAN_CONCRETE_SLAB.get(),
                ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(),
                ModBlocks.BLUE_CONCRETE_SLAB.get(),
                ModBlocks.PURPLE_CONCRETE_SLAB.get(),
                ModBlocks.MAGENTA_CONCRETE_SLAB.get(),
                ModBlocks.PINK_CONCRETE_SLAB.get(),

                //Terracotta
                ModBlocks.WHITE_TERRACOTTA_SLAB.get(),
                ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(),
                ModBlocks.GRAY_TERRACOTTA_SLAB.get(),
                ModBlocks.BLACK_TERRACOTTA_SLAB.get(),
                ModBlocks.BROWN_TERRACOTTA_SLAB.get(),
                ModBlocks.RED_TERRACOTTA_SLAB.get(),
                ModBlocks.ORANGE_TERRACOTTA_SLAB.get(),
                ModBlocks.YELLOW_TERRACOTTA_SLAB.get(),
                ModBlocks.LIME_TERRACOTTA_SLAB.get(),
                ModBlocks.GREEN_TERRACOTTA_SLAB.get(),
                ModBlocks.CYAN_TERRACOTTA_SLAB.get(),
                ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(),
                ModBlocks.BLUE_TERRACOTTA_SLAB.get(),
                ModBlocks.PURPLE_TERRACOTTA_SLAB.get(),
                ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(),
                ModBlocks.PINK_TERRACOTTA_SLAB.get()
        );

        this.tag(BlockTags.WALLS).add(
                ModBlocks.STONE_WALL.get(),
                ModBlocks.POLISHED_DIORITE_WALL.get(),
                ModBlocks.POLISHED_ANDESITE_WALL.get(),
                ModBlocks.POLISHED_GRANITE_WALL.get(),
                ModBlocks.CUT_SANDSTONE_WALL.get(),
                ModBlocks.SMOOTH_SANDSTONE_WALL.get(),
                ModBlocks.CUT_RED_SANDSTONE_WALL.get(),
                ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get(),
                ModBlocks.PRISMARINE_BRICKS_WALL.get(),
                ModBlocks.DARK_PRISMARINE_WALL.get(),
                ModBlocks.DRIPSTONE_WALL.get(),
                ModBlocks.CALCITE_WALL.get(),
                ModBlocks.SMOOTH_BASALT_WALL.get(),
                ModBlocks.DEEPSLATE_WALL.get(),
                ModBlocks.SMOOTH_STONE_WALL.get(),
                ModBlocks.QUARTZ_BLOCK_WALL.get(),
                ModBlocks.SMOOTH_QUARTZ_WALL.get(),
                ModBlocks.QUARTZ_BRICKS_WALL.get(),
                ModBlocks.END_STONE_WALL.get(),
                ModBlocks.PURPUR_BLOCK_WALL.get(),

                //Concrete
                ModBlocks.WHITE_CONCRETE_WALL.get(),
                ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(),
                ModBlocks.GRAY_CONCRETE_WALL.get(),
                ModBlocks.BLACK_CONCRETE_WALL.get(),
                ModBlocks.BROWN_CONCRETE_WALL.get(),
                ModBlocks.RED_CONCRETE_WALL.get(),
                ModBlocks.ORANGE_CONCRETE_WALL.get(),
                ModBlocks.YELLOW_CONCRETE_WALL.get(),
                ModBlocks.LIME_CONCRETE_WALL.get(),
                ModBlocks.GREEN_CONCRETE_WALL.get(),
                ModBlocks.CYAN_CONCRETE_WALL.get(),
                ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(),
                ModBlocks.BLUE_CONCRETE_WALL.get(),
                ModBlocks.PURPLE_CONCRETE_WALL.get(),
                ModBlocks.MAGENTA_CONCRETE_WALL.get(),
                ModBlocks.PINK_CONCRETE_WALL.get(),

                //Terracotta
                ModBlocks.WHITE_TERRACOTTA_WALL.get(),
                ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(),
                ModBlocks.GRAY_TERRACOTTA_WALL.get(),
                ModBlocks.BLACK_TERRACOTTA_WALL.get(),
                ModBlocks.BROWN_TERRACOTTA_WALL.get(),
                ModBlocks.RED_TERRACOTTA_WALL.get(),
                ModBlocks.ORANGE_TERRACOTTA_WALL.get(),
                ModBlocks.YELLOW_TERRACOTTA_WALL.get(),
                ModBlocks.LIME_TERRACOTTA_WALL.get(),
                ModBlocks.GREEN_TERRACOTTA_WALL.get(),
                ModBlocks.CYAN_TERRACOTTA_WALL.get(),
                ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(),
                ModBlocks.BLUE_TERRACOTTA_WALL.get(),
                ModBlocks.PURPLE_TERRACOTTA_WALL.get(),
                ModBlocks.MAGENTA_TERRACOTTA_WALL.get(),
                ModBlocks.PINK_TERRACOTTA_WALL.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                //Stairs
                ModBlocks.CUT_SANDSTONE_STAIRS.get(),
                ModBlocks.CUT_RED_SANDSTONE_STAIRS.get(),
                ModBlocks.DRIPSTONE_STAIRS.get(),
                ModBlocks.CALCITE_STAIRS.get(),
                ModBlocks.SMOOTH_BASALT_STAIRS.get(),
                ModBlocks.PRISMARINE_BRICKS_WALL.get(),
                ModBlocks.DARK_PRISMARINE_WALL.get(),
                ModBlocks.DEEPSLATE_STAIRS.get(),
                ModBlocks.SMOOTH_STONE_STAIRS.get(),
                ModBlocks.QUARTZ_BRICKS_STAIRS.get(),
                ModBlocks.END_STONE_STAIRS.get(),

                    //Concrete
                    ModBlocks.WHITE_CONCRETE_STAIRS.get(),
                    ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(),
                    ModBlocks.GRAY_CONCRETE_STAIRS.get(),
                    ModBlocks.BLACK_CONCRETE_STAIRS.get(),
                    ModBlocks.BROWN_CONCRETE_STAIRS.get(),
                    ModBlocks.RED_CONCRETE_STAIRS.get(),
                    ModBlocks.ORANGE_CONCRETE_STAIRS.get(),
                    ModBlocks.YELLOW_CONCRETE_STAIRS.get(),
                    ModBlocks.LIME_CONCRETE_STAIRS.get(),
                    ModBlocks.GREEN_CONCRETE_STAIRS.get(),
                    ModBlocks.CYAN_CONCRETE_STAIRS.get(),
                    ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(),
                    ModBlocks.BLUE_CONCRETE_STAIRS.get(),
                    ModBlocks.PURPLE_CONCRETE_STAIRS.get(),
                    ModBlocks.MAGENTA_CONCRETE_STAIRS.get(),
                    ModBlocks.PINK_CONCRETE_STAIRS.get(),

                    //Terracotta
                    ModBlocks.WHITE_TERRACOTTA_STAIRS.get(),
                    ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(),
                    ModBlocks.GRAY_TERRACOTTA_STAIRS.get(),
                    ModBlocks.BLACK_TERRACOTTA_STAIRS.get(),
                    ModBlocks.BROWN_TERRACOTTA_STAIRS.get(),
                    ModBlocks.RED_TERRACOTTA_STAIRS.get(),
                    ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(),
                    ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(),
                    ModBlocks.LIME_TERRACOTTA_STAIRS.get(),
                    ModBlocks.GREEN_TERRACOTTA_STAIRS.get(),
                    ModBlocks.CYAN_TERRACOTTA_STAIRS.get(),
                    ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(),
                    ModBlocks.BLUE_TERRACOTTA_STAIRS.get(),
                    ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(),
                    ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(),
                    ModBlocks.PINK_TERRACOTTA_STAIRS.get(),

                //Slabs
                ModBlocks.DRIPSTONE_SLAB.get(),
                ModBlocks.CALCITE_SLAB.get(),
                ModBlocks.SMOOTH_BASALT_SLAB.get(),
                ModBlocks.DEEPSLATE_SLAB.get(),
                ModBlocks.QUARTZ_BRICKS_SLAB.get(),
                ModBlocks.END_STONE_SLAB.get(),

                    //Concrete
                    ModBlocks.WHITE_CONCRETE_SLAB.get(),
                    ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(),
                    ModBlocks.GRAY_CONCRETE_SLAB.get(),
                    ModBlocks.BLACK_CONCRETE_SLAB.get(),
                    ModBlocks.BROWN_CONCRETE_SLAB.get(),
                    ModBlocks.RED_CONCRETE_SLAB.get(),
                    ModBlocks.ORANGE_CONCRETE_SLAB.get(),
                    ModBlocks.YELLOW_CONCRETE_SLAB.get(),
                    ModBlocks.LIME_CONCRETE_SLAB.get(),
                    ModBlocks.GREEN_CONCRETE_SLAB.get(),
                    ModBlocks.CYAN_CONCRETE_SLAB.get(),
                    ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(),
                    ModBlocks.BLUE_CONCRETE_SLAB.get(),
                    ModBlocks.PURPLE_CONCRETE_SLAB.get(),
                    ModBlocks.MAGENTA_CONCRETE_SLAB.get(),
                    ModBlocks.PINK_CONCRETE_SLAB.get(),

                    //Terracotta
                    ModBlocks.WHITE_TERRACOTTA_SLAB.get(),
                    ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(),
                    ModBlocks.GRAY_TERRACOTTA_SLAB.get(),
                    ModBlocks.BLACK_TERRACOTTA_SLAB.get(),
                    ModBlocks.BROWN_TERRACOTTA_SLAB.get(),
                    ModBlocks.RED_TERRACOTTA_SLAB.get(),
                    ModBlocks.ORANGE_TERRACOTTA_SLAB.get(),
                    ModBlocks.YELLOW_TERRACOTTA_SLAB.get(),
                    ModBlocks.LIME_TERRACOTTA_SLAB.get(),
                    ModBlocks.GREEN_TERRACOTTA_SLAB.get(),
                    ModBlocks.CYAN_TERRACOTTA_SLAB.get(),
                    ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(),
                    ModBlocks.BLUE_TERRACOTTA_SLAB.get(),
                    ModBlocks.PURPLE_TERRACOTTA_SLAB.get(),
                    ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(),
                    ModBlocks.PINK_TERRACOTTA_SLAB.get(),

                //Walls
                ModBlocks.STONE_WALL.get(),
                ModBlocks.POLISHED_DIORITE_WALL.get(),
                ModBlocks.POLISHED_ANDESITE_WALL.get(),
                ModBlocks.POLISHED_GRANITE_WALL.get(),
                ModBlocks.CUT_SANDSTONE_WALL.get(),
                ModBlocks.SMOOTH_SANDSTONE_WALL.get(),
                ModBlocks.CUT_RED_SANDSTONE_WALL.get(),
                ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get(),
                ModBlocks.DRIPSTONE_WALL.get(),
                ModBlocks.CALCITE_WALL.get(),
                ModBlocks.SMOOTH_BASALT_WALL.get(),
                ModBlocks.DEEPSLATE_WALL.get(),
                ModBlocks.SMOOTH_STONE_WALL.get(),
                ModBlocks.QUARTZ_BLOCK_WALL.get(),
                ModBlocks.SMOOTH_QUARTZ_WALL.get(),
                ModBlocks.QUARTZ_BRICKS_WALL.get(),
                ModBlocks.END_STONE_WALL.get(),
                ModBlocks.PURPUR_BLOCK_WALL.get(),

                    //Concrete
                    ModBlocks.WHITE_CONCRETE_WALL.get(),
                    ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(),
                    ModBlocks.GRAY_CONCRETE_WALL.get(),
                    ModBlocks.BLACK_CONCRETE_WALL.get(),
                    ModBlocks.BROWN_CONCRETE_WALL.get(),
                    ModBlocks.RED_CONCRETE_WALL.get(),
                    ModBlocks.ORANGE_CONCRETE_WALL.get(),
                    ModBlocks.YELLOW_CONCRETE_WALL.get(),
                    ModBlocks.LIME_CONCRETE_WALL.get(),
                    ModBlocks.GREEN_CONCRETE_WALL.get(),
                    ModBlocks.CYAN_CONCRETE_WALL.get(),
                    ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(),
                    ModBlocks.BLUE_CONCRETE_WALL.get(),
                    ModBlocks.PURPLE_CONCRETE_WALL.get(),
                    ModBlocks.MAGENTA_CONCRETE_WALL.get(),
                    ModBlocks.PINK_CONCRETE_WALL.get(),

                    //Terracotta
                    ModBlocks.WHITE_TERRACOTTA_WALL.get(),
                    ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(),
                    ModBlocks.GRAY_TERRACOTTA_WALL.get(),
                    ModBlocks.BLACK_TERRACOTTA_WALL.get(),
                    ModBlocks.BROWN_TERRACOTTA_WALL.get(),
                    ModBlocks.RED_TERRACOTTA_WALL.get(),
                    ModBlocks.ORANGE_TERRACOTTA_WALL.get(),
                    ModBlocks.YELLOW_TERRACOTTA_WALL.get(),
                    ModBlocks.LIME_TERRACOTTA_WALL.get(),
                    ModBlocks.GREEN_TERRACOTTA_WALL.get(),
                    ModBlocks.CYAN_TERRACOTTA_WALL.get(),
                    ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(),
                    ModBlocks.BLUE_TERRACOTTA_WALL.get(),
                    ModBlocks.PURPLE_TERRACOTTA_WALL.get(),
                    ModBlocks.MAGENTA_TERRACOTTA_WALL.get(),
                    ModBlocks.PINK_TERRACOTTA_WALL.get()
        );
    }
}

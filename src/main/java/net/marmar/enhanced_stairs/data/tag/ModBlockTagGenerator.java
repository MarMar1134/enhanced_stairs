package net.marmar.enhanced_stairs.data.tag;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.marmar.enhanced_stairs.block.ModBlocks;
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
        this.tag(BlockTags.STAIRS).add(
                ModBlocks.DRIPSTONE_STAIRS.get(),
                ModBlocks.CALCITE_STAIRS.get(),
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
                ModBlocks.PINK_CONCRETE_STAIRS.get()
        );

        this.tag(BlockTags.SLABS).add(
                ModBlocks.DRIPSTONE_SLAB.get(),
                ModBlocks.CALCITE_SLAB.get(),
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
                ModBlocks.PINK_CONCRETE_SLAB.get()
        );

        this.tag(BlockTags.WALLS).add(
                ModBlocks.STONE_WALL.get(),
                ModBlocks.POLISHED_DIORITE_WALL.get(),
                ModBlocks.POLISHED_ANDESITE_WALL.get(),
                ModBlocks.POLISHED_GRANITE_WALL.get(),
                ModBlocks.DRIPSTONE_WALL.get(),
                ModBlocks.CALCITE_WALL.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                //Stairs
                ModBlocks.DRIPSTONE_STAIRS.get(),
                ModBlocks.CALCITE_STAIRS.get(),
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

                //Slabs
                ModBlocks.DRIPSTONE_SLAB.get(),
                ModBlocks.CALCITE_SLAB.get(),
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

                //Walls
                ModBlocks.STONE_WALL.get(),
                ModBlocks.POLISHED_DIORITE_WALL.get(),
                ModBlocks.POLISHED_ANDESITE_WALL.get(),
                ModBlocks.POLISHED_GRANITE_WALL.get(),
                ModBlocks.DRIPSTONE_WALL.get(),
                ModBlocks.CALCITE_WALL.get()
        );
    }
}

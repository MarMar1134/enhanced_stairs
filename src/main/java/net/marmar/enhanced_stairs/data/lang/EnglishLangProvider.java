package net.marmar.enhanced_stairs.data.lang;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.marmar.enhanced_stairs.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishLangProvider extends LanguageProvider {
    public EnglishLangProvider(PackOutput output) {
        super(output, EnhancedStairs.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Stone
        addBlock(ModBlocks.STONE_WALL, "Stone wall");

        //D,A,G
        addBlock(ModBlocks.POLISHED_DIORITE_WALL, "Polished diorite wall");
        addBlock(ModBlocks.POLISHED_ANDESITE_WALL, "Polished andesite wall");
        addBlock(ModBlocks.POLISHED_GRANITE_WALL, "Polished granite wall");

        //Cut sandstone
        addBlock(ModBlocks.CUT_SANDSTONE_STAIRS, "Cut sandstone stairs");
        addBlock(ModBlocks.CUT_SANDSTONE_WALL, "Cut sandstone wall");

        //Smooth sandstone
        addBlock(ModBlocks.SMOOTH_SANDSTONE_WALL, "Smooth sandstone wall");

        //Cut red sandstone
        addBlock(ModBlocks.CUT_RED_SANDSTONE_STAIRS, "Cut red sandstone stairs");
        addBlock(ModBlocks.CUT_RED_SANDSTONE_WALL, "Cut red sandstone wall");

        //Smooth red sandstone
        addBlock(ModBlocks.SMOOTH_RED_SANDSTONE_WALL, "Smooth red sandstone wall");

        //Prismarine bricks
        addBlock(ModBlocks.PRISMARINE_BRICKS_WALL, "Prismarine brick wall");

        //Dark prismarine
        addBlock(ModBlocks.DARK_PRISMARINE_WALL, "Dark prismarine wall");

        //Dripstone
        addBlock(ModBlocks.DRIPSTONE_SLAB, "Dripstone slab");
        addBlock(ModBlocks.DRIPSTONE_STAIRS, "Dripstone stairs");
        addBlock(ModBlocks.DRIPSTONE_WALL, "Dripstone wall");

        //Calcite
        addBlock(ModBlocks.CALCITE_SLAB, "Calcite slab");
        addBlock(ModBlocks.CALCITE_STAIRS, "Calcite stairs");
        addBlock(ModBlocks.CALCITE_WALL, "Calcite wall");

        //Smooth basalt
        addBlock(ModBlocks.SMOOTH_BASALT_SLAB, "Smooth basalt slab");
        addBlock(ModBlocks.SMOOTH_BASALT_STAIRS, "Smooth basalt stairs");
        addBlock(ModBlocks.SMOOTH_BASALT_WALL, "Smooth basalt wall");

        //Deepslate
        addBlock(ModBlocks.DEEPSLATE_SLAB, "Deepslate slab");
        addBlock(ModBlocks.DEEPSLATE_STAIRS, "Deepslate stairs");
        addBlock(ModBlocks.DEEPSLATE_WALL, "Deepslate wall");

        //Smooth stone
        addBlock(ModBlocks.SMOOTH_STONE_STAIRS, "Smooth stone stairs");
        addBlock(ModBlocks.SMOOTH_STONE_WALL, "Smooth stone wall");

        //Netherrack
        addBlock(ModBlocks.NETHERRACK_SLAB, "Netherrack slab");
        addBlock(ModBlocks.NETHERRACK_STAIRS, "Netherrack stairs");
        addBlock(ModBlocks.NETHERRACK_WALL, "Netherrack wall");

        //Quartz
        addBlock(ModBlocks.QUARTZ_BLOCK_WALL, "Quartz wall");

        //Smooth quartz
        addBlock(ModBlocks.SMOOTH_QUARTZ_WALL, "Smooth quartz wall");

        //Quartz bricks
        addBlock(ModBlocks.QUARTZ_BRICKS_SLAB, "Quartz bricks slab");
        addBlock(ModBlocks.QUARTZ_BRICKS_STAIRS, "Quartz bricks stairs");
        addBlock(ModBlocks.QUARTZ_BRICKS_WALL, "Quartz bricks wall");

        //End stone
        addBlock(ModBlocks.END_STONE_SLAB, "End stone slab");
        addBlock(ModBlocks.END_STONE_STAIRS, "End stone stairs");
        addBlock(ModBlocks.END_STONE_WALL, "End stone wall");

        //Purpur
        addBlock(ModBlocks.PURPUR_BLOCK_WALL, "Purpur wall");

        //Concrete
            //Slabs
            addBlock(ModBlocks.WHITE_CONCRETE_SLAB, "White concrete slab");
            addBlock(ModBlocks.BLACK_CONCRETE_SLAB, "Black concrete slab");
            addBlock(ModBlocks.BROWN_CONCRETE_SLAB, "Brown concrete slab");
            addBlock(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, "Light gray concrete slab");
            addBlock(ModBlocks.GRAY_CONCRETE_SLAB, "Gray concrete slab");
            addBlock(ModBlocks.RED_CONCRETE_SLAB, "Red concrete slab");
            addBlock(ModBlocks.ORANGE_CONCRETE_SLAB, "Orange concrete slab");
            addBlock(ModBlocks.YELLOW_CONCRETE_SLAB, "Yellow concrete slab");
            addBlock(ModBlocks.LIME_CONCRETE_SLAB, "Lime concrete slab");
            addBlock(ModBlocks.GREEN_CONCRETE_SLAB, "Green concrete slab");
            addBlock(ModBlocks.CYAN_CONCRETE_SLAB, "Cyan concrete slab");
            addBlock(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, "Light blue concrete slab");
            addBlock(ModBlocks.BLUE_CONCRETE_SLAB, "Blue concrete slab");
            addBlock(ModBlocks.PURPLE_CONCRETE_SLAB, "Purple concrete slab");
            addBlock(ModBlocks.MAGENTA_CONCRETE_SLAB, "Magenta concrete slab");
            addBlock(ModBlocks.PINK_CONCRETE_SLAB, "Pink concrete slab");

            //Stairs
            addBlock(ModBlocks.WHITE_CONCRETE_STAIRS, "White concrete stairs");
            addBlock(ModBlocks.BLACK_CONCRETE_STAIRS, "Black concrete stairs");
            addBlock(ModBlocks.BROWN_CONCRETE_STAIRS, "Brown concrete stairs");
            addBlock(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, "Light gray concrete stairs");
            addBlock(ModBlocks.GRAY_CONCRETE_STAIRS, "Gray concrete stairs");
            addBlock(ModBlocks.RED_CONCRETE_STAIRS, "Red concrete stairs");
            addBlock(ModBlocks.ORANGE_CONCRETE_STAIRS, "Orange concrete stairs");
            addBlock(ModBlocks.YELLOW_CONCRETE_STAIRS, "Yellow concrete stairs");
            addBlock(ModBlocks.LIME_CONCRETE_STAIRS, "Lime concrete stairs");
            addBlock(ModBlocks.GREEN_CONCRETE_STAIRS, "Green concrete stairs");
            addBlock(ModBlocks.CYAN_CONCRETE_STAIRS, "Cyan concrete stairs");
            addBlock(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, "Light blue concrete stairs");
            addBlock(ModBlocks.BLUE_CONCRETE_STAIRS, "Blue concrete stairs");
            addBlock(ModBlocks.PURPLE_CONCRETE_STAIRS, "Purple concrete stairs");
            addBlock(ModBlocks.MAGENTA_CONCRETE_STAIRS, "Magenta concrete stairs");
            addBlock(ModBlocks.PINK_CONCRETE_STAIRS, "Pink concrete stairs");

            //Walls
            addBlock(ModBlocks.WHITE_CONCRETE_WALL, "White concrete wall");
            addBlock(ModBlocks.BLACK_CONCRETE_WALL, "Black concrete wall");
            addBlock(ModBlocks.BROWN_CONCRETE_WALL, "Brown concrete wall");
            addBlock(ModBlocks.LIGHT_GRAY_CONCRETE_WALL, "Light gray concrete wall");
            addBlock(ModBlocks.GRAY_CONCRETE_WALL, "Gray concrete wall");
            addBlock(ModBlocks.RED_CONCRETE_WALL, "Red concrete wall");
            addBlock(ModBlocks.ORANGE_CONCRETE_WALL, "Orange concrete wall");
            addBlock(ModBlocks.YELLOW_CONCRETE_WALL, "Yellow concrete wall");
            addBlock(ModBlocks.LIME_CONCRETE_WALL, "Lime concrete wall");
            addBlock(ModBlocks.GREEN_CONCRETE_WALL, "Green concrete wall");
            addBlock(ModBlocks.CYAN_CONCRETE_WALL, "Cyan concrete wall");
            addBlock(ModBlocks.LIGHT_BLUE_CONCRETE_WALL, "Light blue concrete wall");
            addBlock(ModBlocks.BLUE_CONCRETE_WALL, "Blue concrete wall");
            addBlock(ModBlocks.PURPLE_CONCRETE_WALL, "Purple concrete wall");
            addBlock(ModBlocks.MAGENTA_CONCRETE_WALL, "Magenta concrete wall");
            addBlock(ModBlocks.PINK_CONCRETE_WALL, "Pink concrete wall");

        //Terracotta
            //Slabs
            addBlock(ModBlocks.WHITE_TERRACOTTA_SLAB, "White terracotta slab");
            addBlock(ModBlocks.BLACK_TERRACOTTA_SLAB, "Black terracotta slab");
            addBlock(ModBlocks.BROWN_TERRACOTTA_SLAB, "Brown terracotta slab");
            addBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, "Light gray terracotta slab");
            addBlock(ModBlocks.GRAY_TERRACOTTA_SLAB, "Gray terracotta slab");
            addBlock(ModBlocks.RED_TERRACOTTA_SLAB, "Red terracotta slab");
            addBlock(ModBlocks.ORANGE_TERRACOTTA_SLAB, "Orange terracotta slab");
            addBlock(ModBlocks.YELLOW_TERRACOTTA_SLAB, "Yellow terracotta slab");
            addBlock(ModBlocks.LIME_TERRACOTTA_SLAB, "Lime terracotta slab");
            addBlock(ModBlocks.GREEN_TERRACOTTA_SLAB, "Green terracotta slab");
            addBlock(ModBlocks.CYAN_TERRACOTTA_SLAB, "Cyan terracotta slab");
            addBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, "Light blue terracotta slab");
            addBlock(ModBlocks.BLUE_TERRACOTTA_SLAB, "Blue terracotta slab");
            addBlock(ModBlocks.PURPLE_TERRACOTTA_SLAB, "Purple terracotta slab");
            addBlock(ModBlocks.MAGENTA_TERRACOTTA_SLAB, "Magenta terracotta slab");
            addBlock(ModBlocks.PINK_TERRACOTTA_SLAB, "Pink terracotta slab");

            //Stairs
            addBlock(ModBlocks.WHITE_TERRACOTTA_STAIRS, "White terracotta stairs");
            addBlock(ModBlocks.BLACK_TERRACOTTA_STAIRS, "Black terracotta stairs");
            addBlock(ModBlocks.BROWN_TERRACOTTA_STAIRS, "Brown terracotta stairs");
            addBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, "Light gray terracotta stairs");
            addBlock(ModBlocks.GRAY_TERRACOTTA_STAIRS, "Gray terracotta stairs");
            addBlock(ModBlocks.RED_TERRACOTTA_STAIRS, "Red terracotta stairs");
            addBlock(ModBlocks.ORANGE_TERRACOTTA_STAIRS, "Orange terracotta stairs");
            addBlock(ModBlocks.YELLOW_TERRACOTTA_STAIRS, "Yellow terracotta stairs");
            addBlock(ModBlocks.LIME_TERRACOTTA_STAIRS, "Lime terracotta stairs");
            addBlock(ModBlocks.GREEN_TERRACOTTA_STAIRS, "Green terracotta stairs");
            addBlock(ModBlocks.CYAN_TERRACOTTA_STAIRS, "Cyan terracotta stairs");
            addBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, "Light blue terracotta stairs");
            addBlock(ModBlocks.BLUE_TERRACOTTA_STAIRS, "Blue terracotta stairs");
            addBlock(ModBlocks.PURPLE_TERRACOTTA_STAIRS, "Purple terracotta stairs");
            addBlock(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, "Magenta terracotta stairs");
            addBlock(ModBlocks.PINK_TERRACOTTA_STAIRS, "Pink terracotta stairs");

            //Walls
            addBlock(ModBlocks.WHITE_TERRACOTTA_WALL, "White terracotta wall");
            addBlock(ModBlocks.BLACK_TERRACOTTA_WALL, "Black terracotta wall");
            addBlock(ModBlocks.BROWN_TERRACOTTA_WALL, "Brown terracotta wall");
            addBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, "Light gray terracotta wall");
            addBlock(ModBlocks.GRAY_TERRACOTTA_WALL, "Gray terracotta wall");
            addBlock(ModBlocks.RED_TERRACOTTA_WALL, "Red terracotta wall");
            addBlock(ModBlocks.ORANGE_TERRACOTTA_WALL, "Orange terracotta wall");
            addBlock(ModBlocks.YELLOW_TERRACOTTA_WALL, "Yellow terracotta wall");
            addBlock(ModBlocks.LIME_TERRACOTTA_WALL, "Lime terracotta wall");
            addBlock(ModBlocks.GREEN_TERRACOTTA_WALL, "Green terracotta wall");
            addBlock(ModBlocks.CYAN_TERRACOTTA_WALL, "Cyan terracotta wall");
            addBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, "Light blue terracotta wall");
            addBlock(ModBlocks.BLUE_TERRACOTTA_WALL, "Blue terracotta wall");
            addBlock(ModBlocks.PURPLE_TERRACOTTA_WALL, "Purple terracotta wall");
            addBlock(ModBlocks.MAGENTA_TERRACOTTA_WALL, "Magenta terracotta wall");
            addBlock(ModBlocks.PINK_TERRACOTTA_WALL, "Pink terracotta wall");
    }
}

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

        //Dripstone
        addBlock(ModBlocks.DRIPSTONE_SLAB, "Dripstone slab");
        addBlock(ModBlocks.DRIPSTONE_STAIRS, "Dripstone stairs");
        addBlock(ModBlocks.DRIPSTONE_WALL, "Dripstone wall");

        //Calcite
        addBlock(ModBlocks.CALCITE_SLAB, "Calcite slab");
        addBlock(ModBlocks.CALCITE_STAIRS, "Calcite stairs");
        addBlock(ModBlocks.CALCITE_WALL, "Calcite wall");

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
    }
}

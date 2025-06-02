package net.marmar.enhanced_stairs.data.lang;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.marmar.enhanced_stairs.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class SpanishLangProvider extends LanguageProvider {
    public SpanishLangProvider(PackOutput output, String locale) {
        super(output, EnhancedStairs.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        //Stone
        addBlock(ModBlocks.STONE_WALL, "Pared de piedra");

        //D,A,G
        addBlock(ModBlocks.POLISHED_DIORITE_WALL, "Pared de diorita pulida");
        addBlock(ModBlocks.POLISHED_ANDESITE_WALL, "Pared de andesita pulida");
        addBlock(ModBlocks.POLISHED_GRANITE_WALL, "Pared de granito pulido");

        //Dripstone
        addBlock(ModBlocks.DRIPSTONE_SLAB, "Baldosa de bloque de espeleotema");
        addBlock(ModBlocks.DRIPSTONE_STAIRS, "Escaleras de bloque de espeleotema");
        addBlock(ModBlocks.DRIPSTONE_WALL, "Pared de bloque de espeleotema");

        //Calcite
        addBlock(ModBlocks.CALCITE_SLAB, "Baldosa de calcita");
        addBlock(ModBlocks.CALCITE_STAIRS, "Escaleras de calcita");
        addBlock(ModBlocks.CALCITE_WALL, "Pared de calcita");

        //Concrete
        //Slabs
        addBlock(ModBlocks.WHITE_CONCRETE_SLAB, "Baldosa de concreto blanco");
        addBlock(ModBlocks.BLACK_CONCRETE_SLAB, "Baldosa de concreto negro");
        addBlock(ModBlocks.BROWN_CONCRETE_SLAB, "Baldosa de concreto marrón");
        addBlock(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, "Baldosa de concreto gris claro");
        addBlock(ModBlocks.GRAY_CONCRETE_SLAB, "Baldosa de concreto gris");
        addBlock(ModBlocks.RED_CONCRETE_SLAB, "Baldosa de concreto rojo");
        addBlock(ModBlocks.ORANGE_CONCRETE_SLAB, "Baldosa de concreto naranja");
        addBlock(ModBlocks.YELLOW_CONCRETE_SLAB, "Baldosa de concreto amarillo");
        addBlock(ModBlocks.LIME_CONCRETE_SLAB, "Baldosa de concreto lima");
        addBlock(ModBlocks.GREEN_CONCRETE_SLAB, "Baldosa de concreto verde");
        addBlock(ModBlocks.CYAN_CONCRETE_SLAB, "Baldosa de concreto cyan");
        addBlock(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, "Baldosa de concreto celeste");
        addBlock(ModBlocks.BLUE_CONCRETE_SLAB, "Baldosa de concreto azul");
        addBlock(ModBlocks.PURPLE_CONCRETE_SLAB, "Baldosa de concreto púrpura");
        addBlock(ModBlocks.MAGENTA_CONCRETE_SLAB, "Baldosa de concreto magenta");
        addBlock(ModBlocks.PINK_CONCRETE_SLAB, "Baldosa de concreto rosa");

        //Stairs
        addBlock(ModBlocks.WHITE_CONCRETE_STAIRS, "Escaleras de concreto blanco");
        addBlock(ModBlocks.BLACK_CONCRETE_STAIRS, "Escaleras de concreto negro");
        addBlock(ModBlocks.BROWN_CONCRETE_STAIRS, "Escaleras de concreto marrón");
        addBlock(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, "Escaleras de concreto gris claro");
        addBlock(ModBlocks.GRAY_CONCRETE_STAIRS, "Escaleras de concreto gris");
        addBlock(ModBlocks.RED_CONCRETE_STAIRS, "Escaleras de concreto rojo");
        addBlock(ModBlocks.ORANGE_CONCRETE_STAIRS, "Escaleras de concreto naranja");
        addBlock(ModBlocks.YELLOW_CONCRETE_STAIRS, "Escaleras de concreto amarillo");
        addBlock(ModBlocks.LIME_CONCRETE_STAIRS, "Escaleras de concreto lima");
        addBlock(ModBlocks.GREEN_CONCRETE_STAIRS, "Escaleras de concreto verde");
        addBlock(ModBlocks.CYAN_CONCRETE_STAIRS, "Escaleras de concreto cyan");
        addBlock(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, "Escaleras de concreto celeste");
        addBlock(ModBlocks.BLUE_CONCRETE_STAIRS, "Escaleras de concreto azul");
        addBlock(ModBlocks.PURPLE_CONCRETE_STAIRS, "Escaleras de concreto púrpura");
        addBlock(ModBlocks.MAGENTA_CONCRETE_STAIRS, "Escaleras de concreto magenta");
        addBlock(ModBlocks.PINK_CONCRETE_STAIRS, "Escaleras de concreto rosa");
    }
}

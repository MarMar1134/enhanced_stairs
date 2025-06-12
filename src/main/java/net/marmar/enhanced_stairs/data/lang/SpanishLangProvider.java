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

        //Cut sandstone
        addBlock(ModBlocks.CUT_SANDSTONE_STAIRS, "Escaleras de arenisca cortada");
        addBlock(ModBlocks.CUT_SANDSTONE_WALL, "Pared de arenisca cortada");

        //Smooth sandstone
        addBlock(ModBlocks.SMOOTH_SANDSTONE_WALL, "Pared de arenisca lisa");

        //Cut red sandstone
        addBlock(ModBlocks.CUT_RED_SANDSTONE_STAIRS, "Escaleras de arenisca roja cortada");
        addBlock(ModBlocks.CUT_RED_SANDSTONE_WALL, "Pared de arenisca roja cortada");

        //Smooth red sandstone
        addBlock(ModBlocks.SMOOTH_RED_SANDSTONE_WALL, "Pared de arenisca roja lisa");

        //Prismarine bricks
        addBlock(ModBlocks.PRISMARINE_BRICKS_WALL, "Pared de ladrillos de prismarina");

        //Dark prismarine
        addBlock(ModBlocks.DARK_PRISMARINE_WALL, "Pared de prismarina oscura");

        //Dripstone
        addBlock(ModBlocks.DRIPSTONE_SLAB, "Baldosa de bloque de espeleotema");
        addBlock(ModBlocks.DRIPSTONE_STAIRS, "Escaleras de bloque de espeleotema");
        addBlock(ModBlocks.DRIPSTONE_WALL, "Pared de bloque de espeleotema");

        //Calcite
        addBlock(ModBlocks.CALCITE_SLAB, "Baldosa de calcita");
        addBlock(ModBlocks.CALCITE_STAIRS, "Escaleras de calcita");
        addBlock(ModBlocks.CALCITE_WALL, "Pared de calcita");

        //Smooth basalt
        addBlock(ModBlocks.SMOOTH_BASALT_SLAB, "Baldosa de basalto liso");
        addBlock(ModBlocks.SMOOTH_BASALT_STAIRS, "Escaleras de basalto liso");
        addBlock(ModBlocks.SMOOTH_BASALT_WALL, "Pared de basalto liso");

        //Deepslate
        addBlock(ModBlocks.DEEPSLATE_SLAB, "Baldosa de pizarra profunda");
        addBlock(ModBlocks.DEEPSLATE_STAIRS, "Escaleras de pizarra profunda");
        addBlock(ModBlocks.DEEPSLATE_WALL, "Pared de pizarra profunda");

        //Smooth stone
        addBlock(ModBlocks.SMOOTH_STONE_STAIRS, "Escaleras de piedra lisa");
        addBlock(ModBlocks.SMOOTH_STONE_WALL, "Pared de piedra lisa");

        //Netherrack
        addBlock(ModBlocks.NETHERRACK_SLAB, "Baldosa de netherrack");
        addBlock(ModBlocks.NETHERRACK_STAIRS, "Escaleras de netherrack");
        addBlock(ModBlocks.NETHERRACK_WALL, "Pared de netherrack");

        //Quartz
        addBlock(ModBlocks.QUARTZ_BLOCK_WALL, "Pared de cuarzo");

        //Smooth quartz
        addBlock(ModBlocks.SMOOTH_QUARTZ_WALL, "Pared de cuarzo liso");

        //Quartz bricks
        addBlock(ModBlocks.QUARTZ_BRICKS_SLAB, "Baldosa de ladrillos de cuarzo");
        addBlock(ModBlocks.QUARTZ_BRICKS_STAIRS, "Escaleras de ladrillos de cuarzo");
        addBlock(ModBlocks.QUARTZ_BRICKS_WALL, "Pared de ladrillos de cuarzo");

        //End stone
        addBlock(ModBlocks.END_STONE_SLAB, "Baldosa de piedra del end");
        addBlock(ModBlocks.END_STONE_STAIRS, "Escaleras de piedra del end");
        addBlock(ModBlocks.END_STONE_WALL, "Pared de piedra del end");

        //Purpur
        addBlock(ModBlocks.PURPUR_BLOCK_WALL, "Pared de purpur");

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

            //Walls
            addBlock(ModBlocks.WHITE_CONCRETE_WALL, "Pared de concreto blanco");
            addBlock(ModBlocks.BLACK_CONCRETE_WALL, "Pared de concreto negro");
            addBlock(ModBlocks.BROWN_CONCRETE_WALL, "Pared de concreto marrón");
            addBlock(ModBlocks.LIGHT_GRAY_CONCRETE_WALL, "Pared de concreto gris claro");
            addBlock(ModBlocks.GRAY_CONCRETE_WALL, "Pared de concreto gris");
            addBlock(ModBlocks.RED_CONCRETE_WALL, "Pared de concreto rojo");
            addBlock(ModBlocks.ORANGE_CONCRETE_WALL, "Pared de concreto naranja");
            addBlock(ModBlocks.YELLOW_CONCRETE_WALL, "Pared de concreto amarillo");
            addBlock(ModBlocks.LIME_CONCRETE_WALL, "Pared de concreto lima");
            addBlock(ModBlocks.GREEN_CONCRETE_WALL, "Pared de concreto verde");
            addBlock(ModBlocks.CYAN_CONCRETE_WALL, "Pared de concreto cyan");
            addBlock(ModBlocks.LIGHT_BLUE_CONCRETE_WALL, "Pared de concreto celeste");
            addBlock(ModBlocks.BLUE_CONCRETE_WALL, "Pared de concreto azul");
            addBlock(ModBlocks.PURPLE_CONCRETE_WALL, "Pared de concreto púrpura");
            addBlock(ModBlocks.MAGENTA_CONCRETE_WALL, "Pared de concreto magenta");
            addBlock(ModBlocks.PINK_CONCRETE_WALL, "Pared de concreto rosa");

        //Terracota
            //Slabs
            addBlock(ModBlocks.WHITE_TERRACOTTA_SLAB, "Baldosa de terracota blanca");
            addBlock(ModBlocks.BLACK_TERRACOTTA_SLAB, "Baldosa de terracota negra");
            addBlock(ModBlocks.BROWN_TERRACOTTA_SLAB, "Baldosa de terracota marrón");
            addBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, "Baldosa de terracota gris claro");
            addBlock(ModBlocks.GRAY_TERRACOTTA_SLAB, "Baldosa de terracota gris");
            addBlock(ModBlocks.RED_TERRACOTTA_SLAB, "Baldosa de terracota roja");
            addBlock(ModBlocks.ORANGE_TERRACOTTA_SLAB, "Baldosa de terracota naranja");
            addBlock(ModBlocks.YELLOW_TERRACOTTA_SLAB, "Baldosa de terracota amarilla");
            addBlock(ModBlocks.LIME_TERRACOTTA_SLAB, "Baldosa de terracota lima");
            addBlock(ModBlocks.GREEN_TERRACOTTA_SLAB, "Baldosa de terracota verde");
            addBlock(ModBlocks.CYAN_TERRACOTTA_SLAB, "Baldosa de terracota cyan");
            addBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, "Baldosa de terracota celeste");
            addBlock(ModBlocks.BLUE_TERRACOTTA_SLAB, "Baldosa de terracota azul");
            addBlock(ModBlocks.PURPLE_TERRACOTTA_SLAB, "Baldosa de terracota púrpura");
            addBlock(ModBlocks.MAGENTA_TERRACOTTA_SLAB, "Baldosa de terracota magenta");
            addBlock(ModBlocks.PINK_TERRACOTTA_SLAB, "Baldosa de terracota rosa");

            //Stairs
            addBlock(ModBlocks.WHITE_TERRACOTTA_STAIRS, "Escaleras de terracota blanca");
            addBlock(ModBlocks.BLACK_TERRACOTTA_STAIRS, "Escaleras de terracota negra");
            addBlock(ModBlocks.BROWN_TERRACOTTA_STAIRS, "Escaleras de terracota marrón");
            addBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, "Escaleras de terracota gris claro");
            addBlock(ModBlocks.GRAY_TERRACOTTA_STAIRS, "Escaleras de terracota gris");
            addBlock(ModBlocks.RED_TERRACOTTA_STAIRS, "Escaleras de terracota roja");
            addBlock(ModBlocks.ORANGE_TERRACOTTA_STAIRS, "Escaleras de terracota naranja");
            addBlock(ModBlocks.YELLOW_TERRACOTTA_STAIRS, "Escaleras de terracota amarilla");
            addBlock(ModBlocks.LIME_TERRACOTTA_STAIRS, "Escaleras de terracota lima");
            addBlock(ModBlocks.GREEN_TERRACOTTA_STAIRS, "Escaleras de terracota verde");
            addBlock(ModBlocks.CYAN_TERRACOTTA_STAIRS, "Escaleras de terracota cyan");
            addBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, "Escaleras de terracota celeste");
            addBlock(ModBlocks.BLUE_TERRACOTTA_STAIRS, "Escaleras de terracota azul");
            addBlock(ModBlocks.PURPLE_TERRACOTTA_STAIRS, "Escaleras de terracota púrpura");
            addBlock(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, "Escaleras de terracota magenta");
            addBlock(ModBlocks.PINK_TERRACOTTA_STAIRS, "Escaleras de terracota rosa");

            //Walls
            addBlock(ModBlocks.WHITE_TERRACOTTA_WALL, "Pared de terracota blanca");
            addBlock(ModBlocks.BLACK_TERRACOTTA_WALL, "Pared de terracota negra");
            addBlock(ModBlocks.BROWN_TERRACOTTA_WALL, "Pared de terracota marrón");
            addBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, "Pared de terracota gris claro");
            addBlock(ModBlocks.GRAY_TERRACOTTA_WALL, "Pared de terracota gris");
            addBlock(ModBlocks.RED_TERRACOTTA_WALL, "Pared de terracota roja");
            addBlock(ModBlocks.ORANGE_TERRACOTTA_WALL, "Pared de terracota naranja");
            addBlock(ModBlocks.YELLOW_TERRACOTTA_WALL, "Pared de terracota amarilla");
            addBlock(ModBlocks.LIME_TERRACOTTA_WALL, "Pared de terracota lima");
            addBlock(ModBlocks.GREEN_TERRACOTTA_WALL, "Pared de terracota verde");
            addBlock(ModBlocks.CYAN_TERRACOTTA_WALL, "Pared de terracota cyan");
            addBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, "Pared de terracota celeste");
            addBlock(ModBlocks.BLUE_TERRACOTTA_WALL, "Pared de terracota azul");
            addBlock(ModBlocks.PURPLE_TERRACOTTA_WALL, "Pared de terracota púrpura");
            addBlock(ModBlocks.MAGENTA_TERRACOTTA_WALL, "Pared de terracota magenta");
            addBlock(ModBlocks.PINK_TERRACOTTA_WALL, "Pared de terracota rosa");
    }
}

package net.marmar.enhanced_stairs.data.loot;

import net.marmar.enhanced_stairs.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //Stone
        this.dropSelf(ModBlocks.STONE_WALL.get());

        //D, A, G
        this.dropSelf(ModBlocks.POLISHED_DIORITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_ANDESITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_GRANITE_WALL.get());

        //Cut sandstone
        this.dropSelf(ModBlocks.CUT_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.CUT_SANDSTONE_WALL.get());

        //Smooth sandstone
        this.dropSelf(ModBlocks.SMOOTH_SANDSTONE_WALL.get());

        //Cut red sandstone
        this.dropSelf(ModBlocks.CUT_RED_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.CUT_RED_SANDSTONE_WALL.get());

        //Smooth red sandstone
        this.dropSelf(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get());

        //Prismarine bricks
        this.dropSelf(ModBlocks.PRISMARINE_BRICKS_WALL.get());

        //Dark prismarine
        this.dropSelf(ModBlocks.DARK_PRISMARINE_WALL.get());

        //Dripstone
        this.add(ModBlocks.DRIPSTONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.DRIPSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.DRIPSTONE_WALL.get());

        //Calcite
        this.add(ModBlocks.CALCITE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.CALCITE_STAIRS.get());
        this.dropSelf(ModBlocks.CALCITE_WALL.get());

        //Smooth basalt
        this.add(ModBlocks.SMOOTH_BASALT_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.SMOOTH_BASALT_STAIRS.get());
        this.dropSelf(ModBlocks.SMOOTH_BASALT_WALL.get());

        //Deepslate
        this.add(ModBlocks.DEEPSLATE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.DEEPSLATE_STAIRS.get());
        this.dropSelf(ModBlocks.DEEPSLATE_WALL.get());

        //Smooth stone
        this.dropSelf(ModBlocks.SMOOTH_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.SMOOTH_STONE_WALL.get());

        this.add(ModBlocks.NETHERRACK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.NETHERRACK_STAIRS.get());
        this.dropSelf(ModBlocks.NETHERRACK_WALL.get());

        //Quartz
        this.dropSelf(ModBlocks.QUARTZ_BLOCK_WALL.get());

        //Smooth quartz
        this.dropSelf(ModBlocks.SMOOTH_QUARTZ_WALL.get());

        //Quartz bricks
        this.add(ModBlocks.QUARTZ_BRICKS_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.QUARTZ_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.QUARTZ_BRICKS_WALL.get());

        //End stone
        this.add(ModBlocks.END_STONE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ModBlocks.END_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.END_STONE_WALL.get());

        //Purpur
        this.dropSelf(ModBlocks.PURPUR_BLOCK_WALL.get());

        //Concrete
            //Slabs
            this.add(ModBlocks.WHITE_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.GRAY_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.BLACK_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.BROWN_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.RED_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.ORANGE_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.YELLOW_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.LIME_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.GREEN_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.CYAN_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.BLUE_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.PURPLE_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.PINK_CONCRETE_SLAB.get(), this::createSlabItemTable);

            //Stairs
            this.dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.RED_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.LIME_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.PINK_CONCRETE_STAIRS.get());

            //Walls
            this.dropSelf(ModBlocks.WHITE_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.GRAY_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.BLACK_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.BROWN_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.RED_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.ORANGE_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.YELLOW_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.LIME_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.GREEN_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.CYAN_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.BLUE_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.PURPLE_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.MAGENTA_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.PINK_CONCRETE_WALL.get());

        //Terracotta
            //Slabs
            this.add(ModBlocks.WHITE_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.GRAY_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.BLACK_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.BROWN_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.RED_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.LIME_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.GREEN_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.CYAN_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.BLUE_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.PINK_TERRACOTTA_SLAB.get(), this::createSlabItemTable);

            //Stairs
            this.dropSelf(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.GRAY_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.BLACK_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.BROWN_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.RED_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.LIME_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.GREEN_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.CYAN_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.BLUE_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
            this.dropSelf(ModBlocks.PINK_TERRACOTTA_STAIRS.get());

            //Walls
            this.dropSelf(ModBlocks.WHITE_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.GRAY_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.BLACK_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.BROWN_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.RED_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.YELLOW_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.LIME_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.GREEN_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.CYAN_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.BLUE_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.PURPLE_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.MAGENTA_TERRACOTTA_WALL.get());
            this.dropSelf(ModBlocks.PINK_TERRACOTTA_WALL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

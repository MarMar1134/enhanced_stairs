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

        //Dripstone
        this.add(ModBlocks.DRIPSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DRIPSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.DRIPSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.DRIPSTONE_WALL.get());

        //Calcite
        this.add(ModBlocks.CALCITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CALCITE_SLAB.get()));
        this.dropSelf(ModBlocks.CALCITE_STAIRS.get());
        this.dropSelf(ModBlocks.CALCITE_WALL.get());

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
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

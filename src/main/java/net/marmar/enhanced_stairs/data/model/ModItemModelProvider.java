package net.marmar.enhanced_stairs.data.model;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.marmar.enhanced_stairs.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EnhancedStairs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Stone
        wallItem(ModBlocks.STONE_WALL, Blocks.STONE);

        //D,A,G
        wallItem(ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
        wallItem(ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
        wallItem(ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

        //Cut sandstone
        blockWithItem(ModBlocks.CUT_SANDSTONE_STAIRS);
        wallItem(ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);

        //Smooth sandstone
        wallItemWithoutParent(ModBlocks.SMOOTH_SANDSTONE_WALL, "sandstone_top");

        //Cut red sandstone
        blockWithItem(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
        wallItem(ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

        //Smooth red sandstone
        wallItemWithoutParent(ModBlocks.SMOOTH_RED_SANDSTONE_WALL, "red_sandstone_top");

        //Prismarine bricks
        wallItem(ModBlocks.PRISMARINE_BRICKS_WALL, Blocks.PRISMARINE_BRICKS);

        //Dark prismarine
        wallItem(ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);

        //Dripstone
        blockWithItem(ModBlocks.DRIPSTONE_SLAB);
        blockWithItem(ModBlocks.DRIPSTONE_STAIRS);
        wallItem(ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

        //Calcite
        blockWithItem(ModBlocks.CALCITE_SLAB);
        blockWithItem(ModBlocks.CALCITE_STAIRS);
        wallItem(ModBlocks.CALCITE_WALL, Blocks.CALCITE);

        //Smooth basalt
        blockWithItem(ModBlocks.SMOOTH_BASALT_SLAB);
        blockWithItem(ModBlocks.SMOOTH_BASALT_STAIRS);
        wallItem(ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);

        //Deepslate
        blockWithItem(ModBlocks.DEEPSLATE_SLAB);
        blockWithItem(ModBlocks.DEEPSLATE_STAIRS);
        wallItem(ModBlocks.DEEPSLATE_WALL, Blocks.DEEPSLATE);

        //Smooth stone
        blockWithItem(ModBlocks.SMOOTH_STONE_STAIRS);
        wallItem(ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

        //Netherrack
        blockWithItem(ModBlocks.NETHERRACK_SLAB);
        blockWithItem(ModBlocks.NETHERRACK_STAIRS);
        wallItem(ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

        //Quartz
        wallItemWithoutParent(ModBlocks.QUARTZ_BLOCK_WALL,"quartz_block_side");

        //Smooth quartz
        wallItemWithoutParent(ModBlocks.SMOOTH_QUARTZ_WALL, "quartz_block_bottom");

        //Quartz bricks
        blockWithItem(ModBlocks.QUARTZ_BRICKS_SLAB);
        blockWithItem(ModBlocks.QUARTZ_BRICKS_STAIRS);
        wallItem(ModBlocks.QUARTZ_BRICKS_WALL, Blocks.QUARTZ_BRICKS);

        //End stone
        blockWithItem(ModBlocks.END_STONE_SLAB);
        blockWithItem(ModBlocks.END_STONE_STAIRS);
        wallItem(ModBlocks.END_STONE_WALL, Blocks.END_STONE);

        //Purpur
        wallItem(ModBlocks.PURPUR_BLOCK_WALL, Blocks.PURPUR_BLOCK);

        //Concrete
            //Slabs
            blockWithItem(ModBlocks.WHITE_CONCRETE_SLAB);
            blockWithItem(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            blockWithItem(ModBlocks.GRAY_CONCRETE_SLAB);
            blockWithItem(ModBlocks.BLACK_CONCRETE_SLAB);
            blockWithItem(ModBlocks.BROWN_CONCRETE_SLAB);
            blockWithItem(ModBlocks.RED_CONCRETE_SLAB);
            blockWithItem(ModBlocks.ORANGE_CONCRETE_SLAB);
            blockWithItem(ModBlocks.YELLOW_CONCRETE_SLAB);
            blockWithItem(ModBlocks.LIME_CONCRETE_SLAB);
            blockWithItem(ModBlocks.GREEN_CONCRETE_SLAB);
            blockWithItem(ModBlocks.CYAN_CONCRETE_SLAB);
            blockWithItem(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            blockWithItem(ModBlocks.BLUE_CONCRETE_SLAB);
            blockWithItem(ModBlocks.PURPLE_CONCRETE_SLAB);
            blockWithItem(ModBlocks.MAGENTA_CONCRETE_SLAB);
            blockWithItem(ModBlocks.PINK_CONCRETE_SLAB);

            //Stairs
            blockWithItem(ModBlocks.WHITE_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.GRAY_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.BLACK_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.BROWN_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.RED_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.ORANGE_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.YELLOW_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.LIME_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.GREEN_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.CYAN_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.BLUE_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.PURPLE_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.MAGENTA_CONCRETE_STAIRS);
            blockWithItem(ModBlocks.PINK_CONCRETE_STAIRS);

            //Walls
            wallItem(ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
            wallItem(ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
            wallItem(ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
            wallItem(ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
            wallItem(ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
            wallItem(ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
            wallItem(ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
            wallItem(ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
            wallItem(ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
            wallItem(ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
            wallItem(ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
            wallItem(ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
            wallItem(ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
            wallItem(ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
            wallItem(ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
            wallItem(ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);

        //Terracotta
            //Slabs
            blockWithItem(ModBlocks.WHITE_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.GRAY_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.BLACK_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.BROWN_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.RED_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.ORANGE_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.YELLOW_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.LIME_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.GREEN_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.CYAN_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.BLUE_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.PURPLE_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
            blockWithItem(ModBlocks.PINK_TERRACOTTA_SLAB);

            //Stairs
            blockWithItem(ModBlocks.WHITE_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.GRAY_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.BLACK_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.BROWN_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.RED_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.LIME_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.GREEN_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.CYAN_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.BLUE_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
            blockWithItem(ModBlocks.PINK_TERRACOTTA_STAIRS);

            //Walls
            wallItem(ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);
            wallItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);
            wallItem(ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);
            wallItem(ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);
            wallItem(ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);
            wallItem(ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);
            wallItem(ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);
            wallItem(ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);
            wallItem(ModBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);
            wallItem(ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);
            wallItem(ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);
            wallItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);
            wallItem(ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);
            wallItem(ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);
            wallItem(ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);
            wallItem(ModBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);
    }

    public void blockWithItem(RegistryObject<Block> block) {
        this.withExistingParent(EnhancedStairs.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  modLoc("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  modLoc("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    public void wallItemWithoutParent(RegistryObject<Block> block, String parent){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  modLoc("block/" + parent));
    }
}

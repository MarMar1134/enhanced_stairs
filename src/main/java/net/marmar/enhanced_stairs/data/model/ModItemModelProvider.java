package net.marmar.enhanced_stairs.data.model;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.marmar.enhanced_stairs.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
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

        //Dripstone
        blockWithItem(ModBlocks.DRIPSTONE_SLAB);
        blockWithItem(ModBlocks.DRIPSTONE_STAIRS);
        wallItem(ModBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

        //Calcite
        blockWithItem(ModBlocks.CALCITE_SLAB);
        blockWithItem(ModBlocks.CALCITE_STAIRS);
        wallItem(ModBlocks.CALCITE_WALL, Blocks.CALCITE);

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
    }

    public void blockWithItem(RegistryObject<Block> block) {
        this.withExistingParent(EnhancedStairs.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(EnhancedStairs.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void wallItem(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(EnhancedStairs.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }
}

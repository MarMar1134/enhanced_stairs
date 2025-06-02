package net.marmar.enhanced_stairs.util;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.marmar.enhanced_stairs.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EnhancedStairs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VanillaTabs {
    public static void addStairsToVanilla(BuildCreativeModeTabContentsEvent event){
        if (event.getTabKey().equals(CreativeModeTabs.COLORED_BLOCKS)){
            //Concrete
            event.getEntries().putAfter(Items.WHITE_CONCRETE.getDefaultInstance(), ModBlocks.WHITE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.WHITE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.WHITE_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIGHT_GRAY_CONCRETE.getDefaultInstance(), ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.GRAY_CONCRETE.getDefaultInstance(), ModBlocks.GRAY_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GRAY_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.GRAY_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.BLACK_CONCRETE.getDefaultInstance(), ModBlocks.BLACK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BLACK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.BLACK_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.BROWN_CONCRETE.getDefaultInstance(), ModBlocks.BROWN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BROWN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.BROWN_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.RED_CONCRETE.getDefaultInstance(), ModBlocks.RED_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.RED_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.RED_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.ORANGE_CONCRETE.getDefaultInstance(), ModBlocks.ORANGE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.ORANGE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.ORANGE_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.YELLOW_CONCRETE.getDefaultInstance(), ModBlocks.YELLOW_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.YELLOW_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.YELLOW_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIME_CONCRETE.getDefaultInstance(), ModBlocks.LIME_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIME_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.LIME_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.GREEN_CONCRETE.getDefaultInstance(), ModBlocks.GREEN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GREEN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.GREEN_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.CYAN_CONCRETE.getDefaultInstance(), ModBlocks.CYAN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CYAN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.CYAN_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIGHT_BLUE_CONCRETE.getDefaultInstance(), ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.BLUE_CONCRETE.getDefaultInstance(), ModBlocks.BLUE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BLUE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.BLUE_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.PURPLE_CONCRETE.getDefaultInstance(), ModBlocks.PURPLE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PURPLE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.PURPLE_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.MAGENTA_CONCRETE.getDefaultInstance(), ModBlocks.MAGENTA_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.MAGENTA_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.MAGENTA_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.PINK_CONCRETE.getDefaultInstance(), ModBlocks.PINK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PINK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.PINK_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (event.getTabKey().equals(CreativeModeTabs.BUILDING_BLOCKS)){
            //Stone
            event.getEntries().putAfter(Items.STONE_SLAB.getDefaultInstance(), ModBlocks.STONE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //D, A, G
            event.getEntries().putAfter(Items.POLISHED_DIORITE_SLAB.getDefaultInstance(), ModBlocks.POLISHED_DIORITE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.POLISHED_ANDESITE_SLAB.getDefaultInstance(), ModBlocks.POLISHED_ANDESITE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.POLISHED_GRANITE_SLAB.getDefaultInstance(), ModBlocks.POLISHED_GRANITE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Dripstone
            event.getEntries().putAfter(Items.DRIPSTONE_BLOCK.getDefaultInstance(), ModBlocks.DRIPSTONE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.DRIPSTONE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.DRIPSTONE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.DRIPSTONE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.DRIPSTONE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Calcite
            event.getEntries().putAfter(Items.CALCITE.getDefaultInstance(), ModBlocks.CALCITE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CALCITE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.CALCITE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CALCITE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.CALCITE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}

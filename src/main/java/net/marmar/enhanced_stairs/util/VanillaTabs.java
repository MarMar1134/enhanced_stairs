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
            event.getEntries().putAfter(ModBlocks.WHITE_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.WHITE_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIGHT_GRAY_CONCRETE.getDefaultInstance(), ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.GRAY_CONCRETE.getDefaultInstance(), ModBlocks.GRAY_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GRAY_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.GRAY_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GRAY_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.GRAY_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.BLACK_CONCRETE.getDefaultInstance(), ModBlocks.BLACK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BLACK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.BLACK_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BLACK_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.BLACK_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.BROWN_CONCRETE.getDefaultInstance(), ModBlocks.BROWN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BROWN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.BROWN_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BROWN_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.BROWN_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.RED_CONCRETE.getDefaultInstance(), ModBlocks.RED_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.RED_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.RED_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.RED_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.RED_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.ORANGE_CONCRETE.getDefaultInstance(), ModBlocks.ORANGE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.ORANGE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.ORANGE_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.ORANGE_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.ORANGE_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.YELLOW_CONCRETE.getDefaultInstance(), ModBlocks.YELLOW_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.YELLOW_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.YELLOW_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.YELLOW_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.YELLOW_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIME_CONCRETE.getDefaultInstance(), ModBlocks.LIME_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIME_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.LIME_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIME_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.LIME_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.GREEN_CONCRETE.getDefaultInstance(), ModBlocks.GREEN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GREEN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.GREEN_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GREEN_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.GREEN_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.CYAN_CONCRETE.getDefaultInstance(), ModBlocks.CYAN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CYAN_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.CYAN_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CYAN_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.CYAN_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIGHT_BLUE_CONCRETE.getDefaultInstance(), ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.BLUE_CONCRETE.getDefaultInstance(), ModBlocks.BLUE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BLUE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.BLUE_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BLUE_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.BLUE_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.PURPLE_CONCRETE.getDefaultInstance(), ModBlocks.PURPLE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PURPLE_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.PURPLE_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PURPLE_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.PURPLE_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.MAGENTA_CONCRETE.getDefaultInstance(), ModBlocks.MAGENTA_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.MAGENTA_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.MAGENTA_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.MAGENTA_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.MAGENTA_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.PINK_CONCRETE.getDefaultInstance(), ModBlocks.PINK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PINK_CONCRETE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.PINK_CONCRETE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PINK_CONCRETE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.PINK_CONCRETE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Terracotta
            event.getEntries().putAfter(Items.WHITE_TERRACOTTA.getDefaultInstance(), ModBlocks.WHITE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.WHITE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.WHITE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.WHITE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.WHITE_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIGHT_GRAY_TERRACOTTA.getDefaultInstance(), ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.GRAY_TERRACOTTA.getDefaultInstance(), ModBlocks.GRAY_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GRAY_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.GRAY_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GRAY_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.GRAY_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.BLACK_TERRACOTTA.getDefaultInstance(), ModBlocks.BLACK_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BLACK_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.BLACK_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BLACK_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.BLACK_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.BROWN_TERRACOTTA.getDefaultInstance(), ModBlocks.BROWN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BROWN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.BROWN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BROWN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.BROWN_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.RED_TERRACOTTA.getDefaultInstance(), ModBlocks.RED_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.RED_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.RED_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.RED_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.RED_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.ORANGE_TERRACOTTA.getDefaultInstance(), ModBlocks.ORANGE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.ORANGE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.ORANGE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.ORANGE_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.YELLOW_TERRACOTTA.getDefaultInstance(), ModBlocks.YELLOW_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.YELLOW_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.YELLOW_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.YELLOW_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIME_TERRACOTTA.getDefaultInstance(), ModBlocks.LIME_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIME_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.LIME_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIME_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.LIME_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.GREEN_TERRACOTTA.getDefaultInstance(), ModBlocks.GREEN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GREEN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.GREEN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.GREEN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.GREEN_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.CYAN_TERRACOTTA.getDefaultInstance(), ModBlocks.CYAN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CYAN_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.CYAN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CYAN_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.CYAN_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.LIGHT_BLUE_TERRACOTTA.getDefaultInstance(), ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.BLUE_TERRACOTTA.getDefaultInstance(), ModBlocks.BLUE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BLUE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.BLUE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.BLUE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.BLUE_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.PURPLE_TERRACOTTA.getDefaultInstance(), ModBlocks.PURPLE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.PURPLE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PURPLE_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.PURPLE_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.MAGENTA_TERRACOTTA.getDefaultInstance(), ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.MAGENTA_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.MAGENTA_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(Items.PINK_TERRACOTTA.getDefaultInstance(), ModBlocks.PINK_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PINK_TERRACOTTA_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.PINK_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.PINK_TERRACOTTA_SLAB.get().asItem().getDefaultInstance(), ModBlocks.PINK_TERRACOTTA_WALL.get().asItem().getDefaultInstance(),
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

            //Cut sandstone
            event.getEntries().putAfter(Items.CUT_SANDSTONE.getDefaultInstance(), ModBlocks.CUT_SANDSTONE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CUT_SANDSTONE_STAIRS.get().asItem().getDefaultInstance(), Items.CUT_STANDSTONE_SLAB.getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.CUT_STANDSTONE_SLAB.asItem().getDefaultInstance(), ModBlocks.CUT_SANDSTONE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Smooth sandstone
            event.getEntries().putAfter(Items.SMOOTH_SANDSTONE_SLAB.getDefaultInstance(), ModBlocks.SMOOTH_SANDSTONE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Cut red sandstone
            event.getEntries().putAfter(Items.CUT_RED_SANDSTONE.getDefaultInstance(), ModBlocks.CUT_RED_SANDSTONE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.CUT_RED_SANDSTONE_STAIRS.get().asItem().getDefaultInstance(), Items.CUT_RED_SANDSTONE_SLAB.getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.CUT_RED_SANDSTONE_SLAB.asItem().getDefaultInstance(), ModBlocks.CUT_RED_SANDSTONE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Smooth red sandstone
            event.getEntries().putAfter(Items.SMOOTH_RED_SANDSTONE_SLAB.getDefaultInstance(), ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Prismarine bricks
            event.getEntries().putAfter(Items.PRISMARINE_BRICK_SLAB.getDefaultInstance(), ModBlocks.PRISMARINE_BRICKS_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Dark prismarine
            event.getEntries().putAfter(Items.DARK_PRISMARINE_SLAB.getDefaultInstance(), ModBlocks.DARK_PRISMARINE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Deepslate
            event.getEntries().putAfter(Items.DEEPSLATE.getDefaultInstance(), ModBlocks.DEEPSLATE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.DEEPSLATE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.DEEPSLATE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.DEEPSLATE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.DEEPSLATE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Smooth basalt
            event.getEntries().putAfter(Items.SMOOTH_BASALT.getDefaultInstance(), ModBlocks.SMOOTH_BASALT_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.SMOOTH_BASALT_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.SMOOTH_BASALT_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.SMOOTH_BASALT_SLAB.get().asItem().getDefaultInstance(), ModBlocks.SMOOTH_BASALT_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Smooth stone
            event.getEntries().putAfter(Items.SMOOTH_STONE.getDefaultInstance(), ModBlocks.SMOOTH_STONE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.SMOOTH_STONE_SLAB.getDefaultInstance(), ModBlocks.SMOOTH_STONE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Quartz
            event.getEntries().putAfter(Items.QUARTZ_SLAB.asItem().getDefaultInstance(), ModBlocks.QUARTZ_BLOCK_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Smooth quartz
            event.getEntries().putAfter(Items.SMOOTH_QUARTZ_SLAB.asItem().getDefaultInstance(), ModBlocks.SMOOTH_QUARTZ_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Quartz bricks
            event.getEntries().putAfter(Items.QUARTZ_BRICKS.getDefaultInstance(), ModBlocks.QUARTZ_BRICKS_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.QUARTZ_BRICKS_SLAB.get().asItem().getDefaultInstance(), ModBlocks.QUARTZ_BRICKS_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //End stone
            event.getEntries().putAfter(Items.END_STONE.getDefaultInstance(), ModBlocks.END_STONE_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.END_STONE_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.END_STONE_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.END_STONE_SLAB.get().asItem().getDefaultInstance(), ModBlocks.END_STONE_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //Purpur
            event.getEntries().putAfter(Items.PURPUR_BLOCK.getDefaultInstance(), ModBlocks.PURPUR_BLOCK_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (event.getTabKey().equals(CreativeModeTabs.NATURAL_BLOCKS)){
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

            //Smooth basalt
            event.getEntries().putAfter(Items.SMOOTH_BASALT.getDefaultInstance(), ModBlocks.SMOOTH_BASALT_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.SMOOTH_BASALT_STAIRS.get().asItem().getDefaultInstance(), ModBlocks.SMOOTH_BASALT_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ModBlocks.SMOOTH_BASALT_SLAB.get().asItem().getDefaultInstance(), ModBlocks.SMOOTH_BASALT_WALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}

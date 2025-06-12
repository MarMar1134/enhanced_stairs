package net.marmar.enhanced_stairs.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static TagKey<Block> NEEDS_STEEL_TOOL = ep2Tag("needs_steel_tool");

        private static TagKey<Block> ep2Tag(String pTag){
            return BlockTags.create(new ResourceLocation("enhanced_playthrough", pTag));
        }
    }
}

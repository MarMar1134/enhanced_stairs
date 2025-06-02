package net.marmar.enhanced_stairs;

import net.marmar.enhanced_stairs.block.ModBlocks;
import net.marmar.enhanced_stairs.util.VanillaTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EnhancedStairs.MOD_ID)
public class EnhancedStairs {
    public static final String MOD_ID = "enhanced_stairs";

    public EnhancedStairs(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        ModList modList = ModList.get();

        ModBlocks.register(modEventBus);

        if (!modList.isLoaded("enhanced_playthrough")){
            modEventBus.addListener(VanillaTabs::addStairsToVanilla);
        }

        MinecraftForge.EVENT_BUS.register(this);
    }
}

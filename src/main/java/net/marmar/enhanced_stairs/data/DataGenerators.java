package net.marmar.enhanced_stairs.data;

import net.marmar.enhanced_stairs.EnhancedStairs;
import net.marmar.enhanced_stairs.data.lang.EnglishLangProvider;
import net.marmar.enhanced_stairs.data.lang.SpanishLangProvider;
import net.marmar.enhanced_stairs.data.loot.ModLootTableProvider;
import net.marmar.enhanced_stairs.data.model.ModBlockStateProvider;
import net.marmar.enhanced_stairs.data.model.ModItemModelProvider;
import net.marmar.enhanced_stairs.data.recipe.ModRecipeProvider;
import net.marmar.enhanced_stairs.data.tag.ModBlockTagGenerator;
import net.marmar.enhanced_stairs.data.tag.ModItemTagGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid= EnhancedStairs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        //Generators
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> LookupProvider = event.getLookupProvider();

        //Loot tables
        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput));

        //Recipes
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));

        //Tags
        ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(), new ModBlockTagGenerator(packOutput, LookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, LookupProvider, blockTagGenerator.contentsGetter(),
                existingFileHelper));

        //Models
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));

        //Language
        generator.addProvider(event.includeClient(), new EnglishLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_ar"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_cl"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_ec"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_mx"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_es"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_uy"));
        generator.addProvider(event.includeClient(), new SpanishLangProvider(packOutput, "es_ve"));
    }
}

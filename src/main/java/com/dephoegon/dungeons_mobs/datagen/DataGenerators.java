package com.dephoegon.dungeons_mobs.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        //generator.addProvider(event.includeClient(), new ModLanguageProvider(generator, "en_us"));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, event.getExistingFileHelper()));
        ModBlockTagsProvider modBlockTagsProvider = new ModBlockTagsProvider(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), modBlockTagsProvider);
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(generator, modBlockTagsProvider, event.getExistingFileHelper()));
        generator.addProvider(event.includeServer(), new ModAdvancementProvider(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeServer(), new ModEntityTypeTagsProvider(generator, event.getExistingFileHelper()));
    }
}
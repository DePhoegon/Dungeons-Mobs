package com.dephoegon.dungeons_mobs.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.dephoegon.dungeons_mobs.DungeonsMobs.MODID;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
    }
}

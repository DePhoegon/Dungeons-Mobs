package com.dephoegon.dungeons_mobs.mod;

import com.infamous.dungeons_mobs.items.shield.CustomShieldRecipes;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dephoegon.dungeons_mobs.DungeonsMobs.MODID;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPES = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MODID);

    public static final RegistryObject<RecipeSerializer<?>> SHIELD_RECIPE = RECIPES.register("shield_decoration",
            () -> CustomShieldRecipes.SERIALIZER);
}

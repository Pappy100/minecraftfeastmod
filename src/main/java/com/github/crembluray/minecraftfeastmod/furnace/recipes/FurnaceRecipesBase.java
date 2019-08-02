package com.github.crembluray.minecraftfeastmod.furnace.recipes;

import com.github.crembluray.minecraftfeastmod.init.ModFurnaceRecipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipesBase {

    private static Item input;
    private static ItemStack output;
    private static float xp;

    public FurnaceRecipesBase(Item input, ItemStack output, float xp) {
        this.input = input;
        this.output = output;
        this.xp = xp;

        ModFurnaceRecipes.RECIPES.add(this);
    }

    public static void addRecipe() {
        GameRegistry.addSmelting(input, output, xp);
    }

}

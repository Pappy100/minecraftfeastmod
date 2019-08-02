package com.github.crembluray.minecraftfeastmod.furnace.recipes;

import com.github.crembluray.minecraftfeastmod.init.ModFurnaceRecipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipesBase {

    private Item input;
    private ItemStack output;
    private float xp;

    public FurnaceRecipesBase(Item input, ItemStack output, float xp) {
        this.input = input;
        this.output = output;
        this.xp = xp;

        ModFurnaceRecipes.RECIPES.add(this);
    }

    public void addRecipe() {
        GameRegistry.addSmelting(input, output, xp);
    }

}

package com.github.crembluray.minecraftfeastmod.init;

import com.github.crembluray.minecraftfeastmod.furnace.recipes.FurnaceRecipesBase;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ModFurnaceRecipes {

    public static final List<FurnaceRecipesBase> RECIPES = new ArrayList<FurnaceRecipesBase>();

    public static final FurnaceRecipesBase BREAD_ROLL = new FurnaceRecipesBase(ModItems.DOUGH, new ItemStack(ModItems.BREAD_ROLL), 0.5f);
    public static final FurnaceRecipesBase BACON = new FurnaceRecipesBase(ModItems.RAW_BACON, new ItemStack(ModItems.COOKED_BACON), 0.8f);

}

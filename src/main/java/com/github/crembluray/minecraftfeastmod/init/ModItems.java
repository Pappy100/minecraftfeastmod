package com.github.crembluray.minecraftfeastmod.init;

import com.github.crembluray.minecraftfeastmod.items.ItemBase;
import com.github.crembluray.minecraftfeastmod.items.ItemCustomFood;
import com.github.crembluray.minecraftfeastmod.items.ItemEffectFood;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Food
    public static final ItemCustomFood BREAD_ROLL = new ItemCustomFood("bread_roll", 3, 0.3f, false);
    public static final ItemEffectFood DOUGH = new ItemEffectFood("dough", 1, 15, 0.3f, false);
    public static final ItemEffectFood RAW_TURKEY = new ItemEffectFood("raw_turkey", 2, 30, 0.3f, false);
    public static final ItemCustomFood BURGER = new ItemCustomFood("burger", 8, 0.8f, false);
    public static final ItemCustomFood COOKED_BACON = new ItemCustomFood("cooked_bacon", 5, 0.7f, false);
    public static final ItemCustomFood CORN = new ItemCustomFood("corn", 8, 0.8f, false);
    public static final ItemCustomFood PANCAKES = new ItemCustomFood("pancakes", 8, 0.8f, false);
    public static final ItemEffectFood RAW_BACON = new ItemEffectFood("raw_bacon", 1, 15, 0.1f, false);
    public static final ItemCustomFood TACO = new ItemCustomFood("taco", 4, 0.8f, false);

    // Non-edible foodstuffs
    public static final Item YEAST = new ItemBase("yeast", CreativeTabs.FOOD);
    public static final Item FLOUR = new ItemBase("flour", CreativeTabs.FOOD);

}

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
    public static final Item BREAD_ROLL = new ItemCustomFood("bread_roll", 3, 0.3f, false);
    public static final ItemEffectFood DOUGH = new ItemEffectFood("dough", 1, 15, 0.3f, false);
    public static final ItemEffectFood RAW_TURKEY = new ItemEffectFood("raw_turkey", 2, 30, 0.3f, false);
    public static final ItemCustomFood BURGER = new ItemCustomFood("burger", 8, 0.8f, false);

    // Non-edible foodstuffs
    public static final Item YEAST = new ItemBase("yeast", CreativeTabs.FOOD);
    public static final Item FLOUR = new ItemBase("flour", CreativeTabs.FOOD);

}

package com.github.crembluray.minecraftfeastmod.init;

import com.github.crembluray.minecraftfeastmod.items.ItemBase;
import com.github.crembluray.minecraftfeastmod.items.ItemCustomFood;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item BREAD_ROLL = new ItemCustomFood("bread_roll", 3, 0.3f, false);
    public static final Item YEAST = new ItemBase("yeast", CreativeTabs.FOOD);
    public static final Item DOUGH = new ItemBase("dough", CreativeTabs.FOOD);
    public static final Item FLOUR = new ItemBase("flour", CreativeTabs.FOOD);

}

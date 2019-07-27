package com.github.crembluray.minecraftfeastmod.init;

import com.github.crembluray.minecraftfeastmod.items.ItemCustomFood;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item BREAD_ROLL = new ItemCustomFood("bread_roll", 3, 0.3f, false);

}

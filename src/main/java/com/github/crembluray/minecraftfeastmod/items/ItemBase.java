package com.github.crembluray.minecraftfeastmod.items;

import com.github.crembluray.minecraftfeastmod.Main;
import com.github.crembluray.minecraftfeastmod.init.ModItems;
import com.github.crembluray.minecraftfeastmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}

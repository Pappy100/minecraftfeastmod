package com.github.crembluray.minecraftfeastmod.blocks;

import com.github.crembluray.minecraftfeastmod.Main;
import com.github.crembluray.minecraftfeastmod.init.ModBlocks;
import com.github.crembluray.minecraftfeastmod.init.ModItems;
import com.github.crembluray.minecraftfeastmod.util.IHasModel;
import net.minecraft.block.BlockCake;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockCustomCake extends BlockCake implements IHasModel {

    public BlockCustomCake(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}

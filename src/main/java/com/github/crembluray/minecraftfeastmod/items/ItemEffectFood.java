package com.github.crembluray.minecraftfeastmod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEffectFood extends ItemCustomFood {

    private static int duration;

    public ItemEffectFood(String name, int amount, int duration, float saturation, boolean isWolfFood) {
        super(name, amount, saturation, isWolfFood);
        this.duration = duration;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if(!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, duration*20, 5, false, true));
        }
    }
}

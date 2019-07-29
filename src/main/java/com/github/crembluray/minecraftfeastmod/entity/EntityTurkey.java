package com.github.crembluray.minecraftfeastmod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityTurkey extends EntityChicken {

    public EntityTurkey(World worldIn) {
        super(worldIn);
    }

    @Override
    public EntityChicken createChild(EntityAgeable ageable) {
        return new EntityTurkey(world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return super.getHurtSound(source);
    }
}

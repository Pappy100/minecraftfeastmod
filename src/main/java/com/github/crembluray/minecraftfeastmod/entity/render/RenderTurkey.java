package com.github.crembluray.minecraftfeastmod.entity.render;

import com.github.crembluray.minecraftfeastmod.entity.EntityTurkey;
import com.github.crembluray.minecraftfeastmod.entity.model.ModelTurkey;
import com.github.crembluray.minecraftfeastmod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderTurkey extends RenderLiving<EntityTurkey> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/turkey.png");

    public RenderTurkey(RenderManager manager) {
        super(manager, new ModelTurkey(), 0.5f);

    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityTurkey entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityTurkey entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}

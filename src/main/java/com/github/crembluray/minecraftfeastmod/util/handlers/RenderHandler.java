package com.github.crembluray.minecraftfeastmod.util.handlers;

import com.github.crembluray.minecraftfeastmod.entity.EntityTurkey;
import com.github.crembluray.minecraftfeastmod.entity.render.RenderTurkey;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityTurkey.class, new IRenderFactory<EntityTurkey>() {
            @Override
            public Render<? super EntityTurkey> createRenderFor(RenderManager manager) {
                return new RenderTurkey(manager);
            }
        });
    }
}

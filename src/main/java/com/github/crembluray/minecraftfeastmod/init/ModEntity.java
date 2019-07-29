package com.github.crembluray.minecraftfeastmod.init;

import com.github.crembluray.minecraftfeastmod.Main;
import com.github.crembluray.minecraftfeastmod.entity.EntityTurkey;
import com.github.crembluray.minecraftfeastmod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity {

    public static void registerEntities() {
        registerEntity("turkey", EntityTurkey.class, Reference.ENTITY_TURKEY, 50, 6824722, 000000);
    }

    public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }
}

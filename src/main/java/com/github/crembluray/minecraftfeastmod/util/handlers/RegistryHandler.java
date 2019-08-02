package com.github.crembluray.minecraftfeastmod.util.handlers;

import com.github.crembluray.minecraftfeastmod.furnace.recipes.FurnaceRecipesBase;
import com.github.crembluray.minecraftfeastmod.init.ModBlocks;
import com.github.crembluray.minecraftfeastmod.init.ModEntity;
import com.github.crembluray.minecraftfeastmod.init.ModFurnaceRecipes;
import com.github.crembluray.minecraftfeastmod.init.ModItems;
import com.github.crembluray.minecraftfeastmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item item : ModItems.ITEMS) {
            if(item instanceof IHasModel) {
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : ModBlocks.BLOCKS) {
            if(block instanceof IHasModel) {
                ((IHasModel)block).registerModels();
            }
        }
    }


    public static void preInitRegistries(FMLPreInitializationEvent event) {
        try {
            ModEntity.registerEntities();
            RenderHandler.registerEntityRenderers();
        }
        catch(NoClassDefFoundError e) {
            System.out.println(e);
        }
        for(FurnaceRecipesBase FRP : ModFurnaceRecipes.RECIPES) {
            FRP.addRecipe();
        }
    }

}

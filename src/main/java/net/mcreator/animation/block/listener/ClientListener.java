package net.mcreator.animation.block.listener;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.animation.block.renderer.ChestTileRenderer;
import net.mcreator.animation.block.registry.TileRegistry;
import net.mcreator.animation.block.registry.DisplayRegistry;
import net.mcreator.animation.AnimationMod;

@Mod.EventBusSubscriber(modid = AnimationMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {
	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(TileRegistry.CHEST.get(), ChestTileRenderer::new);
	}

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			TileRegistry.TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
			DisplayRegistry.DISPLAY.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}
}

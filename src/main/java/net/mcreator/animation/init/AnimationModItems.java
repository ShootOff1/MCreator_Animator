
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animation.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.animation.item.LightsaberItem;
import net.mcreator.animation.AnimationMod;

public class AnimationModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnimationMod.MODID);
	public static final RegistryObject<Item> CHEST = block(AnimationModBlocks.CHEST, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> LIGHTSABER = REGISTRY.register("lightsaber", () -> new LightsaberItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

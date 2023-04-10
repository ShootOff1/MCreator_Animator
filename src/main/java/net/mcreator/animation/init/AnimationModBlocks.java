
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animation.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.animation.block.ChestBlock;
import net.mcreator.animation.AnimationMod;

public class AnimationModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AnimationMod.MODID);
	public static final RegistryObject<Block> CHEST = REGISTRY.register("chest", () -> new ChestBlock());
}

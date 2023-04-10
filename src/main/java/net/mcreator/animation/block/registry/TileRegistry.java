package net.mcreator.animation.block.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.animation.init.AnimationModBlocks;
import net.mcreator.animation.block.entity.ChestTileEntity;
import net.mcreator.animation.AnimationMod;

public class TileRegistry {
	public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, AnimationMod.MODID);
	public static final RegistryObject<BlockEntityType<ChestTileEntity>> CHEST = TILES.register("chest_block",
			() -> BlockEntityType.Builder.of(ChestTileEntity::new, AnimationModBlocks.CHEST.get()).build(null));
}

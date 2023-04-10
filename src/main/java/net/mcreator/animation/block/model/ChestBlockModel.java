package net.mcreator.animation.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.animation.block.entity.ChestTileEntity;

public class ChestBlockModel extends AnimatedGeoModel<ChestTileEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ChestTileEntity animatable) {
		return new ResourceLocation("animation", "animations/chest.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ChestTileEntity animatable) {
		return new ResourceLocation("animation", "geo/chest.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ChestTileEntity entity) {
		return new ResourceLocation("animation", "textures/blocks/chest.png");
	}
}

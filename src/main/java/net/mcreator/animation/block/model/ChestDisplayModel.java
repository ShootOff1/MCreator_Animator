package net.mcreator.animation.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.animation.block.display.ChestDisplayItem;

public class ChestDisplayModel extends AnimatedGeoModel<ChestDisplayItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(ChestDisplayItem animatable) {
		return new ResourceLocation("animation", "animations/chest.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ChestDisplayItem animatable) {
		return new ResourceLocation("animation", "geo/chest.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ChestDisplayItem entity) {
		return new ResourceLocation("animation", "textures/blocks/chest.png");
	}
}

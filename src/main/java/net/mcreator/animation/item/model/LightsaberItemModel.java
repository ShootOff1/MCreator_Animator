package net.mcreator.animation.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.animation.item.LightsaberItem;

public class LightsaberItemModel extends AnimatedGeoModel<LightsaberItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(LightsaberItem animatable) {
		return new ResourceLocation("animation", "animations/light_saber.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(LightsaberItem animatable) {
		return new ResourceLocation("animation", "geo/light_saber.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LightsaberItem animatable) {
		return new ResourceLocation("animation", "textures/items/light_saber.png");
	}
}

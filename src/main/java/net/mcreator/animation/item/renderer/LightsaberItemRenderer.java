package net.mcreator.animation.item.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.animation.item.model.LightsaberItemModel;
import net.mcreator.animation.item.LightsaberItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LightsaberItemRenderer extends GeoItemRenderer<LightsaberItem> {
	public LightsaberItemRenderer() {
		super(new LightsaberItemModel());
	}

	@Override
	public RenderType getRenderType(LightsaberItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource,
			VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

package net.mcreator.animation.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.animation.block.model.ChestDisplayModel;
import net.mcreator.animation.block.display.ChestDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChestDisplayItemRenderer extends GeoItemRenderer<ChestDisplayItem> {
	public ChestDisplayItemRenderer() {
		super(new ChestDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChestDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource,
			VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

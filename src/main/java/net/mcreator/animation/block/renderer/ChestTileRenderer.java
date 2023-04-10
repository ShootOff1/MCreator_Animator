package net.mcreator.animation.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.animation.block.model.ChestBlockModel;
import net.mcreator.animation.block.entity.ChestTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChestTileRenderer extends GeoBlockRenderer<ChestTileEntity> {
	public ChestTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new ChestBlockModel());
	}

	@Override
	public RenderType getRenderType(ChestTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource,
			VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

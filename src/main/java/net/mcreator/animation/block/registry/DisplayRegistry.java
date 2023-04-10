package net.mcreator.animation.block.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.animation.init.AnimationModBlocks;
import net.mcreator.animation.block.display.ChestDisplayItem;
import net.mcreator.animation.AnimationMod;

public class DisplayRegistry {
	public static final DeferredRegister<Item> DISPLAY = DeferredRegister.create(ForgeRegistries.ITEMS, AnimationMod.MODID);
	public static final RegistryObject<Item> CHEST_ITEM = DISPLAY.register("chest_item",
			() -> new ChestDisplayItem(AnimationModBlocks.CHEST.get(), new Item.Properties().tab(null)));
}

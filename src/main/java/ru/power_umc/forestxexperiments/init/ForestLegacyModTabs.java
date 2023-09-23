
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxexperiments.init;

import ru.power_umc.forestxexperiments.ForestLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ForestLegacyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForestLegacyMod.MODID);
	public static final RegistryObject<CreativeModeTab> BURNED_FOREST_CATEGORY = REGISTRY.register("burned_forest_category",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.forest_legacy.burned_forest_category")).icon(() -> new ItemStack(ForestLegacyModBlocks.BURNED_LOG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ForestLegacyModBlocks.ASH_BLOCK.get().asItem());
				tabData.accept(ForestLegacyModBlocks.BURNED_LOG.get().asItem());
				tabData.accept(ForestLegacyModBlocks.BURNED_PLANKS.get().asItem());
				tabData.accept(ForestLegacyModBlocks.BURNED_LEAVES.get().asItem());
				tabData.accept(ForestLegacyModItems.ASHENCOW_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SALT_CATEGORY = REGISTRY.register("salt_category",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.forest_legacy.salt_category")).icon(() -> new ItemStack(ForestLegacyModItems.SALT_DUST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ForestLegacyModBlocks.ROCK_SALT.get().asItem());
				tabData.accept(ForestLegacyModBlocks.SALT_BLOCK.get().asItem());
				tabData.accept(ForestLegacyModItems.SALT_DUST.get());
				tabData.accept(ForestLegacyModItems.SALT_COD.get());
				tabData.accept(ForestLegacyModItems.SALT_SAMLON.get());
				tabData.accept(ForestLegacyModItems.SALT_TROPICAL_FISH.get());
				tabData.accept(ForestLegacyModItems.SALT_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DESERT_CATEGORY = REGISTRY.register("desert_category",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.forest_legacy.desert_category")).icon(() -> new ItemStack(ForestLegacyModItems.QUICKSAND_BUCKET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ForestLegacyModItems.MUSIC_DISC_EGYPT.get());
				tabData.accept(ForestLegacyModItems.MUMMY_SPAWN_EGG.get());
				tabData.accept(ForestLegacyModItems.QUICKSAND_BUCKET.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> CRYSTAL_CATEGORY = REGISTRY.register("crystal_category",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.forest_legacy.crystal_category")).icon(() -> new ItemStack(ForestLegacyModItems.CRYSTAL_DUST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ForestLegacyModItems.CRYSTAL_DUST.get());
				tabData.accept(ForestLegacyModBlocks.UNDERGROUND_CRYSTAL.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DECORATIVE_CATEGORY = REGISTRY.register("decorative_category",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.forest_legacy.decorative_category")).icon(() -> new ItemStack(ForestLegacyModBlocks.WINDOW_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ForestLegacyModBlocks.WINDOW_BLOCK.get().asItem());
				tabData.accept(ForestLegacyModBlocks.BLACK_WINDOWS_BLOCK.get().asItem());
			})

					.build());
}

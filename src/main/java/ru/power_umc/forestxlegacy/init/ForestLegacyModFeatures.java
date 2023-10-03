
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxlegacy.init;

import ru.power_umc.forestxlegacy.world.features.PearTreeFeature;
import ru.power_umc.forestxlegacy.world.features.PeachTreeFeature;
import ru.power_umc.forestxlegacy.world.features.LemonTreeFeature;
import ru.power_umc.forestxlegacy.world.features.CherryTreeFeature;
import ru.power_umc.forestxlegacy.ForestLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class ForestLegacyModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForestLegacyMod.MODID);
	public static final RegistryObject<Feature<?>> CHERRY_TREE = REGISTRY.register("cherry_tree", CherryTreeFeature::new);
	public static final RegistryObject<Feature<?>> PEAR_TREE = REGISTRY.register("pear_tree", PearTreeFeature::new);
	public static final RegistryObject<Feature<?>> PEACH_TREE = REGISTRY.register("peach_tree", PeachTreeFeature::new);
	public static final RegistryObject<Feature<?>> LEMON_TREE = REGISTRY.register("lemon_tree", LemonTreeFeature::new);
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxexperiments.init;

import ru.power_umc.forestxexperiments.world.features.plants.Cranberrybush1Feature;
import ru.power_umc.forestxexperiments.world.features.plants.Blackberrybush1Feature;
import ru.power_umc.forestxexperiments.world.features.ores.UndergroundCrystalFeature;
import ru.power_umc.forestxexperiments.world.features.ores.SaltOreFeature;
import ru.power_umc.forestxexperiments.world.features.QuicksandFeatureFeature;
import ru.power_umc.forestxexperiments.world.features.PearTreeFeature;
import ru.power_umc.forestxexperiments.world.features.PeachTreeFeature;
import ru.power_umc.forestxexperiments.world.features.LemonTreeFeature;
import ru.power_umc.forestxexperiments.world.features.CherryTreeFeature;
import ru.power_umc.forestxexperiments.ForestLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class ForestLegacyModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForestLegacyMod.MODID);
	public static final RegistryObject<Feature<?>> ROCK_SALT = REGISTRY.register("rock_salt", SaltOreFeature::new);
	public static final RegistryObject<Feature<?>> BLACKBERRYBUSH_1 = REGISTRY.register("blackberrybush_1", Blackberrybush1Feature::new);
	public static final RegistryObject<Feature<?>> CRANBERRYBUSH_1 = REGISTRY.register("cranberrybush_1", Cranberrybush1Feature::new);
	public static final RegistryObject<Feature<?>> UNDERGROUND_CRYSTAL = REGISTRY.register("underground_crystal", UndergroundCrystalFeature::new);
	public static final RegistryObject<Feature<?>> CHERRY_TREE = REGISTRY.register("cherry_tree", CherryTreeFeature::new);
	public static final RegistryObject<Feature<?>> PEAR_TREE = REGISTRY.register("pear_tree", PearTreeFeature::new);
	public static final RegistryObject<Feature<?>> PEACH_TREE = REGISTRY.register("peach_tree", PeachTreeFeature::new);
	public static final RegistryObject<Feature<?>> LEMON_TREE = REGISTRY.register("lemon_tree", LemonTreeFeature::new);
	public static final RegistryObject<Feature<?>> QUICKSAND_FEATURE = REGISTRY.register("quicksand_feature", QuicksandFeatureFeature::new);
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxexperiments.init;

import ru.power_umc.forestxexperiments.ForestLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class ForestLegacyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ForestLegacyMod.MODID);
	public static final RegistryObject<SoundEvent> RECORD_EGYPT = REGISTRY.register("record.egypt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest_legacy", "record.egypt")));
	public static final RegistryObject<SoundEvent> MUMMY_AMBIENT = REGISTRY.register("mummy.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest_legacy", "mummy.ambient")));
	public static final RegistryObject<SoundEvent> MUMMY_STEP = REGISTRY.register("mummy.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest_legacy", "mummy.step")));
	public static final RegistryObject<SoundEvent> MUMMY_HURT = REGISTRY.register("mummy.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest_legacy", "mummy.hurt")));
	public static final RegistryObject<SoundEvent> MUMMY_DEATH = REGISTRY.register("mummy.death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest_legacy", "mummy.death")));
}

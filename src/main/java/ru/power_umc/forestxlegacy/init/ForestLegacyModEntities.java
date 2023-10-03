
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxlegacy.init;

import ru.power_umc.forestxlegacy.entity.MummyEntity;
import ru.power_umc.forestxlegacy.entity.AshencowEntity;
import ru.power_umc.forestxlegacy.ForestLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForestLegacyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ForestLegacyMod.MODID);
	public static final RegistryObject<EntityType<AshencowEntity>> ASHENCOW = register("ashencow",
			EntityType.Builder.<AshencowEntity>of(AshencowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AshencowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<MummyEntity>> MUMMY = register("mummy",
			EntityType.Builder.<MummyEntity>of(MummyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MummyEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AshencowEntity.init();
			MummyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ASHENCOW.get(), AshencowEntity.createAttributes().build());
		event.put(MUMMY.get(), MummyEntity.createAttributes().build());
	}
}

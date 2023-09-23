
package ru.power_umc.forestxexperiments.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscEgyptItem extends RecordItem {
	public MusicDiscEgyptItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forest_legacy:record.egypt")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 0);
	}
}


package ru.power_umc.forestxexperiments.item;

import ru.power_umc.forestxexperiments.init.ForestLegacyModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class QuicksandItem extends BucketItem {
	public QuicksandItem() {
		super(ForestLegacyModFluids.QUICKSAND, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}

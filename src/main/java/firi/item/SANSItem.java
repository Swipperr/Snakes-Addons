
package firi.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import firi.itemgroup.SnakesaddonsItemGroup;

import firi.BetterFoxesModElements;

@BetterFoxesModElements.ModElement.Tag
public class SANSItem extends BetterFoxesModElements.ModElement {
	@ObjectHolder("better_foxes:sans")
	public static final Item block = null;
	public SANSItem(BetterFoxesModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, BetterFoxesModElements.sounds.get(new ResourceLocation("better_foxes:s-s-s-sans")),
					new Item.Properties().group(SnakesaddonsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("sans");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}

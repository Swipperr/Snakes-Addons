
package firi.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import firi.item.TabplaceholderItem;

import firi.BetterFoxesModElements;

@BetterFoxesModElements.ModElement.Tag
public class SnakesaddonsItemGroup extends BetterFoxesModElements.ModElement {
	public SnakesaddonsItemGroup(BetterFoxesModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsnakesaddons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TabplaceholderItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}

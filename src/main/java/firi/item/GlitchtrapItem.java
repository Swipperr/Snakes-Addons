
package firi.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

import firi.itemgroup.SnakesaddonsItemGroup;

import firi.BetterFoxesModElements;

@BetterFoxesModElements.ModElement.Tag
public class GlitchtrapItem extends BetterFoxesModElements.ModElement {
	@ObjectHolder("better_foxes:glitchtrap")
	public static final Item block = null;
	public GlitchtrapItem(BetterFoxesModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, BetterFoxesModElements.sounds.get(new ResourceLocation("better_foxes:glitchy")),
					new Item.Properties().group(SnakesaddonsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("glitchtrap");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Encrypted"));
		}
	}
}

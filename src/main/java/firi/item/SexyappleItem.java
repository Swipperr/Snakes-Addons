
package firi.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

import firi.itemgroup.SnakesaddonsItemGroup;

import firi.BetterFoxesModElements;

@BetterFoxesModElements.ModElement.Tag
public class SexyappleItem extends BetterFoxesModElements.ModElement {
	@ObjectHolder("better_foxes:sexyapple")
	public static final Item block = null;
	public SexyappleItem(BetterFoxesModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(SnakesaddonsItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(4).saturation(8f).setAlwaysEdible().build()));
			setRegistryName("sexyapple");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 117;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Mmmmmm"));
			list.add(new StringTextComponent("8 Heart's Indeed."));
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}

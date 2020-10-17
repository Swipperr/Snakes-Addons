
package firi.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import firi.procedures.FunnyBoneEntitySwingsItemProcedure;

import firi.itemgroup.SnakesaddonsItemGroup;

import firi.BetterFoxesModElements;

@BetterFoxesModElements.ModElement.Tag
public class FunnyBoneItem extends BetterFoxesModElements.ModElement {
	@ObjectHolder("better_foxes:funny_bone")
	public static final Item block = null;
	public FunnyBoneItem(BetterFoxesModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SnakesaddonsItemGroup.tab).maxStackSize(64));
			setRegistryName("funny_bone");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Hehehehe"));
			list.add(new StringTextComponent("Funny."));
		}

		@Override
		public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
			boolean retval = super.onEntitySwing(itemstack, entity);
			double x = entity.posX;
			double y = entity.posY;
			double z = entity.posZ;
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				FunnyBoneEntitySwingsItemProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}

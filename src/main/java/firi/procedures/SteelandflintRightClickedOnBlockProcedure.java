package firi.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

import firi.world.dimension.SkuldDimension;

import firi.BetterFoxesModElements;

@BetterFoxesModElements.ModElement.Tag
public class SteelandflintRightClickedOnBlockProcedure extends BetterFoxesModElements.ModElement {
	public SteelandflintRightClickedOnBlockProcedure(BetterFoxesModElements instance) {
		super(instance, 32);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SteelandflintRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SteelandflintRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SteelandflintRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SteelandflintRightClickedOnBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World)
			SkuldDimension.portal.portalSpawn(world.getWorld(), new BlockPos((int) x, (int) y, (int) z));
	}
}

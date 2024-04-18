package luke.nfc.blocks;

import luke.nfc.items.NFCItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockGlowStoneBlue extends Block {

	public BlockGlowStoneBlue(String key, int id, Material material) {
		super(key, id, material);
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case PICK_BLOCK:
			case SILK_TOUCH:
				return new ItemStack[]{new ItemStack(this)};
			default:
				return new ItemStack[]{new ItemStack(NFCItems.dustGlowstoneBlue, 2 + world.rand.nextInt(2))};
		}
	}

}

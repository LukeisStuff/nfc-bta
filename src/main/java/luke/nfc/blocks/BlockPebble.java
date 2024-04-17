package luke.nfc.blocks;

import net.minecraft.core.block.BlockSand;
import net.minecraft.core.entity.EntityFallingSand;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockPebble extends BlockSand {

	public BlockPebble(String key, int id) {
		super(key, id);
	}

	public void updateTick(World world, int x, int y, int z, Random rand) {
		this.tryToFall(world, x, y, z, rand);
	}

	private void tryToFall(World world, int i, int j, int k, Random rand) {
		if (canFallBelow(world, i, j - 1, k) && j >= 0) {
			byte byte0 = 32;
			if (rand.nextInt(10) == 0) {
				if (!fallInstantly && world.areBlocksLoaded(i - byte0, j - byte0, k - byte0, i + byte0, j + byte0, k + byte0)) {
					EntityFallingSand entityfallingsand = new EntityFallingSand(world, (float) i + 0.5F, (float) j + 0.5F, (float) k + 0.5F, this.id);
					world.entityJoinedWorld(entityfallingsand);
				} else {
					world.setBlockWithNotify(i, j, k, 0);

					while (canFallBelow(world, i, j - 1, k) && j > 0) {
						--j;
					}

					if (j > 0) {
						world.setBlockWithNotify(i, j, k, this.id);
					}
				}
			}
		}
	}

}

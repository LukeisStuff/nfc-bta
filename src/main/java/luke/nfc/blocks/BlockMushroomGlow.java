package luke.nfc.blocks;

import net.minecraft.core.block.BlockMushroom;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockMushroomGlow extends BlockMushroom {
	public BlockMushroomGlow(String key, int id) {
		super(key, id);
	}

	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		if (rand.nextInt(2) == 0) {
			double poxX = (double) x + 0.5 + (double) (rand.nextFloat() * 6.0F / 16.0F);
			double posY = (double) y + 0.4 + (double) (rand.nextFloat() * 6.0F / 16.0F);
			double posZ = (double) z + 0.5 + (double) (rand.nextFloat() * 6.0F / 16.0F);
			double f4 = rand.nextFloat() * 0.6F - 0.3F;
			world.spawnParticle("smoke", poxX, posY, posZ + f4, 0.0, 0.0, 0.0);
			world.spawnParticle("flame", poxX, posY, posZ + f4, 0.0, 0.0, 0.0);
		}
	}

}

package luke.nfc.blocks;

import net.minecraft.core.block.BlockSand;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockSandScorched extends BlockSand {

	public BlockSandScorched(String key, int id, Material material) {
		super(key, id);
	}

	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		if (rand.nextInt(15) == 0) {
			double xPos = (double) x + 0.5 + (double) (rand.nextFloat() * 6.0F / 16.0F);
			double yPos = (double) y + 0.7 + (double) (rand.nextFloat() * 6.0F / 16.0F);
			double zPos = (double) z + 0.5 + (double) (rand.nextFloat() * 6.0F / 16.0F);
			world.spawnParticle("smoke", xPos, yPos, zPos, 0.0, 0.0, 0.0);
			if (rand.nextInt(10) == 0) {
				world.spawnParticle("largesmoke", xPos, yPos, zPos, 0.0, 0.0, 0.0);
			}

		}
	}

}

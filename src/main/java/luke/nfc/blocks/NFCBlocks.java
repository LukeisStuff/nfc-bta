package luke.nfc.blocks;

import luke.nfc.NFCConfig;
import net.minecraft.core.block.Block;

public class NFCBlocks {

	private int blockID(String blockName) {
		return NFCConfig.cfg.getInt("Block IDs." + blockName);
	}

	public static Block pebble;

	public static Block stoneBlock;
	public static Block stoneBlockSide;
	public static Block stoneBlockUpright;
	public static Block stoneBlockCross;
	public static Block stoneBlockBrick;
	public static Block stoneBlockBrickSmall;

	public static Block netherBlock;
	public static Block netherBlockSide;
	public static Block netherBlockUpright;
	public static Block netherBlockCross;
	public static Block netherBlockBrick;
	public static Block netherBlockBrickSmall;


	public static Block window;
	public static Block windowLarge;
	public static Block windowDouble;

	public static Block bricksFired;

	public static Block glassStained;

	public static Block scaffolding;






	public static Block glowstoneBlue;

	public static Block mushroomGlow;
	public static Block mushroomFire;

	public static Block sandScorched;

	public static Block oreAshNetherrack;
	public static Block oreUraniniteNetherrack;
	public static Block oreGoldNetherrack;
	public static Block oreOnyxNetherrack;










}

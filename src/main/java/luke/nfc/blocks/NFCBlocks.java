package luke.nfc.blocks;

import luke.nfc.NFCConfig;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

import static luke.nfc.NFCMod.MOD_ID;

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

	public static Block ovenBrickIdle;
	public static Block ovenBrickActive;

	public static Block mushroomBlue;
	public static Block mushroomPurple;


	public static Block glowstoneBlue;

	public static Block mushroomGlow;
	public static Block mushroomFire;

	public static Block sandScorched;

	public static Block oreAshNetherrack;
	public static Block oreUraniniteNetherrack;
	public static Block oreGoldNetherrack;
	public static Block oreOnyxNetherrack;


	public static Block blockAluminum;
	public static Block blockCopper;
	public static Block blockTin;
	public static Block blockZinc;
	public static Block blockNickel;
	public static Block blockBismuth;
	public static Block blockCobalt;
	public static Block blockTungsten;
	public static Block blockMagnetite;
	public static Block blockSilver;
	public static Block blockLead;
	public static Block blockSilicon;
	public static Block blockChrome;
	public static Block blockTitanium;
	public static Block blockUranium;
	public static Block blockRuby;
	public static Block blockSapphire;
	public static Block blockEmerald;
	public static Block blockBoron;
	public static Block blockPlatinum;
	public static Block blockSteel;
	public static Block blockOsmium;
	public static Block blockOnyx;
	public static Block blockBrass;
	public static Block blockBronze;




	private void initializeBlockDetails() {

	}

	public void initializeBlocks() {

		BlockBuilder block = new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5f)
			.setResistance(10.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CHAINLINK_FENCES_CONNECT);

		BlockBuilder glass = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.wood", "random.glass", 1.0f, 1.0f))
			.setHardness(0.3F)
			.setResistance(1.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.EXTENDS_MOTION_SENSOR_RANGE);

		BlockBuilder brick = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
			.setResistance(10.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder plant = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
			.setHardness(0.0f)
			.setResistance(0.0f)
			.setBlockModel(new BlockModelRenderBlocks(1))
			.setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);

		BlockBuilder ore = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
			.setHardness(3.0f)
			.setResistance(5.0f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);



		pebble = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.gravel", "step.gravel", 1.0f, 1.0f))
			.setHardness(1.0f)
			.setResistance(1.0f)
			.setTextures("pebble.png")
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.build(new BlockPebble("pebble", blockID("pebble")));

		stoneBlock = block
			.setTextures("stoneBlock.png")
			.build(new Block("stone.block", blockID("stoneBlock"), Material.stone));

		stoneBlockSide = block
			.setTextures("stoneBlockSide.png")
			.build(new Block("stone.block.side", blockID("stoneBlockSide"), Material.stone));

		stoneBlockUpright = block
			.setTextures("stoneBlockUpright.png")
			.build(new Block("stone.block.upright", blockID("stoneBlockUpright"), Material.stone));

		stoneBlockCross = block
			.setTextures("stoneBlockCross.png")
			.build(new Block("stone.block.cross", blockID("stoneBlockCross"), Material.stone));

		stoneBlockBrick = block
			.setTextures("stoneBlockBrick.png")
			.build(new Block("stone.block.brick", blockID("stoneBlockBrick"), Material.stone));

		stoneBlockBrickSmall = block
			.setTextures("stoneBlockBrickSmall.png")
			.build(new Block("stone.block.brick.small", blockID("stoneBlockBrickSmall"), Material.stone));


		netherBlock = block
			.setTextures("netherBlock.png")
			.build(new Block("nether.block", blockID("netherBlock"), Material.stone));

		netherBlockSide = block
			.setTextures("netherBlockSide.png")
			.build(new Block("nether.block.side", blockID("netherBlockSide"), Material.stone));

		netherBlockUpright = block
			.setTextures("netherBlockUpright.png")
			.build(new Block("nether.block.upright", blockID("netherBlockUpright"), Material.stone));

		netherBlockCross = block
			.setTextures("netherBlockCross.png")
			.build(new Block("nether.block.cross", blockID("netherBlockCross"), Material.stone));

		netherBlockBrick = block
			.setTextures("netherBlockBrick.png")
			.build(new Block("nether.block.brick", blockID("netherBlockBrick"), Material.stone));

		netherBlockBrickSmall = block
			.setTextures("netherBlockBrickSmall.png")
			.build(new Block("nether.block.brick.small", blockID("netherBlockBrickSmall"), Material.stone));



		window = glass
			.setTextures("window.png")
			.build(new BlockGlass("window", blockID("window"), Material.glass, false));

		windowLarge = glass
			.setTextures("windowLarge.png")
			.build(new BlockGlass("window.large", blockID("windowLarge"), Material.glass, false));

		windowDouble = glass
			.setTextures("windowDouble.png")
			.build(new BlockGlass("window.double", blockID("windowDouble"), Material.glass, false));



		bricksFired = brick
			.setTextures("bricksFired.png")
			.build(new Block("brick.fired", blockID("bricksFired"), Material.stone));



		mushroomBlue = plant
			.setTextures("mushroomBlue.png")
			.setLuminance(9)
			.build(new BlockMushroomGlow("mushroom.blue", blockID("mushroomBlue")));

		mushroomPurple = plant
			.setTextures("mushroomPurple.png")
			.setLuminance(9)
			.build(new BlockMushroomGlow("mushroom.purple", blockID("mushroomPurple")));

		mushroomGlow = plant
			.setTextures("mushroomGlow.png")
			.setLuminance(11)
			.build(new BlockMushroom("mushroom.glow", blockID("mushroomGlow")));

		mushroomFire = plant
			.setTextures("mushroomFire.png")
			.setLuminance(10)
			.build(new BlockMushroomFire("mushroom.fire", blockID("mushroomFire")));

		glowstoneBlue = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
			.setHardness(1.0f)
			.setResistance(1.0f)
			.setUseInternalLight()
			.setLuminance(15)
			.setTextures("glowstoneBlue.png")
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new BlockGlowStoneBlue("glowstone.blue", blockID("glowstoneBlue"), Material.stone));

		sandScorched = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.0f))
			.setHardness(0.5f)
			.setResistance(0.5f)
			.setTextures("sandScorched.png")
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new BlockSandScorched("sand.scorched", blockID("sandScorched"), Material.sand));










		initializeBlockDetails();
	}










}

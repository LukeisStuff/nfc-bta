package luke.nfc.items;

import luke.nfc.NFCConfig;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.ItemPlaceable;
import net.minecraft.core.item.tag.ItemTags;
import turniplabs.halplibe.helper.ItemHelper;

import static luke.nfc.NFCMod.MOD_ID;

public class NFCItems {

	private int itemID(String itemName) {
		return NFCConfig.cfg.getInt("Item IDs." + itemName);
	}

	public static Item eggCooked;
	public static Item dynamite;
	public static Item cheese;
	public static Item bookWritable;
	public static Item bucketOil;
	public static Item telescope;
	public static Item wrench;
	public static Item dustGlowstoneBlue;
	public static Item ashNether;
	public static Item appleBismuth;
	public static Item recordNostalgia;

	public static Item oreRawCobalt;
	public static Item oreRawAluminum;
	public static Item oreRawCopper;
	public static Item oreRawTin;
	public static Item oreRawZinc;
	public static Item oreRawNickel;
	public static Item oreRawBismuth;
	public static Item oreRawOsmium;
	public static Item oreRawTungsten;
	public static Item oreRawMagnetite;
	public static Item oreRawSilver;
	public static Item oreRawLead;
	public static Item oreRawSilicon;
	public static Item oreRawChrome;
	public static Item oreRawTitanium;
	public static Item oreRawUraninite;
	public static Item oreRawBoron;
	public static Item oreRawPlatinum;

	public static Item ingotCobalt;
	public static Item ingotAluminum;
	public static Item ingotCopper;
	public static Item ingotTin;
	public static Item ingotZinc;
	public static Item ingotNickel;
	public static Item ingotBismuth;
	public static Item ingotOsmium;
	public static Item ingotTungsten;
	public static Item ingotMagnetite;
	public static Item ingotSilver;
	public static Item ingotLead;
	public static Item ingotSilicon;
	public static Item ingotChrome;
	public static Item ingotTitanium;
	public static Item ingotUraninite;
	public static Item ingotBoron;
	public static Item ingotPlatinum;

	public static Item anthracite;
	public static Item ruby;
	public static Item sapphire;
	public static Item emerald;
	public static Item onyx;







	public void initilizeItems() {
		// Items
		eggCooked = ItemHelper.createItem(MOD_ID,
			new ItemFood("egg.cooked", itemID("eggCooked"), 4, true), "eggCooked.png");

		cheese = ItemHelper.createItem(MOD_ID,
			new ItemFood("food.cheese", itemID("cheese"), 5, false), "cheese.png");

		appleBismuth = ItemHelper.createItem(MOD_ID,
			new ItemFood("food.apple.bismuth", itemID("appleBismuth"), 42, false), "appleBismuth.png");

		dustGlowstoneBlue = ItemHelper.createItem(MOD_ID,
			new Item("dust.glowstone.blue", itemID("dustGlowstoneBlue")), "dustGlowstoneBlue.png").withTags(ItemTags.renderFullbright);

		ashNether = ItemHelper.createItem(MOD_ID,
			new Item("ash", itemID("ashNether")), "ashNether.png");

		dynamite = ItemHelper.createItem(MOD_ID,
			new Item("dynamite", itemID("dynamite")), "dynamite.png");



		oreRawCobalt = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.cobalt", itemID("oreRawCobalt")), "oreRawCobalt.png");
		oreRawAluminum = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.aluminum", itemID("oreRawAluminum")), "oreRawAluminum.png");
		oreRawCopper = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.copper", itemID("oreRawCopper")), "oreRawCopper.png");
		oreRawTin = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.tin", itemID("oreRawTin")), "oreRawTin.png");
		oreRawZinc = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.zinc", itemID("oreRawZinc")), "oreRawZinc.png");
		oreRawNickel = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.nickel", itemID("oreRawNickel")), "oreRawNickel.png");
		oreRawBismuth = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.bismuth", itemID("oreRawBismuth")), "oreRawBismuth.png");
		oreRawOsmium = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.osmium", itemID("oreRawOsmium")), "oreRawOsmium.png");
		oreRawTungsten = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.tungsten", itemID("oreRawTungsten")), "oreRawTungsten.png");
		oreRawMagnetite = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.magnetite", itemID("oreRawMagnetite")), "oreRawMagnetite.png");
		oreRawSilver = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.silver", itemID("oreRawSilver")), "oreRawSilver.png");
		oreRawLead = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.lead", itemID("oreRawLead")), "oreRawLead.png");
		oreRawSilicon = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.silicon", itemID("oreRawSilicon")), "oreRawSilicon.png");
		oreRawChrome = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.chrome", itemID("oreRawChrome")), "oreRawChrome.png");
		oreRawTitanium = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.titanium", itemID("oreRawTitanium")), "oreRawTitanium.png");
		oreRawUraninite = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.uranium", itemID("oreRawUraninite")), "oreRawUraninite.png");
		oreRawBoron = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.boron", itemID("oreRawBoron")), "oreRawBoron.png");
		oreRawPlatinum = ItemHelper.createItem(MOD_ID,
			new Item("ore.raw.platinum", itemID("oreRawPlatinum")), "oreRawPlatinum.png");

		ingotCobalt = ItemHelper.createItem(MOD_ID,
			new Item("ingot.cobalt", itemID("ingotCobalt")), "ingotCobalt.png");
		ingotAluminum = ItemHelper.createItem(MOD_ID,
			new Item("ingot.aluminum", itemID("ingotAluminum")), "ingotAluminum.png");
		ingotCopper = ItemHelper.createItem(MOD_ID,
			new Item("ingot.copper", itemID("ingotCopper")), "ingotCopper.png");
		ingotTin = ItemHelper.createItem(MOD_ID,
			new Item("ingot.tin", itemID("ingotTin")), "ingotTin.png");
		ingotZinc = ItemHelper.createItem(MOD_ID,
			new Item("ingot.zinc", itemID("ingotZinc")), "ingotZinc.png");
		ingotNickel = ItemHelper.createItem(MOD_ID,
			new Item("ingot.nickel", itemID("ingotNickel")), "ingotNickel.png");
		ingotBismuth = ItemHelper.createItem(MOD_ID,
			new Item("ingot.bismuth", itemID("ingotBismuth")), "ingotBismuth.png");
		ingotOsmium = ItemHelper.createItem(MOD_ID,
			new Item("ingot.osmium", itemID("ingotOsmium")), "ingotOsmium.png");
		ingotTungsten = ItemHelper.createItem(MOD_ID,
			new Item("ingot.tungsten", itemID("ingotTungsten")), "ingotTungsten.png");
		ingotMagnetite = ItemHelper.createItem(MOD_ID,
			new Item("ingot.magnetite", itemID("ingotMagnetite")), "ingotMagnetite.png");
		ingotSilver = ItemHelper.createItem(MOD_ID,
			new Item("ingot.silver", itemID("ingotSilver")), "ingotSilver.png");
		ingotLead = ItemHelper.createItem(MOD_ID,
			new Item("ingot.lead", itemID("ingotLead")), "ingotLead.png");
		ingotSilicon = ItemHelper.createItem(MOD_ID,
			new Item("ingot.silicon", itemID("ingotSilicon")), "ingotSilicon.png");
		ingotChrome = ItemHelper.createItem(MOD_ID,
			new Item("ingot.chrome", itemID("ingotChrome")), "ingotChrome.png");
		ingotTitanium = ItemHelper.createItem(MOD_ID,
			new Item("ingot.titanium", itemID("ingotTitanium")), "ingotTitanium.png");
		ingotUraninite = ItemHelper.createItem(MOD_ID,
			new Item("ingot.uranium", itemID("ingotUraninite")), "ingotUraninite.png");
		ingotBoron = ItemHelper.createItem(MOD_ID,
			new Item("ingot.boron", itemID("ingotBoron")), "ingotBoron.png");
		ingotPlatinum = ItemHelper.createItem(MOD_ID,
			new Item("ingot.platinum", itemID("ingotPlatinum")), "ingotPlatinum.png");


		anthracite = ItemHelper.createItem(MOD_ID,
			new Item("anthracite", itemID("anthracite")), "anthracite.png");
		ruby = ItemHelper.createItem(MOD_ID,
			new Item("ruby", itemID("ruby")), "ruby.png");
		sapphire = ItemHelper.createItem(MOD_ID,
			new Item("sapphire", itemID("sapphire")), "sapphire.png");
		emerald = ItemHelper.createItem(MOD_ID,
			new Item("emerald", itemID("emerald")), "emerald.png");
		onyx = ItemHelper.createItem(MOD_ID,
			new Item("onyx", itemID("onyx")), "onyx.png");




	}
}

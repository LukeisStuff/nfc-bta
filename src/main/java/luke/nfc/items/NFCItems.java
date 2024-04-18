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
	public static Item oreRawAliminum;
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



	}
}

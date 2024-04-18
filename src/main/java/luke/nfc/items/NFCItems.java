package luke.nfc.items;

import luke.nfc.NFCConfig;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.ItemPlaceable;
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

	public void initilizeItems() {
		// Items
		eggCooked = ItemHelper.createItem(MOD_ID,
			new ItemFood("egg.cooked", itemID("eggCooked"), 1, true), "eggCooked.png");

		cheese = ItemHelper.createItem(MOD_ID,
			new ItemFood("cheese", itemID("cheese"), 1, false), "cheese.png");






//        CreativeHelper.setParent(BonusItems.candleSoulwax, Block.torchCoal);
//
//        CreativeHelper.setParent(BonusItems.foodPie, Item.foodCake);
//
//        CreativeHelper.setParent(BonusItems.ingotCopper, Item.ingotGold);
//        CreativeHelper.setParent(BonusItems.ingotSilver, Item.ingotGold);
//
//        CreativeHelper.setParent(BonusItems.oreRawCopper, Item.oreRawIron);
//        CreativeHelper.setParent(BonusItems.oreRawSilver, Item.oreRawIron);
//
//        CreativeHelper.setParent(BonusItems.seatSilver, Item.seat);
//
//        CreativeHelper.setParent(BonusItems.bedSilver, Item.bed);
//
//
//        CreativeHelper.setParent(BonusItems.doorCopper, Item.doorIron);
//        CreativeHelper.setParent(BonusItems.doorCopperTarnished, Item.doorIron);
//        CreativeHelper.setParent(BonusItems.doorCopperCorroded, Item.doorIron);
//
//        CreativeHelper.setParent(BonusItems.doorSilver, Item.doorIron);
	}
}

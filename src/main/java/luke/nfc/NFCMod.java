package luke.nfc;

import luke.nfc.blocks.NFCBlocks;
import luke.nfc.items.NFCItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class NFCMod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "nfc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("New Frontier Craft initialized.");
    }

	@Override
	public void beforeGameStart() {

		new NFCBlocks().initializeBlocks();
		new NFCItems().initilizeItems();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {

	}
}

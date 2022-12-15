package net.gracemotley.motleysmusicdiscs;

import net.fabricmc.api.ModInitializer;
import net.gracemotley.motleysmusicdiscs.block.ModBlocks;
import net.gracemotley.motleysmusicdiscs.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MotleysMusicDiscs implements ModInitializer {
	public static final String MOD_ID = "motleysmusicdiscs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}

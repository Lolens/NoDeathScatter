package lolens.nodeathscatter;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Nodeathscatter implements ModInitializer {
	public static final String MOD_ID = "nodeathscatter";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final lolens.nodeathscatter.NoDeathScatterConfig CONFIG = lolens.nodeathscatter.NoDeathScatterConfig.createAndLoad();

	@Override
	public void onInitialize() {

	}
}
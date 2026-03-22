package io.github.lolens.nodeathscatter.fabric;

import io.github.lolens.nodeathscatter.fabric.gamerule.DeathScatterGameRule;
import net.fabricmc.api.ModInitializer;

import io.github.lolens.nodeathscatter.Nodeathscatter;

public final class NodeathscatterFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // although fabric has net\fabricmc\fabric\mixin\gamerule\GameRulesAccessor.class it is unstable API
        DeathScatterGameRule.register();

        // Run our common setup.
        Nodeathscatter.init();
    }
}

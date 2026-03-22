package io.github.lolens.nodeathscatter.forge;

import io.github.lolens.nodeathscatter.Nodeathscatter;
import io.github.lolens.nodeathscatter.forge.gamerule.DeathScatterGameRule;
import net.minecraftforge.fml.common.Mod;

@Mod(Nodeathscatter.MOD_ID)
public final class NodeathscatterForge {
    public NodeathscatterForge() {
        // Run our common setup.

        DeathScatterGameRule.register();

        Nodeathscatter.init();
    }
}

package lolens.nodeathscatter;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "nodeathscatter")
@Config(name = "no-death-scatter-config", wrapperName = "NoDeathScatterConfig")
public class ScatterConfig {
    public float scatterMultiplier = 1.0f;
}

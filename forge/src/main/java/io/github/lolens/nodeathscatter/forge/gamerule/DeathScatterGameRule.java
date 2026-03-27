package io.github.lolens.nodeathscatter.forge.gamerule;

import net.minecraft.world.GameRules;

public class DeathScatterGameRule {

    public static final GameRules.Key<GameRules.IntRule> DEATH_SCATTER_SPEED_PERCENT = GameRules.register(
            "deathScatterSpeedPercent", GameRules.Category.PLAYER, GameRules.IntRule.create(
                    100,
                    (server, rule) -> {
                        if (rule.get() < 0) rule.set(0, server);
                        // higher values may freeze server due to itemEntity extreme speed
                        if (rule.get() > 10000) rule.set(10000, server);
                    }
            )
    );

    public static void register() {
    }

}
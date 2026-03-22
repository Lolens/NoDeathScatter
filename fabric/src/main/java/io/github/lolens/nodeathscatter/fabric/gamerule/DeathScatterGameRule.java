package io.github.lolens.nodeathscatter.fabric.gamerule;

import io.github.lolens.nodeathscatter.fabric.mixin.GameRulesAccessor;
import io.github.lolens.nodeathscatter.fabric.mixin.GameRulesIntRuleAccessor;
import net.minecraft.world.GameRules;

public class DeathScatterGameRule {

    public static final GameRules.Key<GameRules.IntRule> DEATH_SCATTER_MULTIPLIER = GameRulesAccessor.nodeathscatter$register(
            "deathScatterMultiplier", GameRules.Category.PLAYER, GameRulesIntRuleAccessor.nodeathscatter$createWithCallback(
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

package io.github.lolens.nodeathscatter.fabric.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.function.BiConsumer;

@Mixin(GameRules.IntRule.class)
public interface GameRulesIntRuleAccessor {

    @Invoker("create")
    static GameRules.Type<GameRules.IntRule> nodeathscatter$createWithCallback(
            int initialValue, BiConsumer<MinecraftServer, GameRules.IntRule> changeCallback
    ) {
        throw new AssertionError();
    }

}

package io.github.lolens.nodeathscatter.fabric.mixin;

import io.github.lolens.nodeathscatter.fabric.gamerule.DeathScatterGameRule;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {

    @Inject(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/ItemEntity;",
            at = @At("RETURN"))
    private void onDropItem(ItemStack stack, boolean throwRandomly, boolean retainOwnership,
                            CallbackInfoReturnable<ItemEntity> cir) {
        ItemEntity itemEntity = cir.getReturnValue();

        if (itemEntity != null && throwRandomly) {

            double originalSpeedX = itemEntity.getVelocity().x;
            double originalSpeedY = itemEntity.getVelocity().y;
            double originalSpeedZ = itemEntity.getVelocity().z;

            double slowdownFactor = (double) itemEntity.getWorld().getGameRules().getInt(DeathScatterGameRule.DEATH_SCATTER_MULTIPLIER) / 100;

            itemEntity.setVelocity(
                    originalSpeedX * slowdownFactor,
                    originalSpeedY * slowdownFactor,
                    originalSpeedZ * slowdownFactor
            );
        }
    }

}

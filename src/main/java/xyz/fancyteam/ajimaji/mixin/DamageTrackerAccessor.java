package xyz.fancyteam.ajimaji.mixin;

import net.minecraft.entity.damage.DamageTracker;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(DamageTracker.class)
public interface DamageTrackerAccessor {
    @Accessor("ageOnLastDamage")
    int getAgeOnLastDamage();
}

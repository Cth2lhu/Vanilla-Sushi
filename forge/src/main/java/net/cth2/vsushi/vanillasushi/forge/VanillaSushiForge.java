package net.cth2.vsushi.vanillasushi.forge;

import dev.architectury.platform.forge.EventBuses;
import net.cth2.vsushi.vanillasushi.VanillaSushi;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VanillaSushi.MOD_ID)
public class VanillaSushiForge {
    public VanillaSushiForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(VanillaSushi.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        VanillaSushi.init();
    }
}
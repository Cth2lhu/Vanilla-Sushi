package net.cth2.vsushi.vanillasushi.fabric;

import net.cth2.vsushi.vanillasushi.VanillaSushi;
import net.fabricmc.api.ModInitializer;

public class VanillaSushiFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        VanillaSushi.init();
    }
}
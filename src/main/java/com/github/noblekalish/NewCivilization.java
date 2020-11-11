package com.github.noblekalish;

import com.github.noblekalish.blocks.TownHallBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NewCivilization implements ModInitializer {
    public static final TownHallBlock TOWN_HALL_BLOCK = new TownHallBlock(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("newciv", "town_hall_block"), TOWN_HALL_BLOCK);
    }
}

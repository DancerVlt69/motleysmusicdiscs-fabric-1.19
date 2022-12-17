package net.gracemotley.motleysmusicdiscs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gracemotley.motleysmusicdiscs.MotleysMusicDiscs;
import net.gracemotley.motleysmusicdiscs.item.custom.ModMusicDiscItem;
import net.gracemotley.motleysmusicdiscs.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;


public class ModItems {

public static final Item CONTENT_BOBURNHAM_MUSIC_DISC = registerItem("content_boburnham_music_disc",
        new ModMusicDiscItem(7, ModSounds.CONTENT_BOBURNHAM,
                new FabricItemSettings().group(ModItemGroup.DISCS).maxCount(1).rarity(Rarity.RARE), 96));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MotleysMusicDiscs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MotleysMusicDiscs.LOGGER.debug("Registering Mod Items for " + MotleysMusicDiscs.MOD_ID);
    }
}
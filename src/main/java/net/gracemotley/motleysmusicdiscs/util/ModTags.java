package net.gracemotley.motleysmusicdiscs.util;

import net.gracemotley.motleysmusicdiscs.MotleysMusicDiscs;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Items {
        public static final

        TagKey<Item> MUSIC_DISCS = createCommonTag("music_discs");

    private static TagKey<Item> createCommonTag(String name) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(MotleysMusicDiscs.MOD_ID, name));
    }

    private static TagKey<Item> createTag(String name) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}

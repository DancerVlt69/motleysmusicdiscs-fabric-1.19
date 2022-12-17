package net.gracemotley.motleysmusicdiscs.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gracemotley.motleysmusicdiscs.MotleysMusicDiscs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DISCS = FabricItemGroupBuilder.build(
            new Identifier(MotleysMusicDiscs.MOD_ID, "discs"), () -> new ItemStack(ModItems.CONTENT_BOBURNHAM_MUSIC_DISC));
}

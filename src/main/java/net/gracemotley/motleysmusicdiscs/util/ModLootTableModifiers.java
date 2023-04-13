package net.gracemotley.motleysmusicdiscs.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.gracemotley.motleysmusicdiscs.item.ModItemGroup;
import net.gracemotley.motleysmusicdiscs.item.ModItems;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    public static final Identifier SIMPLE_DUNGEON_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/simple_dungeon");

    public static void modifyLootTables() {

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(SIMPLE_DUNGEON_STRUCTURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.CONTENT_BOBURNHAM_MUSIC_DISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());

            LootPool[] pools = lootManager.getTable(new Identifier(Initializer.MODID, "custom loot table path")).pools;

            if (pools !=null)
                buildPools(tableBuilder, pools);
                    }
        });
    }
}
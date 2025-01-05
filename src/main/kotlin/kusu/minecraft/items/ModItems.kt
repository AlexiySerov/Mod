package kusu.minecraft.items

import kusu.minecraft.Mod
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

class ModItems {
    private val KINGS_ROD = registerItem("kings_rod", Item(Item.Settings().fireproof().maxCount(1)))

    private fun registerItem(name: String, item: Item): Item {
        return Registry.register<Item, Item>(Registries.ITEM, Identifier.of(Mod.MOD_ID, name), item)
    }

    fun registerModItems() {
        Mod.logger.info("Registering Mod Items for " + Mod.MOD_ID)

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
            .register(ItemGroupEvents.ModifyEntries { entries: FabricItemGroupEntries ->
                entries.add(KINGS_ROD)
            })
    }
}
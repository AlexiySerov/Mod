package kusu.minecraft.items

import kusu.minecraft.Mod
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

object ModItems {
    val KINGS_ROD = registerItem("kings_rod", Item(Item.Settings().fireproof().maxCount(1).maxDamage(5)))

    val STEAL_INGOT = registerItem("steal_ingot", Item(Item.Settings().maxCount(64)))

    val STEAL_SWORD = registerItem("steal_sword", Item(Item.Settings().maxCount(1).maxDamage(8)))
    val STEAL_PICKAXE = registerItem("steal_pickaxe", Item(Item.Settings().maxCount(1).maxDamage(5)))
    val STEAL_AXE = registerItem("steal_axe", Item(Item.Settings().maxCount(1).maxDamage(9)))
    val STEAL_HOE = registerItem("steal_hoe", Item(Item.Settings().maxCount(1).maxDamage(4)))
    val STEAL_SHOVEL = registerItem("steal_shovel", Item(Item.Settings().maxCount(1).maxDamage(5)))


    private fun registerItem(name: String, item: Item): Item {
        return Registry.register<Item, Item>(Registries.ITEM, Identifier.of(Mod.MOD_ID, name), item)
    }

    fun registerModItems() {
        Mod.logger.info("Registering Mod Items for " + Mod.MOD_ID)

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY)
            .register(ItemGroupEvents.ModifyEntries { entries: FabricItemGroupEntries ->
                entries.add(KINGS_ROD)


                entries.add(STEAL_INGOT)

                entries.add(STEAL_SWORD)
                entries.add(STEAL_PICKAXE)
                entries.add(STEAL_AXE)
                entries.add(STEAL_HOE)
                entries.add(STEAL_SHOVEL)
            })
    }
}

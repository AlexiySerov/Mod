package kusu.minecraft.items

import kusu.minecraft.Mod
import kusu.minecraft.items.materials.StealMaterial
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.AxeItem
import net.minecraft.item.HoeItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.item.PickaxeItem
import net.minecraft.item.ShovelItem
import net.minecraft.item.SwordItem
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

object ModItems {
    val KINGS_ROD = registerItem("kings_rod", Item(Item.Settings().fireproof().maxCount(1).maxDamage(5)))

    val STEAL_INGOT = registerItem("steal_ingot", Item(Item.Settings().maxCount(64)))
    val ALUMINUM_INGOT = registerItem("aluminum_ingot", Item(Item.Settings().maxCount(64)))
    val ALUMINUM_ROW = registerItem("aluminum_row", Item(Item.Settings().maxCount(64)))

    val STEAL_SWORD = registerItem("steal_sword", SwordItem(StealMaterial.INSTANCE, Item.Settings().maxCount(1).maxDamage(80)))
    val STEAL_PICKAXE = registerItem("steal_pickaxe", PickaxeItem(StealMaterial.INSTANCE, Item.Settings().maxCount(1)))
    val STEAL_AXE = registerItem("steal_axe", AxeItem(StealMaterial.INSTANCE, Item.Settings().maxCount(1)))
    val STEAL_HOE = registerItem("steal_hoe", HoeItem(StealMaterial.INSTANCE, Item.Settings().maxCount(1)))
    val STEAL_SHOVEL = registerItem("steal_shovel", ShovelItem(StealMaterial.INSTANCE, Item.Settings().maxCount(1)))


    private fun registerItem(name: String, item: Item): Item {
        return Registry.register<Item, Item>(Registries.ITEM, Identifier.of(Mod.MOD_ID, name), item)
    }

    fun registerModItems() {
        Mod.logger.info("Registering Mod Items for " + Mod.MOD_ID)

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY)
            .register(ItemGroupEvents.ModifyEntries { entries: FabricItemGroupEntries ->
                entries.add(KINGS_ROD)

                entries.add(STEAL_INGOT)
                entries.add(ALUMINUM_INGOT)
                entries.add(ALUMINUM_ROW)

                entries.add(STEAL_SWORD)
                entries.add(STEAL_PICKAXE)
                entries.add(STEAL_AXE)
                entries.add(STEAL_HOE)
                entries.add(STEAL_SHOVEL)
            })
    }
}

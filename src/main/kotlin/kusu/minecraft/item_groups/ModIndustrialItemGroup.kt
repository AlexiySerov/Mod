package kusu.minecraft.item_groups

import kusu.minecraft.Mod
import kusu.minecraft.items.ModItems
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object ModIndustrialItemGroup {
    val MOD_Industrial_ITEMS_GROUP: ItemGroup = Registry.register<ItemGroup, ItemGroup>(
        Registries.ITEM_GROUP,
        Identifier.of(Mod.MOD_ID, "mod_industrial_items_group"),
        FabricItemGroup.builder().icon { ItemStack(ModItems.STEAL_INGOT) }
            .displayName(Text.translatable("itemgroup.mod.mod_industrial_items_group"))
            .entries { displayContext: ItemGroup.DisplayContext?, entries: ItemGroup.Entries ->

                entries.add(ModItems.STEAL_INGOT)
                entries.add(ModItems.ALUMINUM_INGOT)
                entries.add(ModItems.ALUMINUM_ROW)

            }.build()
    )


    fun registerItemGroup() {
        Mod.logger.info("Registering Item Groups for " + Mod.MOD_ID)
    }
}
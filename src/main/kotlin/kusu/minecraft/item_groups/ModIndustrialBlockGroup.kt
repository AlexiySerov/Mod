package kusu.minecraft.item_groups

import kusu.minecraft.Mod
import kusu.minecraft.blocks.ModBlocks
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object ModIndustrialBlockGroup {
    val MOD_INDUSTRIAL_ITEMS_GROUP: ItemGroup = Registry.register<ItemGroup, ItemGroup>(
        Registries.ITEM_GROUP,
        Identifier.of(Mod.MOD_ID, "mod_industrial_blocks_group"),
        FabricItemGroup.builder().icon { ItemStack(ModBlocks.STEAL_BLOCK) }
            .displayName(Text.translatable("itemgroup.mod.mod_industrial_blocks_group"))
            .entries { displayContext: ItemGroup.DisplayContext?, entries: ItemGroup.Entries ->

                entries.add(ModBlocks.STEAL_BLOCK)

                entries.add(ModBlocks.ALUMINUM_BLOCK)
                entries.add(ModBlocks.ALUMINUM_ORE)
                entries.add(ModBlocks.ALUMINUM_DEEPSLATE_ORE)
                entries.add(ModBlocks.MELTING_FURNACE_BLOCK)

            }.build()
    )

    fun registerItemGroup() {
        Mod.logger.info("Registering Item Groups for " + Mod.MOD_ID)
    }
}
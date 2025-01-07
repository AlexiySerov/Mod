package kusu.minecraft.blocks

import kusu.minecraft.Mod
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier


object ModBlocks {

    val ROYAL_BLOCK: Block = registerBlock(
        "royal_block",
        Block(
            AbstractBlock.Settings.create().strength(4f)
                .requiresTool().sounds(BlockSoundGroup.METAL)
        )
    )

    private fun registerBlock(name: String, block: Block): Block {
        registerBlockItem(name, block)
        return Registry.register(Registries.BLOCK, Identifier.of(Mod.MOD_ID, name), block)
    }

    private fun registerBlockItem(name: String, block: Block) {
        Registry.register(
            Registries.ITEM, Identifier.of(Mod.MOD_ID, name),
            BlockItem(block, Item.Settings())
        )
    }

    fun registerModBlocks() {
        Mod.logger.info("Registering Mod Blocks for " + Mod.MOD_ID)

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
            .register(ModifyEntries { entries: FabricItemGroupEntries ->
                entries.add(ROYAL_BLOCK)
            })
    }
}
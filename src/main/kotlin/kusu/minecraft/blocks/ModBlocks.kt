package kusu.minecraft.blocks

import kusu.minecraft.Mod
import kusu.minecraft.blocks.industrial.MeltingFurnaceBlock
import kusu.minecraft.blocks.industrial.MeltingFurnaceBlockEntity
import kusu.minecraft.blocks.royalty.RoyalBlock
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.ExperienceDroppingBlock
import net.minecraft.block.entity.BlockEntity
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.block.entity.BlockEntityType.BlockEntityFactory
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import net.minecraft.util.math.intprovider.UniformIntProvider


object ModBlocks {

    val ROYAL_BLOCK: Block = registerBlock(
        "royal_block",
        RoyalBlock(
            AbstractBlock.Settings.create().strength(4f)
                .requiresTool().sounds(BlockSoundGroup.METAL)
        )
    )

    val STEAL_BLOCK: Block = registerBlock(
        "steal_block",
        Block(
            AbstractBlock.Settings.create().strength(4f)
                .requiresTool().sounds(BlockSoundGroup.METAL)
        )
    )

    val ALUMINUM_BLOCK: Block = registerBlock(
        "aluminum_block",
        Block(
            AbstractBlock.Settings.create().strength(4f)
                .requiresTool().sounds(BlockSoundGroup.METAL)
        )
    )

    val ALUMINUM_ORE: Block = registerBlock(
        "aluminum_ore",
        ExperienceDroppingBlock(
            UniformIntProvider.create(2, 5),
            AbstractBlock.Settings.create().strength(3f).requiresTool()
        )
    )

    val ALUMINUM_DEEPSLATE_ORE: Block = registerBlock(
        "aluminum_deepslate_ore",
        ExperienceDroppingBlock(
            UniformIntProvider.create(3, 6),
            AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)
        )
    )

    val MELTING_FURNACE_BLOCK: Block = registerBlock(
        "melting_furnace_block",
        MeltingFurnaceBlock(
            AbstractBlock.Settings.create().strength(4f)
                .requiresTool().sounds(BlockSoundGroup.METAL)
        )
    )

    val MELTING_FURNACE_BLOCK_ENTITY: BlockEntityType<MeltingFurnaceBlockEntity> =
        registerBlockEntity("melting_furnace_block_entity", ::MeltingFurnaceBlockEntity, MELTING_FURNACE_BLOCK)



    private fun <T : BlockEntity?> registerBlockEntity(
        name: String,
        entityFactory: BlockEntityFactory<out T>,
        block: Block
    ): BlockEntityType<T> {
        return Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            Identifier.of(Mod.MOD_ID, name),
            BlockEntityType.Builder.create(entityFactory, block).build()
        )
    }

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

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY)
            .register(ModifyEntries { entries: FabricItemGroupEntries ->
                entries.add(ROYAL_BLOCK)
                entries.add(STEAL_BLOCK)
                entries.add(ALUMINUM_BLOCK)
                entries.add(ALUMINUM_ORE)
                entries.add(ALUMINUM_DEEPSLATE_ORE)
                entries.add(MELTING_FURNACE_BLOCK)
            })
    }
}
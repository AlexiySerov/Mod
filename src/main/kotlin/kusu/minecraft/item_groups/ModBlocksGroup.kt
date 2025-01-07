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
import java.util.function.Supplier


object ModBlocksGroup {
    val MOD_ITEMS_GROUP: ItemGroup = Registry.register<ItemGroup, ItemGroup>(
        Registries.ITEM_GROUP,
        Identifier.of(Mod.MOD_ID, "mod_blocks_group"),
        FabricItemGroup.builder().icon(Supplier<ItemStack> { ItemStack(ModBlocks.ROYAL_BLOCK) })
            .displayName(Text.translatable("itemgroup.mod.mod_blocks_group"))
            .entries { displayContext: ItemGroup.DisplayContext?, entries: ItemGroup.Entries ->
                entries.add(ModBlocks.ROYAL_BLOCK)
            }.build()
    )

    fun registerItemGroup() {
        Mod.logger.info("Registering Item Groups for " + Mod.MOD_ID)
    }
}

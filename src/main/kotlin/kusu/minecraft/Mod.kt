package kusu.minecraft

import kusu.minecraft.blocks.ModBlocks
import kusu.minecraft.item_groups.ModGroups
import kusu.minecraft.items.ModItems
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Mod : ModInitializer {
    val logger = LoggerFactory.getLogger("mod")
	val MOD_ID = "mod"

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")

		ModGroups.registerItemGroups()
		ModItems.registerModItems()
		ModBlocks.registerModBlocks()
	}
}
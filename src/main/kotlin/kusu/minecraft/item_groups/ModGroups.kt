package kusu.minecraft.item_groups

object ModGroups {
    fun registerItemGroups(){
        ModRoyalItemGroup.registerItemGroup()
        ModRoyalBlocksGroup.registerItemGroup()

        ModIndustrialItemGroup.registerItemGroup()
        ModIndustrialBlockGroup.registerItemGroup()
    }
}
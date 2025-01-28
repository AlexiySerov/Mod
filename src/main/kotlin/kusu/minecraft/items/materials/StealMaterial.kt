package kusu.minecraft.items.materials

import kusu.minecraft.items.ModItems
import net.minecraft.block.Block
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.registry.tag.BlockTags
import net.minecraft.registry.tag.TagKey

class StealMaterial : ToolMaterial {
    override fun getDurability(): Int {
        return 1000
    }

    override fun getMiningSpeedMultiplier(): Float {
        return 7f
    }

    override fun getAttackDamage(): Float {
        return 70f
    }

    override fun getInverseTag(): TagKey<Block> {
        return BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    }

    override fun getEnchantability(): Int {
        return 20
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(ModItems.STEAL_INGOT)
    }

    companion object{
        val INSTANCE: StealMaterial = StealMaterial()
    }
}
package kusu.minecraft.recipes.industrial

import kusu.minecraft.blocks.ModBlocks
import kusu.minecraft.item_groups.ModIndustrialItemGroup
import kusu.minecraft.items.ModItems
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory

object IndustrialShapeRecipes {

    fun recipeNineStealIngotsToStealBlock(recipeExporter: RecipeExporter): Unit {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEAL_BLOCK, 1)
            .pattern("lll")
            .pattern("lll")
            .pattern("lll")
            .input('l', ModItems.STEAL_INGOT) // 'l' means "any log"
            .group("multi_bench") // Put it in a group called "multi_bench" - groups are shown in one slot in the recipe book
            .criterion(FabricRecipeProvider.hasItem(ModBlocks.STEAL_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.STEAL_BLOCK))
            .offerTo(recipeExporter);
    }

    fun recipeNineAluminumIngotsToAluminumBlock(recipeExporter: RecipeExporter): Unit {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALUMINUM_BLOCK, 1)
            .pattern("lll")
            .pattern("lll")
            .pattern("lll")
            .input('l', ModItems.ALUMINUM_INGOT) // 'l' means "any log"
            .group("multi_bench") // Put it in a group called "multi_bench" - groups are shown in one slot in the recipe book
            .criterion(FabricRecipeProvider.hasItem(ModBlocks.ALUMINUM_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
            .offerTo(recipeExporter);
    }
}
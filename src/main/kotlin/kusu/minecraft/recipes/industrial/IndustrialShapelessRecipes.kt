package kusu.minecraft.recipes.industrial

import kusu.minecraft.blocks.ModBlocks
import kusu.minecraft.items.ModItems
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder
import net.minecraft.recipe.book.RecipeCategory

object IndustrialShapelessRecipes {

    fun recipeStealBlockToNineStealIngot(recipeExporter: RecipeExporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEAL_INGOT, 9) // You can also specify an int to produce more than one
            .input(ModBlocks.STEAL_BLOCK)
            .criterion(
                FabricRecipeProvider.hasItem(ModBlocks.STEAL_BLOCK), FabricRecipeProvider.conditionsFromItem(
                    ModBlocks.STEAL_BLOCK))
            .offerTo(recipeExporter)
    }

    fun recipeAluminumBlockToNineAluminumIngot(recipeExporter: RecipeExporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT, 9) // You can also specify an int to produce more than one
            .input(ModBlocks.ALUMINUM_BLOCK)
            .criterion(
                FabricRecipeProvider.hasItem(ModBlocks.ALUMINUM_BLOCK), FabricRecipeProvider.conditionsFromItem(
                    ModBlocks.ALUMINUM_BLOCK))
            .offerTo(recipeExporter)
    }

}
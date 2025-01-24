package kusu.minecraft.recipes.industrial

import kusu.minecraft.blocks.ModBlocks
import kusu.minecraft.items.ModItems
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.recipe.book.RecipeCategory

object IndustrialSmeltingRecipes {

    fun recipeSmeltingAluminumOreToAluminumIngot(recipeExporter: RecipeExporter): Unit {
        FabricRecipeProvider.offerSmelting(recipeExporter,
            listOf(ModItems.ALUMINUM_ROW), // Inputs
            RecipeCategory.MISC, // Category
            ModItems.ALUMINUM_INGOT, // Output
            0.1f, // Experience
            300, // Cooking time
            "row_to_ingot" // group
        );
    }
}
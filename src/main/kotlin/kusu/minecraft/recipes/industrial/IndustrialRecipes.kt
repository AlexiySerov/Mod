package kusu.minecraft.recipes.industrial

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import java.util.concurrent.CompletableFuture

class IndustrialRecipes(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<WrapperLookup>
): FabricRecipeProvider(output, registriesFuture)  {

    override fun generate(recipeExporter: RecipeExporter) {
        generateIndustrialShapelessRecipes(recipeExporter)
        generateIndustrialShapeRecipes(recipeExporter)
        generateIndustrialSmeltingRecipes(recipeExporter)
    }

    private fun generateIndustrialShapelessRecipes(recipeExporter: RecipeExporter) {
        IndustrialShapelessRecipes.recipeStealBlockToNineStealIngot(recipeExporter)
    }

    private fun generateIndustrialShapeRecipes(recipeExporter: RecipeExporter) {
        IndustrialShapeRecipes.recipeNineStealIngotsToStealBlock(recipeExporter)
        IndustrialShapeRecipes.recipeNineAluminumIngotsToAluminumBlock(recipeExporter)
    }

    private fun generateIndustrialSmeltingRecipes(recipeExporter: RecipeExporter) {
        IndustrialSmeltingRecipes.recipeSmeltingAluminumOreToAluminumIngot(recipeExporter)
    }

}

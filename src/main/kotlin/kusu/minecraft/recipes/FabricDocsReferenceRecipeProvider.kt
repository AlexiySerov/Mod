package kusu.minecraft.recipes

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import java.util.concurrent.CompletableFuture


class FabricDocsReferenceRecipeProvider(
    output: FabricDataOutput?,
    registriesFuture: CompletableFuture<WrapperLookup?>?
) : FabricRecipeProvider(output, registriesFuture) {

    override fun generate(recipeExporter: RecipeExporter) {
    }
}
package kusu.minecraft.generation.recipes.industrial

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
            .input('l', ModItems.STEAL_INGOT)
            .group("multi_bench")
            .criterion(FabricRecipeProvider.hasItem(ModBlocks.STEAL_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.STEAL_BLOCK))
            .offerTo(recipeExporter);
    }

    fun recipeNineAluminumIngotsToAluminumBlock(recipeExporter: RecipeExporter): Unit {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALUMINUM_BLOCK, 1)
            .pattern("lll")
            .pattern("lll")
            .pattern("lll")
            .input('l', ModItems.ALUMINUM_INGOT)
            .group("multi_bench")
            .criterion(FabricRecipeProvider.hasItem(ModBlocks.ALUMINUM_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
            .offerTo(recipeExporter);
    }

    fun recipeStealSword(recipeExporter: RecipeExporter): Unit {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEAL_SWORD, 1)
            .pattern("s")
            .pattern("s")
            .pattern("w")
            .input('s', ModItems.STEAL_INGOT)
            .input('w', Items.STICK)
            .group("multi_bench")
            .criterion(FabricRecipeProvider.hasItem(ModItems.STEAL_SWORD), FabricRecipeProvider.conditionsFromItem(ModItems.STEAL_SWORD))
            .offerTo(recipeExporter);
    }

    fun recipeStealPickaxe(recipeExporter: RecipeExporter): Unit {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEAL_PICKAXE, 1)
            .pattern("sss")
            .pattern(" w ")
            .pattern(" w ")
            .input('s', ModItems.STEAL_INGOT)
            .input('w', Items.STICK)
            .group("multi_bench")
            .criterion(FabricRecipeProvider.hasItem(ModItems.STEAL_PICKAXE), FabricRecipeProvider.conditionsFromItem(ModItems.STEAL_PICKAXE))
            .offerTo(recipeExporter);
    }

    fun recipeStealAxe(recipeExporter: RecipeExporter): Unit {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEAL_PICKAXE, 1)
            .pattern(" ss")
            .pattern(" ws")
            .pattern(" w ")
            .input('s', ModItems.STEAL_INGOT)
            .input('w', Items.STICK)
            .group("multi_bench")
            .criterion(FabricRecipeProvider.hasItem(ModItems.STEAL_PICKAXE), FabricRecipeProvider.conditionsFromItem(ModItems.STEAL_PICKAXE))
            .offerTo(recipeExporter);
    }

    fun recipeStealHoe(recipeExporter: RecipeExporter): Unit {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEAL_PICKAXE, 1)
            .pattern(" ss")
            .pattern(" w ")
            .pattern(" w ")
            .input('s', ModItems.STEAL_INGOT)
            .input('w', Items.STICK)
            .group("multi_bench")
            .criterion(FabricRecipeProvider.hasItem(ModItems.STEAL_PICKAXE), FabricRecipeProvider.conditionsFromItem(ModItems.STEAL_PICKAXE))
            .offerTo(recipeExporter);
    }

    fun recipeStealShovel(recipeExporter: RecipeExporter): Unit {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEAL_PICKAXE, 1)
            .pattern("s")
            .pattern("w")
            .pattern("w")
            .input('s', ModItems.STEAL_INGOT)
            .input('w', Items.STICK)
            .group("multi_bench")
            .criterion(FabricRecipeProvider.hasItem(ModItems.STEAL_PICKAXE), FabricRecipeProvider.conditionsFromItem(ModItems.STEAL_PICKAXE))
            .offerTo(recipeExporter);
    }
}
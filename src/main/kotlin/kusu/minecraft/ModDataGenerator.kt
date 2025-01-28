package kusu.minecraft

import kusu.minecraft.generation.recipes.industrial.IndustrialRecipes
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

class ModDataGenerator: DataGeneratorEntrypoint {



    override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
        val pack: FabricDataGenerator.Pack = fabricDataGenerator.createPack()
        pack.addProvider(::IndustrialRecipes)
    }

}
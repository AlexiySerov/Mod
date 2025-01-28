package kusu.minecraft.blocks.industrial

import com.mojang.serialization.MapCodec
import kusu.minecraft.blocks.ModBlocks
import net.minecraft.block.BlockEntityProvider
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.ActionResult
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class MeltingFurnaceBlockEntity(pos: BlockPos, state: BlockState) : BlockEntity(ModBlocks.MELTING_FURNACE_BLOCK_ENTITY, pos, state)  {


}
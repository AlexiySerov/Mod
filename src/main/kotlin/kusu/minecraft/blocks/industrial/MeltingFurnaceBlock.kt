package kusu.minecraft.blocks.industrial

import com.mojang.serialization.MapCodec
import net.minecraft.block.BlockEntityProvider
import net.minecraft.block.BlockRenderType
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.ActionResult
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World


class MeltingFurnaceBlock(settings: Settings) : BlockWithEntity(settings), BlockEntityProvider {


    override fun onUse(
        state: BlockState?,
        world: World?,
        pos: BlockPos?,
        player: PlayerEntity?,
        hit: BlockHitResult?
    ): ActionResult {

        return super.onUse(state, world, pos, player, hit)
    }

    override fun getCodec(): MapCodec<out BlockWithEntity> {
        return createCodec(::MeltingFurnaceBlock)
    }

    override fun getRenderType(state: BlockState?): BlockRenderType {
        return BlockRenderType.MODEL
    }

    override fun createBlockEntity(pos: BlockPos, state: BlockState): BlockEntity? {
        return MeltingFurnaceBlockEntity(pos, state)
    }
}
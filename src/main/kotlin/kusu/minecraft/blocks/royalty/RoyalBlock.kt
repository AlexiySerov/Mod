package kusu.minecraft.blocks.royalty

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.text.Text
import net.minecraft.util.ActionResult
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class RoyalBlock(private val settings: Settings): Block(settings) {

    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos,
        player: PlayerEntity,
        hit: BlockHitResult
    ): ActionResult {
        if (!world.isClient) {
            player.sendMessage(
                Text.of("Hello, world!"), false);
        }

        return ActionResult.SUCCESS;

    }
}
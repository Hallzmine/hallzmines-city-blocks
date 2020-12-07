package ga.hallzmine.cityblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class StopSignBlock extends OrientableBlockBase {
    public StopSignBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return (VoxelShape) Block.makeCuboidShape(7,-16,7,9,32,9);
    }

}

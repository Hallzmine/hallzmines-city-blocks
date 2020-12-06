package ga.hallzmine.cityblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;

import javax.annotation.Nullable;

public class OrientableSlabBlockBase extends SlabBlock {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape BOTTOM_SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape TOP_SHAPE = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    public OrientableSlabBlockBase(Block.Properties properties) {
        super(properties);
        this.setDefaultState(this.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {

        BlockPos blockpos = context.getPos();
        BlockState blockstate = context.getWorld().getBlockState(blockpos);
        if (blockstate.getBlock() == this) {
            return blockstate.with(TYPE, SlabType.DOUBLE).with(WATERLOGGED, Boolean.valueOf(false)).with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        } else {
            IFluidState ifluidstate = context.getWorld().getFluidState(blockpos);
            BlockState blockstate1 = this.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER)).with(FACING, context.getPlacementHorizontalFacing().getOpposite());
            Direction direction = context.getFace();
            return direction != Direction.DOWN && (direction == Direction.UP || !(context.getHitVec().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.with(TYPE, SlabType.TOP);
        }
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    public boolean isTransparent(BlockState state) {
        return state.get(TYPE) != SlabType.DOUBLE;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, FACING);
    }
}

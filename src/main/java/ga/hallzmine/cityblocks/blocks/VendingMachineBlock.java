package ga.hallzmine.cityblocks.blocks;

import ga.hallzmine.cityblocks.PacketHandler;
import ga.hallzmine.cityblocks.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import java.util.Collections;

public class VendingMachineBlock extends OrientableBlockBase {

    private ItemStack stack;
    private int id;

    public VendingMachineBlock() {
        super(Properties.create(Material.IRON).notSolid());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return (VoxelShape) Block.makeCuboidShape(0,0,0,16,32,16);
    }
    /*
    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        this.id++;
        this.stack = new ItemStack(RegistryHandler.ROAD_BLANK_ITEM.get(), 1);
        SimpleNamedContainerProvider container = new SimpleNamedContainerProvider((id, playerInventory, entity) -> new VendingMachineContainer(), ITextComponent.getTextComponentOrEmpty("Vending Machine"));
        Container menu = container.createMenu(5391, player.inventory, player);
        Inventory inventory = new Inventory(27);
        menu.inventorySlots.add(0,new Slot(inventory, 0, 0, 0));
        inventory.addItem(stack);
        player.openContainer(container);

        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
     */
}

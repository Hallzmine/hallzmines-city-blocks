package ga.hallzmine.cityblocks;

import ga.hallzmine.cityblocks.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CityBlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CityBlocksMod.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> ROAD_BLANK = BLOCKS.register("road_blank", () -> new BlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_BLANK_ITEM = ITEMS.register("road_blank", () -> new BlockItemBase(ROAD_BLANK.get()));

    public static final RegistryObject<Block> ROAD_SOLID = BLOCKS.register("road_solid", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_SOLID_ITEM = ITEMS.register("road_solid", () -> new BlockItemBase(ROAD_SOLID.get()));

    public static final RegistryObject<Block> ROAD_BROKEN = BLOCKS.register("road_broken", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_BROKEN_ITEM = ITEMS.register("road_broken", () -> new BlockItemBase(ROAD_BROKEN.get()));

    public static final RegistryObject<Block> SANDBAG = BLOCKS.register("sandbag", () -> new BlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> SANDBAG_ITEM = ITEMS.register("sandbag", () -> new BlockItemBase(SANDBAG.get()));

    public static final RegistryObject<Block> SANDBAG_SLAB = BLOCKS.register("sandbag_slab", () -> new SlabBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> SANDBAG_SLAB_ITEM = ITEMS.register("sandbag_slab", () -> new BlockItemBase(SANDBAG_SLAB.get()));

    public static final RegistryObject<Block> ROAD_BLANK_SLAB = BLOCKS.register("road_blank_slab", () -> new SlabBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_BLANK_SLAB_ITEM = ITEMS.register("road_blank_slab", () -> new BlockItemBase(ROAD_BLANK_SLAB.get()));

    public static final RegistryObject<Block> ROAD_BROKEN_SLAB = BLOCKS.register("road_broken_slab", () -> new OrientableSlabBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_BROKEN_SLAB_ITEM = ITEMS.register("road_broken_slab", () -> new BlockItemBase(ROAD_BROKEN_SLAB.get()));

    public static final RegistryObject<Block> ROAD_SOLID_SLAB = BLOCKS.register("road_solid_slab", () -> new OrientableSlabBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_SOLID_SLAB_ITEM = ITEMS.register("road_solid_slab", () -> new BlockItemBase(ROAD_SOLID_SLAB.get()));

    public static final RegistryObject<Block> STOP_SIGN = BLOCKS.register("stop_sign", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid()));
    public static final RegistryObject<Item> STOP_SIGN_ITEM = ITEMS.register("stop_sign", () -> new BlockItemBase(STOP_SIGN.get()));

    public static final RegistryObject<Block> ROAD_BARRIER = BLOCKS.register("road_barrier", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid()));
    public static final RegistryObject<Item> ROAD_BARRIER_ITEM = ITEMS.register("road_barrier", () -> new BlockItemBase(ROAD_BARRIER.get()));

    public static final RegistryObject<Block> POLE_BARRIER = BLOCKS.register("pole_barrier", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid().variableOpacity()));
    public static final RegistryObject<Item> POLE_BARRIER_ITEM = ITEMS.register("pole_barrier", () -> new BlockItemBase(POLE_BARRIER.get()));

    public static final RegistryObject<Block> STEEL_POLE_BARRIER = BLOCKS.register("steel_pole_barrier", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid()));
    public static final RegistryObject<Item> STEEL_POLE_BARRIER_ITEM = ITEMS.register("steel_pole_barrier", () -> new BlockItemBase(STEEL_POLE_BARRIER.get()));

    public static final RegistryObject<Block> POLE_BARRIER_UNLIT = BLOCKS.register("pole_barrier_unlit", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid()));
    public static final RegistryObject<Item> POLE_BARRIER_UNLIT_ITEM = ITEMS.register("pole_barrier_unlit", () -> new BlockItemBase(POLE_BARRIER_UNLIT.get()));

    public static final RegistryObject<Block> CONCRETE_BARRIER = BLOCKS.register("concrete_barrier", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid()));
    public static final RegistryObject<Item> CONCRETE_BARRIER_ITEM = ITEMS.register("concrete_barrier", () -> new BlockItemBase(CONCRETE_BARRIER.get()));

    public static final RegistryObject<Block> STRIPED_CONCRETE_BARRIER = BLOCKS.register("striped_concrete_barrier", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid()));
    public static final RegistryObject<Item> STRIPED_CONCRETE_BARRIER_ITEM = ITEMS.register("striped_concrete_barrier", () -> new BlockItemBase(STRIPED_CONCRETE_BARRIER.get()));
}

package net.jotinha.jmod.block;

import net.jotinha.jmod.Jmain;
import net.jotinha.jmod.block.custom.RiaxoIce;
import net.jotinha.jmod.item.ModItemGroup;
import net.jotinha.jmod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Jmain.MOD_ID);


    public static final RegistryObject<Block> RIAXO_ORE = registerBlock("riaxo_ore",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .setRequiresTool()
                    .hardnessAndResistance(2f)));

    public static final RegistryObject<Block> RIAXO_LOG = registerBlock("riaxo_log",
            ()-> new Block(AbstractBlock.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2f)));

    public static final RegistryObject<Block> RIAXO_PLANKS = registerBlock("riaxo_planks",
            ()-> new Block (AbstractBlock.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(3f)));

    public static final RegistryObject<Block> RIAXO_INGOT_BLOCK = registerBlock("riaxo_ingot_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(3f)));

    public static final RegistryObject<Block> RIAXO_PLANKS_STAIRS = registerBlock("riaxo_planks_stairs",
            () -> new StairsBlock(() -> RIAXO_PLANKS.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.WOOD)
                    .harvestTool(ToolType.AXE)
                    .harvestLevel(2)
                    .hardnessAndResistance(3)));


    public static final RegistryObject<Block> RIAXO_PLANKS_FENCE = registerBlock("riaxo_planks_fence",
            ()-> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3)));


    public static final RegistryObject<Block> RIAXO_PLANKS_SLAB = registerBlock("riaxo_planks_slab",
            ()-> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3)));
    public static final RegistryObject<Block> RIAXO_PLANKS_BUTTON= registerBlock("riaxo_planks_button",
            ()-> new WoodButtonBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .doesNotBlockMovement()
                    .sound(SoundType.WOOD)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(1f)));
    public static final RegistryObject<Block> RIAXO_PLANKS_PRESSURE_PLATE = registerBlock("riaxo_planks_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(1.5f)));

    public static final RegistryObject<Block> RIAXO_PLANKS_DOOR = registerBlock("riaxo_planks_door",
            ()-> new DoorBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .notSolid()
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(1.5f)));

    public static final RegistryObject<Block> RIAXO_PLANKS_TRAPDOOR = registerBlock("riaxo_planks_trapdoor",
            ()-> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .notSolid()
                    .sound(SoundType.WOOD)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(1.5f)));


    public static final RegistryObject<Block> RIAXO_PLANKS_FENCE_GATE = registerBlock("riaxo_planks_fence_gate",
            ()-> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .harvestTool(ToolType.AXE)
                    .hardnessAndResistance(2f)));



    public static final RegistryObject<Block> RIAXO_ICE = registerBlock("riaxo_ice",
            ()-> new RiaxoIce(AbstractBlock.Properties.create(Material.ICE)
                   // .slipperiness(0.6f)
                    //.notSolid()
                    .sound(SoundType.GLASS)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlcokItem(name, toReturn);




        return toReturn;
    }

    private static <T extends  Block> void  registerBlcokItem(String name, RegistryObject<T> block ){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.J_GROUP)));
    }




    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}

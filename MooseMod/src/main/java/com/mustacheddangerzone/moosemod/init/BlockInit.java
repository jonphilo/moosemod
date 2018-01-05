package com.mustacheddangerzone.moosemod.init;


import com.mustacheddangerzone.moosemod.objects.Blocks.BlockBase;
import com.mustacheddangerzone.moosemod.objects.Blocks.BlockGlassPaneBase;
import com.mustacheddangerzone.moosemod.objects.Blocks.BlockStairsBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;


import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
    public static final BlockStairs STAIRS_COPPER = new BlockStairsBase("stairs_copper", BLOCK_COPPER.getDefaultState());
    public static final BlockPane GLASS_PANE_WOOD = new BlockGlassPaneBase("glass_pane_wood");
}

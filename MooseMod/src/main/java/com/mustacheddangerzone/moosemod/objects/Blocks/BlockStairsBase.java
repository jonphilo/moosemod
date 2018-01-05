package com.mustacheddangerzone.moosemod.objects.Blocks;

import com.mustacheddangerzone.moosemod.MooseMod;
import com.mustacheddangerzone.moosemod.init.BlockInit;
import com.mustacheddangerzone.moosemod.init.ItemInit;
import com.mustacheddangerzone.moosemod.objects.Interfaces.IMooseModel;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockStairsBase extends BlockStairs implements IMooseModel{
    public BlockStairsBase(String name, IBlockState modelState) {
        super(modelState);
        setUnlocalizedName(name);
        setRegistryName(name);
        useNeighborBrightness = true;
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BlockInit.BLOCKS.add(this);

        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        MooseMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}


package com.mustacheddangerzone.moosemod.objects.Blocks;

import com.mustacheddangerzone.moosemod.MooseMod;
import com.mustacheddangerzone.moosemod.init.BlockInit;
import com.mustacheddangerzone.moosemod.init.ItemInit;
import com.mustacheddangerzone.moosemod.objects.Interfaces.IMooseModel;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockGlassPaneBase extends BlockPane implements IMooseModel
{
    public BlockGlassPaneBase(String name)
    {
        super(Material.GLASS, false);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.DECORATIONS);

        BlockInit.BLOCKS.add(this);

        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }


    @Override
    public void registerModels() {
        MooseMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}

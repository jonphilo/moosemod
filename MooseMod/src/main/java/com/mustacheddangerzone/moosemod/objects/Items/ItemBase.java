package com.mustacheddangerzone.moosemod.objects.Items;

import com.mustacheddangerzone.moosemod.MooseMod;
import com.mustacheddangerzone.moosemod.init.ItemInit;
import com.mustacheddangerzone.moosemod.objects.Interfaces.IMooseModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IMooseModel
{

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        MooseMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}

package com.mustacheddangerzone.moosemod.init;


import com.mustacheddangerzone.moosemod.objects.Items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
}

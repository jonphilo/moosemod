package com.mustacheddangerzone.moosemod;

import com.mustacheddangerzone.moosemod.proxy.CommonProxy;
import com.mustacheddangerzone.moosemod.utils.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.NAME, version = Constants.VERSION)
public class MooseMod {

    @Mod.Instance
    public static MooseMod instance;

    @SidedProxy(clientSide = Constants.CLIENTPROXY, serverSide = Constants.COMMONPROXY)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

    }
}

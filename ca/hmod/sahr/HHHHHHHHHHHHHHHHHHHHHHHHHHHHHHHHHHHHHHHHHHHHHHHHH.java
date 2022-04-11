//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import java.awt.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.client.*;
import net.minecraft.command.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.network.*;

@Mod(modid = "AutoGG", version = "2.0.4", useMetadata = true, clientSideOnly = true, acceptedMinecraftVersions = "1.8.9")
public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private static HHHHH api;
    private static Minecraft mc;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH module_manager;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH module;
    public static Color color;
    private static String server;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH ap;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH timer2;
    private static HHHHHHHHHH gui;
    
    @Mod.EventHandler
    public void fmlInitialization(final FMLInitializationEvent fmlInitializationEvent) {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule((Class)H.class).setState(true);
        MinecraftForge.EVENT_BUS.register((Object)this);
        FMLCommonHandler.instance().bus().register((Object)this);
        ClientCommandHandler.instance.registerCommand((ICommand)new HHHHHHHHHHH());
        ClientCommandHandler.instance.registerCommand((ICommand)new HHHHHHHHHHHHHHHHH());
        ClientCommandHandler.instance.registerCommand((ICommand)new HHHHHHHHHHHHH());
    }
    
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH getAp() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.ap == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.ap = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.ap;
    }
    
    @SubscribeEvent
    public void tick(final InputEvent.KeyInputEvent keyInputEvent) {
        if (Minecraft.getMinecraft().thePlayer == null) {
            return;
        }
        if (!Keyboard.getEventKeyState()) {
            return;
        }
        for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : getModuleManager().getModules()) {
            if (hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getKey() == Keyboard.getEventKey() && hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getKey() != 0) {
                hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.setState(!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getState());
            }
        }
    }
    
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH getModuleManager() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.module_manager == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.module_manager = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.module_manager;
    }
    
    public static HHHHHHHHHH getGui() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.gui == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.gui = new HHHHHHHHHH();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.gui;
    }
    
    public static Color getColor() {
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.color;
    }
    
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH getTimer() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.timer2 == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.timer2 = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.timer2;
    }
    
    public static String getServer() {
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.server;
    }
    
    public static HHHHH getApi() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.api == null) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.api = new HHHHH();
        }
        return HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.api;
    }
    
    @SubscribeEvent
    public void tick(final FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.server = clientConnectedToServerEvent.manager.getRemoteAddress().toString();
    }
}

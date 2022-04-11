//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import java.util.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.*;
import net.minecraft.network.play.server.*;

public abstract class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private boolean state;
    private int key;
    private Category category;
    private ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH> values;
    private String name;
    protected static Minecraft mc;
    private ArrayList<HHHHHHH> booleans;
    private boolean Toggled;
    private boolean enabled;
    
    public void onEnable() {
    }
    
    public void setKey(final int key) {
        this.key = key;
    }
    
    public void setup() {
    }
    
    public void onDestroyEntities(final S13PacketDestroyEntities s13PacketDestroyEntities) {
    }
    
    public String getName() {
        return this.name;
    }
    
    public static ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH> getCategoryModules(final Category category) {
        final ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH> list = new ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH>();
        for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH e : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
            if (e.getCategory() == category) {
                list.add(e);
            }
        }
        return list;
    }
    
    public void toggle() {
        this.setState(!this.state);
    }
    
    public ArrayList<HHHHHHH> getBooleans() {
        return this.booleans;
    }
    
    public Category getCategory() {
        return this.category;
    }
    
    public void onDisable() {
    }
    
    public void addBoolean(final HHHHHHH e) {
        this.booleans.add(e);
    }
    
    public boolean isEnabled() {
        return this.enabled;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public S18PacketEntityTeleport onEntityTeleport(final S18PacketEntityTeleport s18PacketEntityTeleport) {
        return s18PacketEntityTeleport;
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH(final String name, final int key, final Category category) {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc = Minecraft.getMinecraft();
        this.booleans = new ArrayList<HHHHHHH>();
        this.values = new ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH>();
        this.name = name;
        this.key = key;
        this.state = false;
        this.category = category;
    }
    
    public int getKey() {
        return this.key;
    }
    
    public void setState(final boolean state) {
        if (this.state == state) {
            return;
        }
        this.state = state;
        if (state) {
            MinecraftForge.EVENT_BUS.register((Object)this);
            FMLCommonHandler.instance().bus().register((Object)this);
            this.onEnable();
        }
        else {
            MinecraftForge.EVENT_BUS.unregister((Object)this);
            FMLCommonHandler.instance().bus().unregister((Object)this);
            this.onDisable();
        }
    }
    
    public void addValue(final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH e) {
        this.values.add(e);
    }
    
    public boolean onRelativeMove(final S14PacketEntity s14PacketEntity) {
        return false;
    }
    
    public void update() {
    }
    
    public boolean setToggled(final boolean state) {
        return this.state = state;
    }
    
    public boolean getState() {
        return this.state;
    }
    
    public boolean isToggle() {
        return this.Toggled;
    }
    
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH getModule(final Class<? extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH> clazz) {
        for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
            if (hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getClass() == clazz) {
                return hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh;
            }
        }
        return null;
    }
    
    public ArrayList<HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH> getValues() {
        return this.values;
    }
    
    public enum Modules
    {
        private static final Modules[] $VALUES;
        
        ClickGUI, 
        Destruct, 
        Hud;
        
        static {
            $VALUES = new Modules[] { Modules.ClickGUI, Modules.Hud, Modules.Destruct };
        }
    }
    
    public enum Category
    {
        Player;
        
        private static final Category[] $VALUES;
        
        Blatant, 
        Other, 
        Ghost;
        
        static {
            $VALUES = new Category[] { Category.Ghost, Category.Blatant, Category.Player, Category.Other };
        }
    }
}

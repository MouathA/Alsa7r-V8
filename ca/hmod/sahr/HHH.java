//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.util.*;
import java.util.function.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;

public class HHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH remove;
    private HHHHHHH add;
    private static List<String> friends;
    private HHHHHHH list;
    
    private static void lambda$listFriend$0(final String str) {
        HHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + str));
    }
    
    public static void removeFriend(final String s) {
        if (isFriend(s)) {
            HHH.friends.remove(s.toLowerCase());
            HHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + s + EnumChatFormatting.RED + " was removed from your friend list."));
        }
        else {
            HHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + s + EnumChatFormatting.RED + " is not in your friend list."));
        }
    }
    
    public HHH() {
        super("Friend", 0, Category.Other);
        this.add = new HHHHHHH("Add", true);
        this.remove = new HHHHHHH("Remove", false);
        this.list = new HHHHHHH("List", false);
        this.addBoolean(this.add);
        this.addBoolean(this.remove);
        this.addBoolean(this.list);
    }
    
    public static boolean isFriend(final String s) {
        return HHH.friends.contains(s.toLowerCase());
    }
    
    public static void addFriend(final String s) {
        if (!isFriend(s)) {
            HHH.friends.add(s.toLowerCase());
            HHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + s + EnumChatFormatting.GREEN + " added into your friend list."));
        }
        else {
            HHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + s + EnumChatFormatting.RED + " already in your friend list."));
        }
    }
    
    @Override
    public void onEnable() {
        if (this.list.getState()) {
            listFriend();
        }
        super.onEnable();
    }
    
    public static void listFriend() {
        if (!HHH.friends.isEmpty()) {
            HHH.friends.forEach(HHH::lambda$listFriend$0);
        }
        else {
            HHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] you don't have any friends, don't be sad :("));
        }
    }
    
    @SubscribeEvent
    public void tick(final AttackEntityEvent attackEntityEvent) {
        if (attackEntityEvent.target instanceof EntityPlayer) {
            if (this.add.getState()) {
                addFriend(attackEntityEvent.target.getName());
            }
            else if (this.remove.getState()) {
                removeFriend(attackEntityEvent.target.getName());
            }
            else {
                HHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + EnumChatFormatting.RED + "Please specify your option, choose <Add, Remove>"));
            }
            HHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] Friend mod turned off, if you want to add more friend turn it on :)"));
            this.setState(false);
        }
    }
    
    static {
        HHH.friends = new ArrayList<String>();
    }
}

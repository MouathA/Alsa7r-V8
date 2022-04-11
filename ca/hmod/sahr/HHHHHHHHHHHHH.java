//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import net.minecraft.command.*;
import java.util.*;
import net.minecraft.util.*;

public class HHHHHHHHHHHHH implements ICommand
{
    private Minecraft mc;
    
    public void processCommand(final ICommandSender commandSender, final String[] array) throws CommandException {
        this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("Name: AlSa7r\nVersion: v9.3\nDev: adam\nChannel: https://www.youtube.com/channel/UCw8DJ7NY1rSFKuAHYvhum3A"));
    }
    
    public String getCommandName() {
        return "$info";
    }
    
    public int compareTo(final ICommand command) {
        return 0;
    }
    
    public List<String> getCommandAliases() {
        final ArrayList<String> list = new ArrayList<String>();
        list.add("$info");
        return list;
    }
    
    public List<String> addTabCompletionOptions(final ICommandSender commandSender, final String[] array, final BlockPos blockPos) {
        return null;
    }
    
    public boolean canCommandSenderUseCommand(final ICommandSender commandSender) {
        return true;
    }
    
    public boolean isUsernameIndex(final String[] array, final int n) {
        return false;
    }
    
    public HHHHHHHHHHHHH() {
        this.mc = Minecraft.getMinecraft();
    }
    
    public String getCommandUsage(final ICommandSender commandSender) {
        return "/$info";
    }
    
    public int compareTo(final Object o) {
        return this.compareTo((ICommand)o);
    }
}

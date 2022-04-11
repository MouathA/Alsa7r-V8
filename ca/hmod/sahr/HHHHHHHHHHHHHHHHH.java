//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import net.minecraft.util.*;
import net.minecraft.command.*;
import java.util.*;

public class HHHHHHHHHHHHHHHHH implements ICommand
{
    private Minecraft mc;
    
    public List<String> addTabCompletionOptions(final ICommandSender commandSender, final String[] array, final BlockPos blockPos) {
        return null;
    }
    
    public int compareTo(final Object o) {
        return this.compareTo((ICommand)o);
    }
    
    public String getCommandUsage(final ICommandSender commandSender) {
        return "/$f <add, remove, list> <name>";
    }
    
    public void processCommand(final ICommandSender commandSender, final String[] array) throws CommandException {
        if (array.length == 2) {
            if (array[0].equalsIgnoreCase("add")) {
                HHH.addFriend(array[1]);
            }
            else if (array[0].equalsIgnoreCase("remove")) {
                HHH.removeFriend(array[1]);
            }
        }
        else if (array.length == 1) {
            if (array[0].equalsIgnoreCase("list")) {
                HHH.listFriend();
            }
        }
        else {
            this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] invalid command, " + this.getCommandUsage(commandSender)));
        }
    }
    
    public boolean canCommandSenderUseCommand(final ICommandSender commandSender) {
        return true;
    }
    
    public boolean isUsernameIndex(final String[] array, final int n) {
        return false;
    }
    
    public String getCommandName() {
        return "$friend";
    }
    
    public int compareTo(final ICommand command) {
        return 0;
    }
    
    public HHHHHHHHHHHHHHHHH() {
        this.mc = Minecraft.getMinecraft();
    }
    
    public List<String> getCommandAliases() {
        final ArrayList<String> list = new ArrayList<String>();
        list.add("$f");
        return list;
    }
}

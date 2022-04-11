//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import net.minecraft.util.*;
import java.util.*;
import java.io.*;
import net.minecraft.command.*;

public class HHHHHHHHHHH implements ICommand
{
    private File[] file;
    private final String prefix = "[AlSa7r] ";
    private Minecraft mc;
    
    public int compareTo(final Object o) {
        return this.compareTo((ICommand)o);
    }
    
    public String getCommandUsage(final ICommandSender commandSender) {
        return EnumChatFormatting.RED + "$config <load/remove/save> <name>";
    }
    
    private void saveCfg(final File file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
            final FileWriter fileWriter = new FileWriter(file);
            for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
                for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getValues()) {
                    fileWriter.write(hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getName() + ":" + hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getKey() + ":" + hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getState() + ":" + hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getName() + ":" + hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getValue() + "\n");
                }
                for (final HHHHHHH hhhhhhh : hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getBooleans()) {
                    fileWriter.write(hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getName() + ":" + hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getKey() + ":" + hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getState() + ":" + hhhhhhh.getName() + ":" + hhhhhhh.getState() + "\n");
                }
            }
            fileWriter.close();
            this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + EnumChatFormatting.GREEN + "config successfully created."));
            return;
        }
        this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + EnumChatFormatting.RED + "this config already exists, choose another name."));
    }
    
    public int compareTo(final ICommand command) {
        return 0;
    }
    
    public List<String> addTabCompletionOptions(final ICommandSender commandSender, final String[] array, final BlockPos blockPos) {
        return null;
    }
    
    private void removeCfg(final File file) {
        if (file.exists()) {
            file.delete();
            this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + EnumChatFormatting.GREEN + "config successfully removed."));
        }
        else {
            this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + EnumChatFormatting.RED + "this config does not exists, choose another name."));
        }
    }
    
    public List<String> getCommandAliases() {
        final ArrayList<String> list = new ArrayList<String>();
        list.add("$cnfg");
        return list;
    }
    
    public boolean canCommandSenderUseCommand(final ICommandSender commandSender) {
        return true;
    }
    
    private void loadCfg(final File file) throws IOException {
        if (!file.exists()) {
            this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + EnumChatFormatting.RED + "this config does not exists, choose another name."));
            return;
        }
        final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            final String[] split = line.split(":");
            for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
                if (hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getName().equalsIgnoreCase("clickgui")) {
                    continue;
                }
                if (!split[0].equalsIgnoreCase(hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getName())) {
                    continue;
                }
                hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.setKey(Integer.parseInt(split[1]));
                hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.setState(Boolean.parseBoolean(split[2]));
                for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getValues()) {
                    if (split[3].equalsIgnoreCase(hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getName())) {
                        hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.setValue(Double.parseDouble(split[4]));
                    }
                }
                for (final HHHHHHH hhhhhhh : hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getBooleans()) {
                    if (split[3].equalsIgnoreCase(hhhhhhh.getName())) {
                        hhhhhhh.setState(Boolean.parseBoolean(split[4]));
                    }
                }
            }
        }
        bufferedReader.close();
        this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + EnumChatFormatting.GREEN + file.getName().replaceAll(".cfg", "") + " config successfully loaded"));
    }
    
    public HHHHHHHHHHH() {
        this.mc = Minecraft.getMinecraft();
        (this.file = new File[2])[0] = new File(this.mc.mcDataDir + "\\AlSa7r");
        if (this.file[0].mkdir()) {
            System.out.println("[AlSa7r] Configs file created.");
        }
    }
    
    public boolean isUsernameIndex(final String[] array, final int n) {
        return false;
    }
    
    public String getCommandName() {
        return "$cfg";
    }
    
    public void processCommand(final ICommandSender commandSender, final String[] array) throws CommandException {
        if (array.length == 2) {
            if (array[0].equalsIgnoreCase("save")) {
                this.file[1] = new File(this.file[0].getAbsolutePath() + "\\" + array[1] + ".cfg");
                try {
                    this.saveCfg(this.file[1]);
                }
                catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else if (array[0].equalsIgnoreCase("load")) {
                this.file[1] = new File(this.file[0].getAbsolutePath() + "\\" + array[1] + ".cfg");
                try {
                    this.loadCfg(this.file[1]);
                }
                catch (IOException ex2) {
                    ex2.printStackTrace();
                }
            }
            else if (array[0].equalsIgnoreCase("remove")) {
                this.removeCfg(this.file[1] = new File(this.file[0].getAbsolutePath() + "\\" + array[1] + ".cfg"));
            }
        }
        else {
            this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] " + EnumChatFormatting.RED + "invalid command," + this.getCommandUsage(commandSender)));
        }
    }
}

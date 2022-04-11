//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import java.util.*;
import net.minecraft.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.net.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private Minecraft mc;
    private ArrayList<String> mine;
    public long previousMS;
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        this.mine = new ArrayList<String>();
        this.mc = Minecraft.getMinecraft();
        this.previousMS = 0L;
    }
    
    public Timer timer() {
        try {
            final Field declaredField = Minecraft.class.getDeclaredField(new String(new char[] { 't', 'i', 'm', 'e', 'r' }));
            declaredField.setAccessible(true);
            return (Timer)declaredField.get(this.mc);
        }
        catch (Exception ex) {
            try {
                final Field declaredField2 = Minecraft.class.getDeclaredField(new String(new char[] { 'f', 'i', 'e', 'l', 'd', '_', '7', '1', '4', '2', '8', '_', 'T' }));
                declaredField2.setAccessible(true);
                return (Timer)declaredField2.get(this.mc);
            }
            catch (Exception ex2) {
                return null;
            }
        }
    }
    
    public long getTime() {
        return System.nanoTime() / 1000000L;
    }
    
    public void set(final String s) {
        if (s.equalsIgnoreCase("mods")) {
            try {
                final URLConnection openConnection = new URL("https://blocksmc.com/players").openConnection();
                openConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
                openConnection.connect();
                final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openConnection.getInputStream()));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains("class=\"player-card-sm\"") && !this.get("mods").contains(line.substring(line.indexOf("tle=\"") + 5, line.lastIndexOf("\"")))) {
                        this.get("mods").add(line.substring(line.indexOf("tle=\"") + 5, line.lastIndexOf("\"")));
                    }
                }
                bufferedReader.close();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else {
            System.out.println("error");
        }
    }
    
    public boolean is_time_over(final double n) {
        return this.getTime() - this.previousMS >= n;
    }
    
    public void reset_timer() {
        this.timer().timerSpeed = 1.0f;
    }
    
    public void reset() {
        this.previousMS = this.getTime();
    }
    
    public ArrayList<String> get(final String s) {
        if (s.equalsIgnoreCase("mods")) {
            return this.mine;
        }
        return null;
    }
}

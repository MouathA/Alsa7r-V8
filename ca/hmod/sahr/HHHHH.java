//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;

public class HHHHH
{
    public Minecraft getMinecraft() {
        return Minecraft.getMinecraft();
    }
    
    public void drawCenteredString(final String s, final int n, final int n2, final int n3) {
        this.getMinecraft().fontRendererObj.drawString(s, n - this.getMinecraft().fontRendererObj.getStringWidth(s) / 2, n2, n3);
    }
}

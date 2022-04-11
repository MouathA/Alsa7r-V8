//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.client.event.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import java.awt.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    public HHHHHHHHHHHHHHHHHHHHHHHHHH() {
        super(Modules.Hud.name(), 0, Category.Player);
    }
    
    @SubscribeEvent
    public void tick(final RenderGameOverlayEvent.Post post) {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHH.mc.currentScreen instanceof GuiMainMenu) {
            return;
        }
        if (post.type != RenderGameOverlayEvent.ElementType.TEXT) {
            return;
        }
        GL11.glPushMatrix();
        int n = 4;
        for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModuleManager().getModules()) {
            if (hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh != null && hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh != HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule((Class<? extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH>)H.class) && hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh != this && hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getState()) {
                HHHHHHHHHHHHHHHHHHHHHHHHHH.mc.fontRendererObj.drawStringWithShadow(hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getName(), 4.0f, (float)n, Color.getHSBColor((System.currentTimeMillis() + 900L) % 900L / 4750.0f, 0.8f, 0.8f).getRGB());
                n += 10;
            }
        }
        GL11.glPopMatrix();
    }
    
    private int rainbow(final int n) {
        return Color.getHSBColor((float)(Math.ceil((double)((System.currentTimeMillis() + n) / 4L)) % 360.0 / 360.0), 0.2f, 2.0f).getRGB();
    }
}

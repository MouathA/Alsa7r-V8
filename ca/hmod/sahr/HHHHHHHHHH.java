//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.gui.*;
import net.minecraft.client.*;
import java.util.*;

public class HHHHHHHHHH extends GuiScreen
{
    private Minecraft mc;
    private ArrayList<HHHHHHHHHHHHHHHHHHH> frames;
    
    protected void keyTyped(final char c, final int n) {
        for (final HHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhh : this.frames) {
            if (hhhhhhhhhhhhhhhhhhh.isOpen() && n != 1 && !hhhhhhhhhhhhhhhhhhh.getComponents().isEmpty()) {
                final Iterator<HHHHHHHHHHHH> iterator2 = hhhhhhhhhhhhhhhhhhh.getComponents().iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().keyTyped(c, n);
                }
            }
        }
        if (n == 1) {
            this.mc.displayGuiScreen((GuiScreen)null);
        }
    }
    
    public HHHHHHHHHH() {
        this.mc = Minecraft.getMinecraft();
        this.frames = new ArrayList<HHHHHHHHHHHHHHHHHHH>();
        int y = 4;
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.Category[] values;
        for (int length = (values = HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.Category.values()).length, i = 0; i < length; ++i) {
            final HHHHHHHHHHHHHHHHHHH e = new HHHHHHHHHHHHHHHHHHH(values[i]);
            e.setY(y);
            this.frames.add(e);
            y += 15;
        }
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) {
        for (final HHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhh : this.frames) {
            if (hhhhhhhhhhhhhhhhhhh.isWithinHeader(n, n2) && n3 == 0) {
                hhhhhhhhhhhhhhhhhhh.setDrag(true);
                hhhhhhhhhhhhhhhhhhh.drag_x = n - hhhhhhhhhhhhhhhhhhh.getX();
                hhhhhhhhhhhhhhhhhhh.drag_y = n2 - hhhhhhhhhhhhhhhhhhh.getY();
            }
            if (hhhhhhhhhhhhhhhhhhh.isWithinHeader(n, n2) && n3 == 1) {
                hhhhhhhhhhhhhhhhhhh.setOpen(!hhhhhhhhhhhhhhhhhhh.isOpen());
            }
            if (hhhhhhhhhhhhhhhhhhh.isOpen() && !hhhhhhhhhhhhhhhhhhh.getComponents().isEmpty()) {
                final Iterator<HHHHHHHHHHHH> iterator2 = hhhhhhhhhhhhhhhhhhh.getComponents().iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().mouseClicked(n, n2, n3);
                }
            }
        }
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawDefaultBackground();
        for (final HHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhh : this.frames) {
            hhhhhhhhhhhhhhhhhhh.renderFrame(this.fontRendererObj);
            hhhhhhhhhhhhhhhhhhh.updatePosition(n, n2);
            final Iterator<HHHHHHHHHHHH> iterator2 = hhhhhhhhhhhhhhhhhhh.getComponents().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().updateComponent(n, n2);
            }
        }
    }
    
    protected void mouseReleased(final int n, final int n2, final int n3) {
        final Iterator<HHHHHHHHHHHHHHHHHHH> iterator = this.frames.iterator();
        while (iterator.hasNext()) {
            iterator.next().setDrag(false);
        }
    }
}

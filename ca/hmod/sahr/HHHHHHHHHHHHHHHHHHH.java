//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import java.util.*;

public class HHHHHHHHHHHHHHHHHHH
{
    public int drag_y;
    private ArrayList<HHHHHHHHHHHH> components;
    private Minecraft mc;
    private boolean isDragging;
    public int width;
    boolean open;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.Category category;
    public int x;
    public int drag_x;
    public int y;
    public int bar_height;
    
    public int getY() {
        return this.y;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public void renderFrame(final FontRenderer fontRenderer) {
        this.width = 80;
        Gui.drawRect(this.x - 1, this.y - 3, this.x + this.width + 1, this.y + this.bar_height - 2, HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getColor().getRGB());
        GL11.glPushMatrix();
        this.mc.fontRendererObj.drawString(this.category.name(), this.x + 2, this.y, -1);
        if (this.open) {
            fontRenderer.drawString("-", this.x + 70, (int)(this.y + 1.5), -1);
        }
        else {
            fontRenderer.drawString("+", this.x + 70, this.y + 1, -1);
        }
        GL11.glPushMatrix();
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        if (this.open && !this.components.isEmpty()) {
            final Iterator<HHHHHHHHHHHH> iterator = this.components.iterator();
            while (iterator.hasNext()) {
                iterator.next().render();
            }
        }
    }
    
    public int getX() {
        return this.x;
    }
    
    public boolean isWithinHeader(final int n, final int n2) {
        return n >= this.x && n <= this.x + this.width && n2 >= this.y && n2 <= this.y + this.bar_height;
    }
    
    public void setDrag(final boolean isDragging) {
        this.isDragging = isDragging;
    }
    
    public void setY(final int y) {
        this.y = y;
    }
    
    public void setOpen(final boolean open) {
        this.open = open;
    }
    
    public void setX(final int x) {
        this.x = x;
    }
    
    public HHHHHHHHHHHHHHHHHHH(final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.Category category) {
        this.mc = Minecraft.getMinecraft();
        this.components = new ArrayList<HHHHHHHHHHHH>();
        this.category = category;
        this.width = 88;
        this.x = 5;
        this.y = 1;
        this.bar_height = 13;
        this.drag_x = 0;
        this.open = false;
        this.isDragging = false;
        int bar_height = this.bar_height;
        for (final HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh : HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getCategoryModules(this.category)) {
            if (!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.getName().equalsIgnoreCase("ClickGUI")) {
                this.components.add(new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH(hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh, this, bar_height));
                bar_height += 12;
            }
        }
    }
    
    public void updatePosition(final int n, final int n2) {
        if (this.isDragging) {
            this.setX(n - this.drag_x);
            this.setY(n2 - this.drag_y);
        }
    }
    
    public ArrayList<HHHHHHHHHHHH> getComponents() {
        return this.components;
    }
    
    public boolean isOpen() {
        return this.open;
    }
    
    public void refresh() {
        int bar_height = this.bar_height;
        for (final HHHHHHHHHHHH hhhhhhhhhhhh : this.components) {
            hhhhhhhhhhhh.setOff(bar_height);
            bar_height += hhhhhhhhhhhh.getHeight();
        }
    }
}

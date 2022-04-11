//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import org.lwjgl.opengl.*;
import net.minecraftforge.client.event.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.entity.*;

public class HHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH friends;
    private HHHHHHH mods;
    
    private void draw(final String s, final int n, final int n2, final int n3) {
        if (s == null) {
            return;
        }
        final boolean glIsEnabled = GL11.glIsEnabled(3042);
        GL11.glDisable(3042);
        HHHHHHHHHHHHHHHHHHHH.mc.fontRendererObj.drawStringWithShadow(s, (float)n, (float)n2, n3);
        if (glIsEnabled) {
            GL11.glEnable(3042);
        }
    }
    
    @Override
    public void onEnable() {
        if (!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getServer().equals(null) && !HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getServer().equalsIgnoreCase("localhost") && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getServer().contains("blocksmc.com") && !HHHHHHHHHHHHHHHHHHHH.mc.isSingleplayer()) {
            if (this.mods.getState() && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getAp().get("mods").isEmpty()) {
                HHHHHHHHHHHHHHHHHHHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] wait 1.5 seconds, collecting mods in the server..."));
                HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getAp().set("mods");
                HHHHHHHHHHHHHHHHHHHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] mods successfully collected."));
            }
        }
        else {
            HHHHHHHHHHHHHHHHHHHH.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText("[AlSa7r] join blocksmc server and try again."));
        }
        if (!this.friends.getState() && !this.mods.getState()) {
            this.friends.setState(true);
            this.mods.setState(true);
        }
        super.onEnable();
    }
    
    @SubscribeEvent
    public void Render(final RenderLivingEvent.Specials.Pre pre) {
        if (pre.entity != HHHHHHHHHHHHHHHHHHHH.mc.thePlayer && pre.entity instanceof EntityPlayer && !pre.entity.getDisplayName().toString().contains("CIT-") && !pre.entity.getDisplayName().toString().contains("[NPC]")) {
            this.renderName((EntityPlayer)pre.entity, pre.x, pre.y, pre.z);
        }
    }
    
    public HHHHHHHHHHHHHHHHHHHH() {
        super("Indicator", 0, Category.Other);
        this.friends = new HHHHHHH("Friends", true);
        this.mods = new HHHHHHH("Mods", true);
        this.addBoolean(this.friends);
        this.addBoolean(this.mods);
    }
    
    private void renderName(final EntityPlayer entityPlayer, final double n, double n2, final double n3) {
        n2 += (entityPlayer.isSneaking() ? 0.5 : 0.7);
        String s;
        if (this.mods.getState() && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getAp().get("mods").contains(EnumChatFormatting.getTextWithoutFormattingCodes(entityPlayer.getName()))) {
            s = EnumChatFormatting.DARK_RED + " /!\\";
        }
        else if (this.friends.getState() && HHH.isFriend(entityPlayer.getName())) {
            s = EnumChatFormatting.GREEN + " \u2714";
        }
        else {
            s = "";
        }
        GL11.glPushMatrix();
        GL11.glTranslated(n, n2 + 1.4, n3);
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        final RenderManager getRenderManager = HHHHHHHHHHHHHHHHHHHH.mc.getRenderManager();
        GL11.glRotatef(-getRenderManager.playerViewY, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(getRenderManager.playerViewX, 1.0f, 0.0f, 0.0f);
        GL11.glScalef(-0.03f, -0.03f, 0.03f);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        final Minecraft mc = HHHHHHHHHHHHHHHHHHHH.mc;
        final float n4 = -Minecraft.getMinecraft().fontRendererObj.getStringWidth(entityPlayer.getName()) / 2.0f - 3.0f;
        final Minecraft mc2 = HHHHHHHHHHHHHHHHHHHH.mc;
        final float n5 = (float)(-(Minecraft.getMinecraft().fontRendererObj.FONT_HEIGHT - 1));
        final Minecraft mc3 = HHHHHHHHHHHHHHHHHHHH.mc;
        final float n6 = Minecraft.getMinecraft().fontRendererObj.getStringWidth(entityPlayer.getName()) * 2 / 2.0f + 1.0f;
        final Minecraft mc4 = HHHHHHHHHHHHHHHHHHHH.mc;
        GL11.glDisable(32823);
        GL11.glDisable(2896);
        final String s2 = s;
        final Minecraft mc5 = HHHHHHHHHHHHHHHHHHHH.mc;
        final int n7 = -Minecraft.getMinecraft().fontRendererObj.getStringWidth("/!\\ ") / 2;
        final Minecraft mc6 = HHHHHHHHHHHHHHHHHHHH.mc;
        this.draw(s2, n7, -(Minecraft.getMinecraft().fontRendererObj.FONT_HEIGHT + 20), 12257310);
        final Minecraft mc7 = HHHHHHHHHHHHHHHHHHHH.mc;
        final int n8 = -Minecraft.getMinecraft().fontRendererObj.getStringWidth(entityPlayer.getName()) - 2;
        final Minecraft mc8 = HHHHHHHHHHHHHHHHHHHH.mc;
        final int n9 = n8 + Minecraft.getMinecraft().fontRendererObj.getStringWidth(entityPlayer.getName()) / 2;
        final Minecraft mc9 = HHHHHHHHHHHHHHHHHHHH.mc;
        GL11.glPolygonOffset(1.0f, 1000000.0f);
        GL11.glDisable(3042);
        GL11.glDisable(2896);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
    }
    
    private void draw(final float n, final float n2, final float n3, final float n4, final int n5) {
        GL11.glEnable(3042);
        GL11.glDisable(2884);
        GL11.glDisable(3553);
        GL11.glEnable(2848);
        GL11.glBlendFunc(770, 771);
        GL11.glLineWidth(1.0f);
        final Minecraft mc = HHHHHHHHHHHHHHHHHHHH.mc;
        Minecraft.getMinecraft().getResourceManager();
        GL11.glColor4f((n5 >> 16 & 0xFF) / 255.0f, (n5 >> 8 & 0xFF) / 255.0f, (n5 & 0xFF) / 255.0f, (n5 >> 24 & 0xFF) / 255.0f);
        GL11.glBegin(7);
        GL11.glVertex2d((double)n, (double)n2);
        GL11.glVertex2d((double)(n + n3), (double)n2);
        GL11.glVertex2d((double)(n + n3), (double)(n2 + n4));
        GL11.glVertex2d((double)n, (double)(n2 + n4));
        GL11.glEnd();
        GL11.glDisable(3042);
        GL11.glEnable(2884);
        GL11.glEnable(3553);
        GL11.glDisable(2848);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glShadeModel(7424);
        GL11.glDisable(3042);
        GL11.glEnable(3553);
    }
}

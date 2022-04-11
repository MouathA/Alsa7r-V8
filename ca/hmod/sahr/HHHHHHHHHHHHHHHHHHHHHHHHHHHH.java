//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import java.util.*;
import java.util.function.*;
import net.minecraft.entity.*;
import java.util.stream.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH timer;
    private HHHHHHH only_sword;
    private HHHHHHH while_click;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH reach;
    private HHHHHHH swing;
    private Random rand;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH attack_perk_seccond;
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer == null || HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.theWorld == null || HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.currentScreen != null || Mouse.isButtonDown(1)) {
            return;
        }
        if (this.while_click.getState() && !Mouse.isButtonDown(0)) {
            return;
        }
        if (this.only_sword.getState()) {
            if (HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword) && !(HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemAxe)) {
                return;
            }
        }
        final Stream stream = HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.theWorld.playerEntities.stream();
        final Class<EntityPlayer> clazz = EntityPlayer.class;
        clazz.getClass();
        final List<Object> list = stream.filter(clazz::isInstance).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList()).stream().filter(HHHHHHHHHHHHHHHHHHHHHHHHHHHH::lambda$tick$0).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
        list.sort(Comparator.comparingDouble((ToDoubleFunction<? super Object>)HHHHHHHHHHHHHHHHHHHHHHHHHHHH::lambda$tick$1));
        if (!list.isEmpty()) {
            final EntityPlayer entityPlayer = list.get(0);
            if (this.timer.is_time_over(1000.0 / this.attack_perk_seccond.getValue())) {
                if (this.swing.getState()) {
                    HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.swingItem();
                }
                HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.playerController.attackEntity((EntityPlayer)HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer, (Entity)entityPlayer);
                this.timer.reset();
            }
        }
    }
    
    private static double lambda$tick$1(final EntityPlayer entityPlayer) {
        return entityPlayer.getDistanceToEntity((Entity)HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer);
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        super("KillAura", 0, Category.Blatant);
        this.attack_perk_seccond = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("APS", 5.0, 5.0, 20.0);
        this.reach = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Reach", 3.0, 3.0, 6.0);
        this.only_sword = new HHHHHHH("Sword / Axe", false);
        this.swing = new HHHHHHH("Swing Item", false);
        this.while_click = new HHHHHHH("While Click", false);
        this.addValue(this.attack_perk_seccond);
        this.addValue(this.reach);
        this.addBoolean(this.swing);
        this.addBoolean(this.while_click);
        this.addBoolean(this.only_sword);
        this.timer = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
        this.rand = new Random();
    }
    
    private static boolean lambda$tick$0(final int n, final EntityPlayer entityPlayer) {
        return entityPlayer != null && entityPlayer != HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer && !entityPlayer.isDead && entityPlayer.getHealth() > 0.0f && !entityPlayer.getDisplayNameString().contains("CIT-") && !entityPlayer.getDisplayNameString().equalsIgnoreCase("quests") && !entityPlayer.getDisplayNameString().equalsIgnoreCase("shop") && !HHH.isFriend(entityPlayer.getName()) && entityPlayer.getDistanceToEntity((Entity)HHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer) <= n;
    }
}

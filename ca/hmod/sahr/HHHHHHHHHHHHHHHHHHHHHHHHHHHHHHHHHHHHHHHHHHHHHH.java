//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import java.util.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH only_sword;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH chance;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH timer;
    private Random random;
    private HHHHHHH while_click;
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH attack_per_second;
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH() {
        super("TriggerBot", 0, HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.Category.Ghost);
        this.attack_per_second = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("APS", 5.0, 5.0, 20.0);
        this.chance = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Chance", 100.0, 0.0, 100.0);
        this.while_click = new HHHHHHH("While Click", false);
        this.only_sword = new HHHHHHH("Swords / Axe", false);
        this.addValue(this.attack_per_second);
        this.addValue(this.chance);
        this.addBoolean(this.while_click);
        this.addBoolean(this.only_sword);
        this.random = new Random();
        this.timer = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH();
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        final double random = Math.random();
        if (this.getState() && Mouse.isButtonDown(1)) {
            return;
        }
        if (this.only_sword.getState()) {
            if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword) && !(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemAxe)) {
                return;
            }
        }
        if (this.while_click.getState() && !Mouse.isButtonDown(0)) {
            return;
        }
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.objectMouseOver != null && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY) {
            final Entity entityHit = HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.objectMouseOver.entityHit;
            if (random < this.chance.getValue() / 100.0 && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.currentScreen == null && !entityHit.isInvisible() && !HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.isUsingItem() && entityHit.isEntityAlive() && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.objectMouseOver != null && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.objectMouseOver.entityHit != null && HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.objectMouseOver.entityHit instanceof EntityPlayer && this.timer.is_time_over(1000.0 / this.attack_per_second.getValue())) {
                HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.swingItem();
                HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.playerController.attackEntity((EntityPlayer)HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer, entityHit);
                this.timer.reset();
            }
        }
    }
}

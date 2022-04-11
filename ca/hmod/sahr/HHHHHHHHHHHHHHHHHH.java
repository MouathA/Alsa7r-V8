//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH Speed;
    
    @SubscribeEvent
    public void tick(final TickEvent tickEvent) {
        if (!this.getState()) {
            return;
        }
        if (!HHHHHHHHHHHHHHHHHH.mc.thePlayer.onGround) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getTimer().timer().timerSpeed = (float)this.Speed.getValue();
        }
        HHHHHHHHHHHHHHHHHH.mc.thePlayer.capabilities.isFlying = true;
    }
    
    @Override
    public void onDisable() {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getTimer().reset_timer();
        HHHHHHHHHHHHHHHHHH.mc.thePlayer.capabilities.isFlying = false;
    }
    
    @Override
    public void onEnable() {
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).getState()) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).setState(false);
        }
    }
    
    public HHHHHHHHHHHHHHHHHH() {
        super("Fly", 0, Category.Blatant);
        this.addValue(this.Speed = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Speed", 1.0, 1.0, 2.0));
    }
}

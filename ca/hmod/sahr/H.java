//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.fml.common.gameevent.*;
import java.awt.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class H extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH R;
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH G;
    public static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH B;
    
    @SubscribeEvent
    public void onTick(final TickEvent tickEvent) {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.color = new Color((int)H.R.getValue(), (int)H.G.getValue(), (int)H.B.getValue());
    }
    
    public H() {
        super("Color", 0, Category.Other);
        H.R = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("R", 51.0, 0.0, 255.0);
        H.G = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("G", 146.0, 0.0, 255.0);
        H.B = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("B", 64.0, 0.0, 255.0);
        this.addValue(H.R);
        this.addValue(H.G);
        this.addValue(H.B);
    }
}

//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.client.event.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.gameevent.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH chance;
    private MovingObjectPosition moving;
    private float reach;
    private Random random;
    private Entity pointedEntity;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH min;
    private static float hitbox;
    private HHHHHHH only_sword;
    private static HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH max;
    private HHHHHHH invis;
    
    @SubscribeEvent
    public void onMouse(final MouseEvent mouseEvent) {
        if (this.only_sword.getState()) {
            if (HHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(HHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword) && !(HHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemAxe)) {
                return;
            }
        }
        if (this.invis.getState() && (HHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.isSneaking() || HHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.isInWater() || !HHHHHHHHHHHHHHHHHHHHHHHHH.mc.thePlayer.isSprinting())) {
            return;
        }
        try {
            if (this.moving != null) {
                HHHHHHHHHHHHHHHHHHHHHHHHH.mc.objectMouseOver = this.moving;
            }
        }
        catch (Exception ex) {}
    }
    
    public HHHHHHHHHHHHHHHHHHHHHHHHH() {
        super("HitBox", 0, Category.Ghost);
        HHHHHHHHHHHHHHHHHHHHHHHHH.min = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Min", 0.0, 0.0, 2.0);
        HHHHHHHHHHHHHHHHHHHHHHHHH.max = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Max", 0.0, 0.0, 2.0);
        this.chance = new HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH("Chance", 100.0, 0.0, 100.0);
        this.only_sword = new HHHHHHH("Sword / Axe", false);
        this.invis = new HHHHHHH("Invis", false);
        this.addValue(HHHHHHHHHHHHHHHHHHHHHHHHH.min);
        this.addValue(HHHHHHHHHHHHHHHHHHHHHHHHH.max);
        this.addValue(this.chance);
        this.addBoolean(this.invis);
        this.addBoolean(this.only_sword);
        this.random = new Random();
    }
    
    @Override
    public void onDisable() {
        HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.setCollision(1);
    }
    
    public static float getHitbox() {
        return HHHHHHHHHHHHHHHHHHHHHHHHH.hitbox;
    }
    
    public void editin_player_hitbox_reflect(final double n) {
        if (Minecraft.getMinecraft().getRenderViewEntity() != null && Minecraft.getMinecraft().theWorld != null) {
            Minecraft.getMinecraft().pointedEntity = null;
            if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).getState()) {
                if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getMisplace().getState()) {
                    this.reach = 3.0f;
                }
                else {
                    this.reach = (float)HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getReach();
                }
            }
            else {
                this.reach = 3.0f;
            }
            this.moving = Minecraft.getMinecraft().getRenderViewEntity().rayTrace((double)this.reach, 1.0f);
            double distanceTo = this.reach;
            final Vec3 getPositionEyes = Minecraft.getMinecraft().getRenderViewEntity().getPositionEyes(1.0f);
            if (this.moving != null) {
                distanceTo = this.moving.hitVec.distanceTo(getPositionEyes);
            }
            final Vec3 getLook = Minecraft.getMinecraft().getRenderViewEntity().getLook(1.0f);
            final Vec3 addVector = getPositionEyes.addVector(getLook.xCoord * this.reach, getLook.yCoord * this.reach, getLook.zCoord * this.reach);
            this.pointedEntity = null;
            Vec3 vec3 = null;
            final float n2 = 1.0f;
            final List getEntitiesWithinAABBExcludingEntity = Minecraft.getMinecraft().theWorld.getEntitiesWithinAABBExcludingEntity(Minecraft.getMinecraft().getRenderViewEntity(), Minecraft.getMinecraft().getRenderViewEntity().getEntityBoundingBox().addCoord(getLook.xCoord * this.reach, getLook.yCoord * this.reach, getLook.zCoord * this.reach).expand((double)n2, (double)n2, (double)n2));
            double n3 = distanceTo;
            for (int i = 0; i < getEntitiesWithinAABBExcludingEntity.size(); ++i) {
                final Entity pointedEntity = getEntitiesWithinAABBExcludingEntity.get(i);
                if (pointedEntity.canBeCollidedWith()) {
                    final AxisAlignedBB expand = pointedEntity.getEntityBoundingBox().expand(pointedEntity.getCollisionBorderSize() * (double)HHHHHHHHHHHHHHHHHHHHHHHHH.hitbox, pointedEntity.getCollisionBorderSize() * (double)HHHHHHHHHHHHHHHHHHHHHHHHH.hitbox, pointedEntity.getCollisionBorderSize() * (double)HHHHHHHHHHHHHHHHHHHHHHHHH.hitbox);
                    final MovingObjectPosition calculateIntercept = expand.calculateIntercept(getPositionEyes, addVector);
                    if (expand.isVecInside(getPositionEyes)) {
                        if (0.0 < n3 || n3 == 0.0) {
                            this.pointedEntity = pointedEntity;
                            vec3 = ((calculateIntercept == null) ? getPositionEyes : calculateIntercept.hitVec);
                            n3 = 0.0;
                        }
                    }
                    else if (calculateIntercept != null) {
                        final double distanceTo2 = getPositionEyes.distanceTo(calculateIntercept.hitVec);
                        if (distanceTo2 < n3 || n3 == 0.0) {
                            if (pointedEntity == Minecraft.getMinecraft().getRenderViewEntity().ridingEntity && !pointedEntity.canRiderInteract()) {
                                if (n3 == 0.0) {
                                    this.pointedEntity = pointedEntity;
                                    vec3 = calculateIntercept.hitVec;
                                }
                            }
                            else {
                                this.pointedEntity = pointedEntity;
                                vec3 = calculateIntercept.hitVec;
                                n3 = distanceTo2;
                            }
                        }
                    }
                }
            }
            if (this.pointedEntity != null && (n3 < distanceTo || this.moving == null)) {
                this.moving = new MovingObjectPosition(this.pointedEntity, vec3);
                if (this.pointedEntity instanceof EntityLivingBase) {
                    Minecraft.getMinecraft().pointedEntity = this.pointedEntity;
                }
            }
        }
    }
    
    @SubscribeEvent
    public void Recuder(final TickEvent.ClientTickEvent clientTickEvent) {
        if (this.getState() && !(HHHHHHHHHHHHHHHHHHHHHHHHH.mc.currentScreen instanceof HHHHHHHHHH)) {
            return;
        }
        if (HHHHHHHHHHHHHHHHHHHHHHHHH.min.getValue() > HHHHHHHHHHHHHHHHHHHHHHHHH.max.getValue()) {
            HHHHHHHHHHHHHHHHHHHHHHHHH.min.setValue(HHHHHHHHHHHHHHHHHHHHHHHHH.max.getValue() - 0.1);
        }
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.PlayerTickEvent playerTickEvent) {
        if (Math.random() < this.chance.getValue() / 100.0) {
            HHHHHHHHHHHHHHHHHHHHHHHHH.hitbox = (float)(HHHHHHHHHHHHHHHHHHHHHHHHH.min.getValue() + this.random.nextDouble() * (HHHHHHHHHHHHHHHHHHHHHHHHH.min.getValue() - HHHHHHHHHHHHHHHHHHHHHHHHH.max.getValue())) * 10.0f;
            this.editin_player_hitbox_reflect(HHHHHHHHHHHHHHHHHHHHHHHHH.hitbox);
        }
    }
}

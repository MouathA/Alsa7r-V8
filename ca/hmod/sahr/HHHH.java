//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraftforge.client.event.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class HHHH extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private HHHHHHH disableFly;
    private HHHHHHH disableAimAssist;
    private HHHHHHH disableVelocity;
    private HHHHHHH disableRodAimBot;
    private HHHHHHH disableRodAssist;
    private HHHHHHH disableBoost;
    private HHHHHHH disableReach;
    private HHHHHHH disableTriggerBot;
    private HHHHHHH disableHitBox;
    private HHHHHHH disableAutoClicker;
    private HHHHHHH disableFastPlace;
    private HHHHHHH disableKeepSprint;
    private HHHHHHH disableMisplace;
    private HHHHHHH disableTimer;
    
    @SubscribeEvent
    public void tick2(final ClientChatReceivedEvent clientChatReceivedEvent) {
        final String getTextWithoutFormattingCodes = EnumChatFormatting.getTextWithoutFormattingCodes(clientChatReceivedEvent.message.getUnformattedText());
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHH.class).getState() && this.getState() && this.disableHitBox.getState() && getTextWithoutFormattingCodes.contains("The server has detected you hacking HitBox.")) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHH.class).setState(false);
        }
    }
    
    @SubscribeEvent
    public void tick6(final ClientChatReceivedEvent clientChatReceivedEvent) {
        final String getTextWithoutFormattingCodes = EnumChatFormatting.getTextWithoutFormattingCodes(clientChatReceivedEvent.message.getUnformattedText());
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHH.class).getState() && this.getState() && this.disableAutoClicker.getState() && getTextWithoutFormattingCodes.contains("The server has detected you hacking Fightspeed.")) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHH.class).setState(false);
        }
    }
    
    @SubscribeEvent
    public void tick5(final ClientChatReceivedEvent clientChatReceivedEvent) {
        final String getTextWithoutFormattingCodes = EnumChatFormatting.getTextWithoutFormattingCodes(clientChatReceivedEvent.message.getUnformattedText());
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).getState() && this.getState() && this.disableTriggerBot.getState() && getTextWithoutFormattingCodes.contains("The server has detected you hacking Fightspeed.")) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).setState(false);
        }
    }
    
    @SubscribeEvent
    public void tick1(final ClientChatReceivedEvent clientChatReceivedEvent) {
        final String getTextWithoutFormattingCodes = EnumChatFormatting.getTextWithoutFormattingCodes(clientChatReceivedEvent.message.getUnformattedText());
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).getState() && this.getState() && this.disableReach.getState() && getTextWithoutFormattingCodes.contains("The server has detected you hacking HitBox.")) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.class).setState(false);
        }
    }
    
    @SubscribeEvent
    public void tick3(final ClientChatReceivedEvent clientChatReceivedEvent) {
        final String getTextWithoutFormattingCodes = EnumChatFormatting.getTextWithoutFormattingCodes(clientChatReceivedEvent.message.getUnformattedText());
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule((Class<? extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH>)HH.class).getState() && this.getState() && this.disableAimAssist.getState() && getTextWithoutFormattingCodes.contains("The server has detected you hacking Killaura.")) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule((Class<? extends HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH>)HH.class).setState(false);
        }
    }
    
    public HHHH() {
        super("AntiBot", 0, Category.Other);
        this.disableReach = new HHHHHHH("Reach", true);
        this.disableAutoClicker = new HHHHHHH("AutoClicker", false);
        this.disableAimAssist = new HHHHHHH("AimAssist", true);
        this.disableHitBox = new HHHHHHH("HitBox", true);
        this.disableFastPlace = new HHHHHHH("FasPlace", true);
        this.disableTriggerBot = new HHHHHHH("TriggerBot", true);
        this.addBoolean(this.disableReach);
        this.addBoolean(this.disableAutoClicker);
        this.addBoolean(this.disableAimAssist);
        this.addBoolean(this.disableHitBox);
        this.addBoolean(this.disableFastPlace);
        this.addBoolean(this.disableTriggerBot);
    }
    
    @SubscribeEvent
    public void tick8(final ClientChatReceivedEvent clientChatReceivedEvent) {
        final String getTextWithoutFormattingCodes = EnumChatFormatting.getTextWithoutFormattingCodes(clientChatReceivedEvent.message.getUnformattedText());
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHH.class).getState() && this.getState() && this.disableFastPlace.getState() && getTextWithoutFormattingCodes.contains("The server has detected you hacking badpackets.")) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHH.class).setState(false);
        }
    }
    
    @SubscribeEvent
    public void tick4(final ClientChatReceivedEvent clientChatReceivedEvent) {
        final String getTextWithoutFormattingCodes = EnumChatFormatting.getTextWithoutFormattingCodes(clientChatReceivedEvent.message.getUnformattedText());
        if (HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHH.class).getState() && this.getState() && this.disableVelocity.getState() && getTextWithoutFormattingCodes.contains("The server has detected you hacking Move.")) {
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH.getModule(HHHHHHHHHHHHHHHHHHHHHHHH.class).setState(false);
        }
    }
}

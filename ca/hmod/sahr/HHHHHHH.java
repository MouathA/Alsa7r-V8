//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

public class HHHHHHH
{
    private boolean isToggled;
    private String name;
    private boolean value;
    
    public void toggle() {
        this.value = !this.value;
    }
    
    public void setState(final boolean value) {
        if (value == this.value) {
            return;
        }
        this.value = value;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public HHHHHHH(final String name, final boolean value) {
        this.isToggled = true;
        this.name = name;
        this.value = value;
    }
    
    public boolean isToggled() {
        return this.isToggled;
    }
    
    public boolean getState() {
        return this.value;
    }
}

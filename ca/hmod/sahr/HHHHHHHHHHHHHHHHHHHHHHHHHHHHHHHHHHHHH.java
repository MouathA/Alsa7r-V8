//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import java.math.*;

public class HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
{
    private String name;
    private double min;
    private double value;
    private double max;
    
    public HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH(final String name, final double value, final double min, final double max) {
        this.name = name;
        this.value = value;
        this.max = max;
        this.min = min;
    }
    
    public double getMax() {
        return this.max;
    }
    
    public void increase() {
        if (this.round(this.value, 2) < this.max) {
            ++this.value;
        }
    }
    
    public void setValue(final double value) {
        this.value = value;
        if (value < this.getMin()) {
            this.value = this.getMin();
        }
    }
    
    private double round(final double val, final int newScale) {
        return new BigDecimal(val).setScale(newScale, 4).doubleValue();
    }
    
    public void decrease() {
        if (this.round(this.value, 2) > this.min) {
            --this.value;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getValue() {
        return this.round(this.value, 2);
    }
    
    public double getMin() {
        return this.min;
    }
}

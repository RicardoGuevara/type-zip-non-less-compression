/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresion_rick;

/**
 *
 * @author RICARDO
 */
public class BinInfo implements Comparable
{
    public BinInfo(byte bits) 
    {
        this.bits = bits;
        this.recurrence_count = 0;
    }
    
    @Override
    public int compareTo(Object ob)
    {
        return ((BinInfo)ob).recurrence_count - this.recurrence_count;
    }
    
    @Override
    public boolean equals(Object ob)
    {
        if (ob instanceof BinInfo) 
        {
            return ((BinInfo) ob).bits.equals(this.bits);
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        return this.bits.toString()+" "+this.recurrence_count;
    }
    
    public void upOne()
    {
        this.recurrence_count++;
    }
    
    private Byte bits;
    private int recurrence_count;
}

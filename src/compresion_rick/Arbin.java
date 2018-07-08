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
public class Arbin 
{
    //la interpretacion mas mediocre que pude hacer de un arbol, me siento orgulloso equisde v:
    public Arbin(Object info, Arbin superior, boolean orientation) 
    {
        this.info = info;
        this.orientation = orientation;
        if(orientation)
        {
            superior.rigth_arbin=this;
        }
        else
        {
            superior.lelft_arbin=this;
        }        
        this.superior = superior;
    }

    public Arbin(Object info, Arbin superior) 
    {
        //recordar posicion, más usado
        this.info = info;
        superior.lelft_arbin = new Arbin(superior);
        superior.rigth_arbin=this;
        this.superior = superior;
    }

    public Arbin() 
    {
        this.info= "root";
        this.superior = null;
        this.orientation = null;
    }
    
    public Arbin(Arbin superior) 
    {
        this.info = 0;
        this.orientation = false;
        this.superior=superior;
    }

    public Arbin(Object info, Arbin rigth_arbin, Arbin lelft_arbin) 
    {
        this.info = info;
        this.rigth_arbin = rigth_arbin;
        this.lelft_arbin = lelft_arbin;
    }

    @Override
    public String toString()
    {
        printArbin(this,0);
        return "\nend of Arbin";
    }
    
    //GETTERS & SETTERS_________________________________________________________
    
    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Boolean getOrientation() {
        return orientation;
    }

    public void setOrientation(Boolean orientation) {
        this.orientation = orientation;
    }

    public Arbin getRigth_arbin() {
        return rigth_arbin;
    }

    public void setRigth_arbin(Arbin rigth_arbin) {
        this.rigth_arbin = rigth_arbin;
    }

    public Arbin getLelft_arbin() {
        return lelft_arbin;
    }

    public void setLelft_arbin(Arbin lelft_arbin) {
        this.lelft_arbin = lelft_arbin;
    }

    public Arbin getSuperior() {
        return superior;
    }

    public void setSuperior(Arbin superior) {
        this.superior = superior;
    }
    
//ATRIB_________________________________________________________________________    
    
    public void printArbin(Arbin i_cry_every_nigth , int cause_i_cant_sleep)
    {
        for (int i = 0; i < cause_i_cant_sleep; i++) 
        {
            System.out.print("  ");
        }
        if (i_cry_every_nigth == null) 
        {
            System.out.println("hoja");
        }
        else
        {
            printArbin(i_cry_every_nigth.lelft_arbin,cause_i_cant_sleep+1);
            printArbin(i_cry_every_nigth.rigth_arbin,cause_i_cant_sleep+1);
            System.out.println(i_cry_every_nigth.info);
        }
    }
    
    
    private Object  info;
    private Boolean orientation;
    private Arbin   rigth_arbin,
                    lelft_arbin,
                    superior;
}

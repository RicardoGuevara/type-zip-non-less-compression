/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresion_rick;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author RICARDO
 */
public class Compressor implements Runnable
{

    public Compressor(boolean kill_me_please, String file_path, String out_path) 
    {
        this.kill_me_please = kill_me_please;
        this.file = new File(file_path);
        if (out_path.endsWith("\\")) 
        {
            this.out_path = out_path.substring(0, out_path.length()-1);   
        }
        else
        {
            this.out_path = out_path;
        }
        
        String  fileName = file.getAbsolutePath();
        this.fileExtension = fileName.substring(fileName.lastIndexOf("."));
            System.out.println("file ext: "+this.fileExtension);
        this.fileName = fileName.substring(fileName.lastIndexOf("\\"), fileName.lastIndexOf("."));
            System.out.println("file name: "+this.fileName);
         
    }
    
    private void compress() throws  java.io.FileNotFoundException,
                                    java.io.IOException,
                                    NullPointerException
    {
            System.out.println("start byte info reading");
        count_and_organize();
            System.out.println(baits);
        Collections.sort(baits);
            System.out.println("sorted byte list: \n"+baits);
            System.out.println("final length of byte concurrence: \n"+baits.size());
            //System.out.println(System.currentTimeMillis());
        binaryGuideConstruction();
        compressBytes();
            System.out.println("new byte order:\n"+i_need_sertraline);
            
        writeHeathers();    
        writeCompressBytes();  
        
        System.out.println("compressed succesfull");
    }
    
    private void count_and_organize() throws    java.io.FileNotFoundException,
                                                java.io.IOException,
                                                NullPointerException
    {
        int idk;
        byte aless;
        
        FileInputStream hurtado = new FileInputStream(file);
        while((idk=hurtado.read())!=-1)
        {
            aless = (byte) idk;
            arrayAlocation(aless);
        }
        hurtado.close();
    }
    
    private void arrayAlocation(byte i_seriously_want_to_die)
    {
        try
        {
            baits.get(baits.indexOf(new BinInfo(i_seriously_want_to_die))).upOne();
            //System.out.println("up_one");
        }
        catch(IndexOutOfBoundsException ioobe)
        {
            baits.add(new BinInfo(i_seriously_want_to_die));
            //System.out.println("new byte added "+i_seriously_want_to_die);
        }
    }
    
    private void binaryGuideConstruction()
    { 
        i_am_seriously_falling_in_deep_depression = new Arbin();
        Arbin triumph = i_am_seriously_falling_in_deep_depression;
        
        for (BinInfo bait : baits) 
        {
            new Arbin(bait,triumph);
            triumph = triumph.getLelft_arbin();
        }
        //uncoment down to see the magic uwu
        //System.out.println(i_am_seriously_falling_in_deep_depression);
    }
    
    private void compressBytes() throws java.io.FileNotFoundException,
                                        java.io.IOException,
                                        NullPointerException
    {
        int idk;
        byte aless;
        String netbeans_is_ugly;
        
        FileInputStream hurtado = new FileInputStream(file);
        while((idk=hurtado.read())!=-1)
        {
            aless = (byte) idk;
            netbeans_is_ugly = decompose(aless);
            //System.out.println(netbeans_is_ugly);
            i_need_sertraline.add(netbeans_is_ugly.length()-1);
        }
        hurtado.close();
    }
    
    private String decompose(byte zoloft_is_life)
    {
        Arbin all_hope_is_gone = i_am_seriously_falling_in_deep_depression;
        all_hope_is_gone = all_hope_is_gone.getRigth_arbin();
        String world_need_love="";
        
        while(true)
        {
            if (((BinInfo)all_hope_is_gone.getInfo()).getBits().equals(zoloft_is_life)) 
            {
                world_need_love+="1";
                return world_need_love;
            }
            else
            {
                world_need_love+="0";
                all_hope_is_gone=all_hope_is_gone.getSuperior().getLelft_arbin().getRigth_arbin();
                continue;
            }
        }
    }
    
    private void writeHeathers() throws FileNotFoundException,
                                        java.io.IOException,
                                        NullPointerException
    {   
        FileOutputStream chamorro = new FileOutputStream(out_path+fileName+".rick");
        for (BinInfo bait : baits) 
        {
            chamorro.write(bait.getBits());
        }
        chamorro.close();
    }
    
    private void writeCompressBytes() throws    FileNotFoundException,
                                                java.io.IOException,
                                                NullPointerException
    {   
        /*
        FileOutputStream hermes = new FileOutputStream(out_path+fileName+".rick");
        for (Integer integer : i_need_sertraline)
        {
        hermes.write(integer);
        }
        hermes.close();
        */
    }
    
    private void deCompress()
    {
        
    }

    @Override
    public void run() 
    {
        try
        {
            if (kill_me_please) 
            {
                compress();
            }
            else
            {
                deCompress();
            }
        }
        catch(java.io.FileNotFoundException fnfe)
        {
            System.out.println("the file doesn't exist");
            JOptionPane.showMessageDialog(null, "El archivo no existe");
            fnfe.printStackTrace();
        }
        catch(java.io.IOException ioe)
        {
            System.out.println("File error");
            JOptionPane.showMessageDialog(null, "Error de archivo");
            ioe.printStackTrace();
        }
        catch(NullPointerException npe)
        {
            System.out.println("El error del diablo nomms v:<");
            npe.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("i don't have any idea");
            e.printStackTrace();
        }
        catch(Throwable get_falling_in_love)
        {
            System.out.println("wtf bro ,( -_-),");
            get_falling_in_love.printStackTrace();
        }
    }
    
    private boolean kill_me_please; //control variable for compress
    private File file;
    private String  out_path,
                    fileExtension,
                    fileName;
    private ArrayList<BinInfo>  baits = new ArrayList();
    private ArrayList<Byte>     compressedBytes = new ArrayList();
    private ArrayList<Integer>      i_need_sertraline = new ArrayList();
    private Arbin i_am_seriously_falling_in_deep_depression;
    
}

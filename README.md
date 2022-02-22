/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javalibs5026211138;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dytakhairani
 */
public class JavaLibs5026211138 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double alas, tinggi, sisimiring, keliling;
        
        alas = Double.parseDouble(JOptionPane.showInputDialog(null, "Alas : "));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Tinggi : "));
        
        sisimiring = Math.sqrt(alas*alas + tinggi*tinggi);
        keliling = alas + tinggi + sisimiring;
        
        JOptionPane.showMessageDialog(null, "Alas : " +alas+ "\nTinggi : " +tinggi+ "\nSisiMiring : " +sisimiring+ "\nKeliling" +keliling, "SEGITIGA", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

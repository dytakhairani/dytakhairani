/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project4_2;
import java.util.Scanner;
/**
 *
 * @author dytakhairani
 */
public class ProcessAName5026211138{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); // buat method scanner input
        System.out.println ("Type your name : ");
        
        String Name = a.nextLine(); // buat nyimpen nama lengkap
        
        String[] Str = Name.split(" "); // untuk nge detect kata brp - 
        
        System.out.println ("Your name is: " + Str[1] + "," + Str[0]);
    }
    
}

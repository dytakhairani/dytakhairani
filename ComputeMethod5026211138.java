/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project4;
import java.util.Random; //import buat bisa randomin outputnya
/**
 *
 * @author dytakhairani
 */
public class ComputeMethod5026211138 {
    Random r = new Random();
    public double fToC (double degreesF){
        return 5/9*(degreesF - 32); //return artinya hasil atau hasil dari
    }
    public double hypotenuse (int a, int b){
        return Math.sqrt ((a*a) + (b*b));
    }
    public int roll(){
        return r.nextInt(6)+1;
    }
}

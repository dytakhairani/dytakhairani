/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project4;

/**
 *
 * @author dytakhairani
 */
public class TestClass5026211138 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComputeMethod5026211138 x = new ComputeMethod5026211138();
        System.out.printf("Temp in celsius is %.2f\n", x.fToC(32));
        System.out.printf("Hypotenuse is %.2f\n", x.hypotenuse(3,5));
        int r1 = x.roll();
        int r2 = x.roll();
        System.out.println("The sum of the dice values is " + (r1+r2));
    }
    
}

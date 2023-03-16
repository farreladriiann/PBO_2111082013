/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrel_080323;

/**
 *
 * @author laksa
 */
public class Latihan3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c = 5;
        int d = (a > b)?a:(b > c)?b:(c > a)?c:a;
        
        
        System.out.println("angka 1 = "+a);
        System.out.println("angka 2 = "+b);
        System.out.println("angka 3 = "+c);
        System.out.println("Nilai tertinggi = "+d);
        
        
    }
    
}

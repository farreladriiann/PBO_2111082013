/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrel_160323;

/**
 *
 * @author laksa
 */
public class BukuAlamat {
    public static void main(String[] args) {
        String [][] entry = {
            {"Florence", "35234", "Manila"},
            {"Joyce", "23434", "Manila"},
            {"Becca", "324524", "LA"},
        };
        
        for (int i=0; i<entry.length; i++){
            System.out.println("Nama    : "+entry[i][0]);
            System.out.println("Telp    : "+entry[i][1]);
            System.out.println("Alamat  : "+entry[i][2]);
            
        }
    }
    
}

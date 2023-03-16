/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrel_080323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author laksa
 */
public class GetInputFromKeyboard {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        String nama = "";
        int nilai = 0;
        try {
            System.out.println("Silahkan masukkan nama Anda : ");
            nama = dataIn.readLine();
            System.out.println("Nilai : ");
            nilai = Integer.parseInt(dataIn.readLine());
        }catch(IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hi "+nama+" !");
        System.out.println("Nilai : "+nilai);
    }
    
}

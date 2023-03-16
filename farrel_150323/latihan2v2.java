/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrel_150323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author laksa
 */
public class latihan2v2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
         int a;
        int b;
        int c;
        int average;
        
        try {
            System.out.print("number 1 : ");
            a =Integer.parseInt (dataIn.readLine());
            System.out.print("number 2 : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("number 3 : ");
            c = Integer.parseInt(dataIn.readLine());
            average = (a+b+c)/3;
            System.out.print("average = "+average);
        }catch(IOException e) {
            System.out.println("Error!");
        }
    }
    
}

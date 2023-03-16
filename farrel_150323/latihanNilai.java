/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrel_150323;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author laksa
 */
public class latihanNilai {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        int a;
        int b;
        int c;
 
        int avg;
        
        try {
              System.out.print("nilai 1 : ");
              a =Integer.parseInt (dataIn.readLine());
              System.out.print("nilai 2 : ");
              b = Integer.parseInt(dataIn.readLine());
              System.out.print("nilai 3 : ");
              c = Integer.parseInt(dataIn.readLine());
              avg = (a+b+c)/3;
              System.out.println("rata-rata = "+avg);
              if(avg >= 60){
                  System.out.println(":)");
              }
              System.out.println(":(");
          }catch(IOException e) {
              System.out.println("Error!");
          }
        

       

    }
    
}

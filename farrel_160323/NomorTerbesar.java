/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrel_160323;
import javax.swing.JOptionPane;

/**
 *
 * @author laksa
 */
public class NomorTerbesar {
    public static void main(String[] args) {
        int [] numbers = new int [10];
        int maxNumber = 0;
        
        JOptionPane.showMessageDialog(null,"Masukkan 10 angka");
        
        for (int i = 0; i<numbers.length; i++){
            String input = JOptionPane.showInputDialog(null,"Masukkan angka ke-"+(i+1));
            numbers [i] = Integer.parseInt(input);
            
            if (numbers[i]>maxNumber){
                maxNumber = numbers[i];
            }
         
        }
        
        JOptionPane.showMessageDialog(null, "Input terbesar yg anda masukkan adalah"+maxNumber);
    }
    
}

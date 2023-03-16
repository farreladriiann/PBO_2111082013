/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrel_150323;
import javax.swing.JOptionPane;

/**
 *
 * @author laksa
 */
public class InputJOptionPane {
    public static void main(String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("Enter your name");
        String msg = "Hello "+name+" !";
        JOptionPane.showMessageDialog(null, msg);
    }
}

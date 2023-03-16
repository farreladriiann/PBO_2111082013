/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farrel_070323;

/**
 *
 * @author laksa
 */
public class KondisiOperator {
    public static void main(String[] args) {
        String status = "";
        int grade = 90;
        
        //mendapatkan status pelajar
        status = (grade >= 60)? "Passed" : "Fail";
        
        System.out.println(status);
    }
    
}

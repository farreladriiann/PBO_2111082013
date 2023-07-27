/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_240523.database;

import com.mysql.cj.jdbc.MysqlDataSource;
import dey_240523.dao.AnggotaDao;
import dey_240523.dao.AnggotaDaoImpl;
import dey_240523.model.Anggota;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class DatabaseHelper {
    public static Connection connection;
    
    public static Connection getConnection() throws SQLException {
        if(connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost/desya_2211083023");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String[] args) {
        try{
            connection = DatabaseHelper.getConnection();
            Anggota anggota =  new Anggota();
            anggota.setNobp("2211083023");
            anggota.setNama("Desya");
            anggota.setAlamat("Bogor");
            anggota.setJenisKelamin("P");
            AnggotaDao dao = new AnggotaDaoImpl(connection);
            dao.insert(anggota);
            JOptionPane.showMessageDialog(null, "Koneksi OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

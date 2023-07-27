/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farrel_240523.controller;

import dey_240523.model.Anggota;
import dey_240523.dao.AnggotaDao;
import dey_240523.dao.AnggotaDaoImpl;
import dey_240523.database.DatabaseHelper;
import dey_240523.view.AnggotaForm;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AnggotaController {
    AnggotaForm anggotaForm;
    Anggota anggota;
    AnggotaDao dao;
    
    public AnggotaController(AnggotaForm anggotaForm) {
        this.anggotaForm = anggotaForm;
        
        try {
            dao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm() {
        anggotaForm.getTxtNobp().setText("");
        anggotaForm.getTxtNama().setText("");
        anggotaForm.getTxtAlamat().setText("");
        anggotaForm.getCbJenisKelamin().removeAllItems();
        anggotaForm.getCbJenisKelamin().addItem("L");
        anggotaForm.getCbJenisKelamin().addItem("P");
    }
    
    public void insert() {
        try {
            anggota = new Anggota();
            anggota.setNobp(anggotaForm.getTxtNobp().getText());
            anggota.setNama(anggotaForm.getTxtNama().getText());
            anggota.setAlamat(anggotaForm.getTxtAlamat().getText());
            anggota.setJenisKelamin(anggotaForm.getCbJenisKelamin().getSelectedItem().toString());
            
            dao.insert(anggota);
            JOptionPane.showMessageDialog(anggotaForm, "Insert Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(anggotaForm, ex.getMessage());
        }
    }
    
    public void update() {
        try {
            anggota = new Anggota();
            anggota.setNobp(anggotaForm.getTxtNobp().getText());
            anggota.setNama(anggotaForm.getTxtNama().getText());
            anggota.setAlamat(anggotaForm.getTxtAlamat().getText());
            anggota.setJenisKelamin(anggotaForm.getCbJenisKelamin().getSelectedItem().toString());
            
            dao.update(anggota);
            JOptionPane.showMessageDialog(anggotaForm, "Update Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(anggotaForm, ex.getMessage());
        }
    }
    
    public void delete() throws SQLException {
        try {
        String nobp = anggotaForm.getTxtNobp().getText();
        dao.delete(nobp);
        JOptionPane.showMessageDialog(anggotaForm, "Delete Data Ok");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(anggotaForm, ex.getMessage());
    }
}


    public void tampilTable() {
     try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) anggotaForm.getTblAnggota().getModel();
            tabelModel.setRowCount(0);
            List<Anggota> list = dao.getAll();
            for (Anggota anggota1 : list){
                Object [] row = {
                    anggota1.getNobp(),
                    anggota1.getNama(),
                    anggota1.getAlamat(),
                    anggota1.getJenisKelamin(),
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getAnggota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

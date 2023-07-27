/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dey_240523.dao;

import dey_240523.model.Peminjaman;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(String nobp) throws SQLException;
    Peminjaman getPeminjaman(String nobp) throws SQLException;
    List<Peminjaman>getAll() throws SQLException;
}

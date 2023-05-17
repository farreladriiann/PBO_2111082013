/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsB.Model;

/**
 *
 * @author PC8
 */
public class Pesanan {
     private String kodePesanan;
    private String namaPesanan;
    private String tanggalPesan;
    private String harga;
    private String ongkosKirim;
    private String diskon;
    private String KodePesanan;
    private String NamaPesanan;
    private String TanggalPesan;
    private String Harga;
    private String OngkosKirim;
    private String Diskon;
    private String TanggalPesanan;
    
    
    public Pesanan(){
    
    }
    public Pesanan(String kodePesanan, String namaPesanan, String tanggalPesan, String harga, String ongkosKirim, String diskon ){
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.tanggalPesan = tanggalPesan;
        this.harga = harga;
        this.ongkosKirim = ongkosKirim;
        this.diskon = diskon;
        
    }
    
    public String getKodePesanan(){
        return this.KodePesanan;
    }
    public String getNamaPesanan(){
        return this.NamaPesanan;
    }
    public String getTanggalPesan(){
        return this.TanggalPesan;
    }
    public String getHarga(){
        return this.Harga;
    }
    public String getOngkosKirim(){
        return this.OngkosKirim;
    }
    public String getDiskon(){
        return this.Diskon;
    }
    public void setKodePesanan(String kodePesanan){
        this.KodePesanan = kodePesanan;
    }
    public void setNamaPesanan(String namaPesanan){
        this.NamaPesanan = namaPesanan;
    }
    public void setTanggalPesanan(String tanggalPesanan){
        this.TanggalPesanan = tanggalPesanan;
    }
    public void setHarga(String harga){
        this.Harga = harga;
    }
    public void setOngkosKirim(String ongkosKirim){
        this.OngkosKirim = ongkosKirim;
    }
    public void setDiskon(String diskon){
        this.Diskon = diskon;
    }
    
}

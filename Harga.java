/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author NoteBook
 */
public class Harga {
    
    private Barang b;
    private int jumlah, harga1, harga2, total, kembalian, bayar;

    public Harga(int jumlah, int harga1) {
        this.harga1 = harga1;
        this.jumlah = jumlah;
    }
    
    public void insertbayar(int bayar){
        this.bayar = bayar;
    }
    
    public void insertharga(int harga){
        this.harga1 = harga;
    }
    
    public int gethasil(){
        int hasil = harga1 * jumlah;
        return hasil;
    }
    
    public int kembalian(){
        kembalian = bayar - gethasil();
        return kembalian;
    }
    
    public int getharga2(int harga){
        harga = harga - bayar;
        return harga;
    }
    
    public int getkembalian(){
        kembalian = bayar - total;
        return kembalian;
    }
    
    public int bayar(){
        return bayar;
    }
    
    public int gettotal(){
        total = harga1 + harga2;
        return total;
    }
}

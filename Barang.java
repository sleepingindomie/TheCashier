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
public class Barang {

    public int pesanan;
    String nama;
    int harga;

    public void insert(int pesanan) {
        this.pesanan = pesanan;
        //kode untuk menentukan harga
    }

    Barang(String n, int h) {
        nama = n;
        harga = h;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    static void p4(NodeLL p4) {
        System.out.print("Paket 4 : ");
        for (NodeLL t = p4; t != null; t = t.next) {
            System.out.print(" " + t.brg.getNama() + ",");
        }
        System.out.println("                   Rp43000");
    }

    static void p5(NodeLL p5) {
        System.out.print("Paket 5 : ");
        for (NodeLL t = p5; t != null; t = t.next) {
            System.out.print(" " + t.brg.getNama() + ",");
        }
        System.out.println("                 Rp22000");
    }


}

class NodeLL {

    Barang brg;
    NodeLL next;

    NodeLL(Barang b) {
        brg = b;
    }

    public String getBarang() {
        return brg.getNama();

    }

    public int getharga() {
        return brg.getHarga();
    }
}



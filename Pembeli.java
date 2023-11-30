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
class Node {

    public Object data;
    Node next;
    Node previous;

    public Node(Object object) {
        this(object, null);
    }

    public Node(Object object, Node node) {
        data = object;
        next = node;
    }

    public Object getobject() {
        return data;
    }

    public Node getnext() {
        return next;
    }

    public void display() {
        System.out.print(data + " ");
    }
}

class List {

    public Node first;
    public Node last;
    public String no;
    public String nama, pesanan, nam;

    public List(String nama) {
        this.nama = nama;
        first = last = null;
    }

    public List() {
        this("Antrian");
    }

    public void insertlast(Object dt) {
        Node newLink = new Node(dt);
        if (isEmpty()) {
            first = last = newLink;
        } else {
            last = last.next = newLink;
        }
    }

    public void insertfirst(Object dt) {
        Node newLink = new Node(dt);
        if (isEmpty()) {
            first = last = newLink;
        } else {
            first = new Node(dt, first);
        }
    }

    public Object remove() {
        Node temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertpesanan(String pesan) {
        this.pesanan = pesan;
    }

    public void getnama(String nm) {
        this.nam = nm;
    }

    public void lihatbarang() {
        if (isEmpty()) {
            System.out.printf(" Antrian kosong \n", nama, pesanan);
            return;
        }
        System.out.printf("Urutan Antrian : ", pesanan, no);
        Node temp = first;
        while (temp != null) {
            System.out.printf("No. %s ",temp.data, " Pesan ", pesanan);
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void cetak() {
        if (isEmpty()) {
            System.out.printf(" Antrian kosong \n", no, nama);
            return;
        }
        System.out.printf("Urutan Antrian : ", no, nama);
        Node temp = first;
        while (temp != null) {
            System.out.printf("%s <-- ", temp.data);
            temp = temp.next;
        }
        System.out.println("\n");
    }

}

class Pembeli {

    public String no;
    public String nama;

    public Pembeli(String nomer, String nama) {
        this.no = nomer;
        this.nama = nama;
    }

    public String getnama() {
        return nama;
    }

    public String toString() {
        return String.format("%s%s", "", no, nama);
    }
}

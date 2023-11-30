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
public class queue {

    private int maxSize;
    private Node temp;
    private Node[] queArray;
    private int front;
    private int rear;
    private int nItems;
    private List list;

    public queue() {
        list = new List(" Antrian ");
    }

    public void enqueue(Object dt, int priority) {
        if (priority == 0) {
            list.insertlast(dt);
        } else {
            list.insertfirst(dt);
        }
    }

    public void dequeue() {
        list.remove();
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public void cetak() {
        list.cetak();
    }

    public void lihatbrg() {
        list.lihatbarang();
    }

    public void pesan(String pesan) {
        list.insertpesanan(pesan);
    }
    
    public void getnm(String nm){
        list.getnama(nm);
    }
    
    void cetak(int no, String nama) {
        list.cetak();
    }
}

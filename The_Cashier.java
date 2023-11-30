/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.Scanner;

/**
 *
 * @author NoteBook
 */
class quedemo {

    private static int pilihan;
    private static String nama, pesanan, tambah, no;
    private static int jumlah, total, bayar1, kembalian, harga1, bayar2;
    private static boolean kondisi;
    static Scanner read = new Scanner(System.in);
    private static Harga h;
    private static final queue que = new queue();

    public static void main(String[] args) {
        choose();
    }

    public static void pendaftaran() {
        System.out.println("Pendaftaran");
        barang();
        System.out.print("\nMasukkan no Pendaftar : ");
        no = read.next();
        System.out.print("\nMasukkan nama Pendaftar : ");
        read.next();
        nama = read.nextLine();
        Pembeli p = new Pembeli(no, nama);
        System.out.print("\nMasukkan pesanan Pendaftar : ");
        que.enqueue(p, 0);
        pesanan = read.next();
        daftarbarang(pesanan);
        pesanlagi();
        que.getnm(nama);
    }

    public static void daftarantrian() {
        System.out.println("      Lihat Daftar Antrian    ");
        System.out.println("------------------------------");
        que.cetak();
    }

    public static void keluarantrian() {
        System.out.println("Panggil Pendaftar");
        System.out.println("------------------------------");
        if (que.isEmpty() == true) {
            System.out.println("Antrian isEmpty");
            System.exit(0);
        } else {
            Node dthapus = (Node) que.remove();
            System.out.printf("&s telah keluar dari antrian\n", dthapus);
            System.exit(0);
        }
    }

    public static void invalidmenu() {
        if (pilihan == 0) {
            System.out.println("\n Keluar dari program ");
            System.out.println("------------------------------");
        } else {
            System.out.println("Pilihan menu tidak tersedia");
            System.exit(0);
        }
    }

    public static void jawaban(String jawaban) {
        switch (jawaban) {
            case "y":
                barang();
                System.out.print("Masukkan Pesanan lagi : ");
                pesanan = read.next();
                daftarbarang(pesanan);
                pesanlagi();
                break;
            case "n":
                choose();
                break;
            default:
                System.out.println("Input uknown");
                invalidmenu();
        }
    }

    public static void choose() {
        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("           Selamat Datang di The Cashier             ");
            System.out.println("------------------------------------------------------");
            System.out.println("                         Menu                         ");
            System.out.println("1. Pendaftaran ");
            System.out.println("2. Lihat Daftar Antrian");
            System.out.println("3. Data Barang");
            System.out.println("4. Layanin Orang");
            System.out.println("5. Lihat Pesanan");
            System.out.println("0. Keluar");
            System.out.println("\nMasukkan pilihan menu : ");
            pilihan = read.nextInt();
            switch (pilihan) {
                case 1:
                    pendaftaran();
                    break;
                case 2:
                    daftarantrian();
                    break;
                case 3:
                    barang();
                    break;
                case 4:
                    layanan();
                    break;
                case 5 :
                    lihatpesanan();
                    break;
                case 0:
                    keluarantrian();
                    break;
                default:
                    invalidmenu();
            }
        } while (pilihan != 0);
    }

    public static void pesanlagi() {
        //Pesan Lagi
        System.out.println("\nApakah Anda ingin memesan lagi ? \"y\" atau \"n\"");
        String jawaban = read.next();
        jawaban(jawaban);
    }

    public static void layanan() {
        que.dequeue();
        que.cetak();
    }

    public static void daftarbarang(String choose) {

        Barang b1 = new Barang("Bakso Malang", 13000);
        Barang b2 = new Barang("Bakso Mercon", 15000);
        Barang b3 = new Barang("Bakso Super", 10000);
        Barang b4 = new Barang("Bakso Urat", 15000);
        Barang b5 = new Barang("Bakso Telur", 15000);

        NodeLL s1 = new NodeLL(b1);
        NodeLL s2 = new NodeLL(b2);
        NodeLL s3 = new NodeLL(b3);
        NodeLL s4 = new NodeLL(b4);
        NodeLL s5 = new NodeLL(b5);

        Barang b6 = new Barang("Teh Manis Hangat", 3000);
        Barang b7 = new Barang("Es Teh Manis", 4000);
        Barang b8 = new Barang("Lemon Tea", 8000);
        Barang b9 = new Barang("Milk Tea", 8000);
        Barang b10 = new Barang("Blackcurrant", 8000);
        Barang b11 = new Barang("Air Mineral", 5000);

        NodeLL s6 = new NodeLL(b6);
        NodeLL s7 = new NodeLL(b7);
        NodeLL s8 = new NodeLL(b8);
        NodeLL s9 = new NodeLL(b9);
        NodeLL s10 = new NodeLL(b10);
        NodeLL s11 = new NodeLL(b11);

        Barang b12 = new Barang("Bakmi Ayam", 15000);
        Barang b13 = new Barang("Sop Buntut", 20000);
        Barang b14 = new Barang("Kari Ayam", 18000);
        Barang b15 = new Barang("Rawon", 20000);

        NodeLL s12 = new NodeLL(b12);
        NodeLL s13 = new NodeLL(b13);
        NodeLL s14 = new NodeLL(b14);
        NodeLL s15 = new NodeLL(b15);

        s1.next = s2;
        s2.next = s8;
        s8.next = s9;

        s4.next = s5;
        s5.next = s11;
        s11.next = s10;

        s12.next = s13;
        s13.next = s6;
        s6.next = s7;

        s3.next = s15;
        s15.next = s8;

        s14.next = s6;

        switch (choose) {
            case "s1":
                choose = s1.getBarang();
                harga1 = s1.getharga();
                break;
            case "s2":
                choose = s2.getBarang();
                harga1 = s2.getharga();
                break;
            case "s3":
                choose = s3.getBarang();
                harga1 = s3.getharga();
                break;
            case "s4":
                choose = s4.getBarang();
                harga1 = s4.getharga();
                break;
            case "s5":
                choose = s5.getBarang();
                harga1 = s5.getharga();
                break;
            case "s6":
                choose = s6.getBarang();
                harga1 = s6.getharga();
                break;
            case "s7":
                choose = s7.getBarang();
                harga1 = s7.getharga();
                break;
            case "s8":
                choose = s8.getBarang();
                harga1 = s8.getharga();
                break;
            case "s9":
                choose = s9.getBarang();
                harga1 = s9.getharga();
                break;
            case "s10":
                choose = s10.getBarang();
                harga1 = s10.getharga();
                break;
            case "s11":
                choose = s11.getBarang();
                harga1 = s11.getharga();
                break;
            case "s12":
                choose = s12.getBarang();
                harga1 = s12.getharga();
                break;
            case "s13":
                choose = s13.getBarang();
                harga1 = s13.getharga();
                break;
            case "s14":
                choose = s14.getBarang();
                harga1 = s14.getharga();
                break;
            case "s15":
                choose = s15.getBarang();
                harga1 = s15.getharga();
                break;
            case "p1":
                choose = "Paket 1";
                harga1 = s1.getharga() + s2.getharga() + s8.getharga() + s9.getharga();
                break;
            case "p2":
                choose = "Paket 2";
                harga1 = s4.getharga() + s5.getharga() + s11.getharga() + s10.getharga();
                break;
            case "p3":
                choose = "Paket 3";
                harga1 = s12.getharga() + s13.getharga() + s6.getharga() + s7.getharga();
                break;
            case "p4":
                choose = "Paket 4";
                harga1 = s3.getharga() + s15.getharga() + s8.getharga() + s9.getharga();
                break;
            case "p5":
                choose = "Paket 5";
                harga1 = s14.getharga() + s7.getharga() + s6.getharga();
                break;
            default:
                invalidmenu();
                keluarantrian();
        }
        que.pesan(choose);
        System.out.print("\nJumlah Pesanan : ");
        jumlah = read.nextInt();
        pembayaran(pesanan, harga1);
    }

    public static void p1(NodeLL p1) {
        System.out.print("\nPaket 1 : ");
        for (NodeLL t = p1; t != null; t = t.next) {
            System.out.print(" " + t.brg.getNama() + ",");
        }
        System.out.println("           Rp44000" + " = p1");
    }

    static void p2(NodeLL p2) {
        System.out.print("Paket 2 : ");
        for (NodeLL t = p2; t != null; t = t.next) {
            System.out.print(" " + t.brg.getNama() + ",");
        }
        System.out.println("        Rp43000" + " = p2");
    }

    static void p3(NodeLL p3) {
        System.out.print("Paket 3 : ");
        for (NodeLL t = p3; t != null; t = t.next) {
            System.out.print(" " + t.brg.getNama() + ",");
        }
        System.out.println("    Rp43000" + " = p3");
    }

    static void p4(NodeLL p4) {
        System.out.print("Paket 4 : ");
        for (NodeLL t = p4; t != null; t = t.next) {
            System.out.print(" " + t.brg.getNama() + ",");
        }
        System.out.println("                   Rp46000" + " = p4");
    }

    static void p5(NodeLL p5) {
        System.out.print("Paket 5 : ");
        for (NodeLL t = p5; t != null; t = t.next) {
            System.out.print(" " + t.brg.getNama() + ",");
        }
        System.out.println("                 Rp25000" + " = p5");
    }

    public static void barang() {
        System.out.println("-------------MENU-------------");

        System.out.println("        Daftar Makanan      ");
        Barang b1 = new Barang("Bakso Malang", 13000);
        Barang b2 = new Barang("Bakso Mercon", 15000);
        Barang b3 = new Barang("Bakso Super", 10000);
        Barang b4 = new Barang("Bakso Urat", 15000);
        Barang b5 = new Barang("Bakso Telur", 15000);

        NodeLL s1 = new NodeLL(b1);
        NodeLL s2 = new NodeLL(b2);
        NodeLL s3 = new NodeLL(b3);
        NodeLL s4 = new NodeLL(b4);
        NodeLL s5 = new NodeLL(b5);

        System.out.print(s1.getBarang());
        System.out.println("         Rp" + s1.getharga() + " = s1");
        System.out.print(s2.getBarang());
        System.out.println("         Rp" + s2.getharga() + " = s2");
        System.out.print(s3.getBarang());
        System.out.println("          Rp" + s3.getharga() + " = s3");
        System.out.print(s4.getBarang());
        System.out.println("           Rp" + s4.getharga() + " = s4");
        System.out.print(s5.getBarang());
        System.out.println("          Rp" + s5.getharga() + " = s5");

        System.out.println("\n        Daftar Minuman      ");
        Barang b6 = new Barang("Teh Manis Hangat", 3000);
        Barang b7 = new Barang("Es Teh Manis", 4000);
        Barang b8 = new Barang("Lemon Tea", 8000);
        Barang b9 = new Barang("Milk Tea", 8000);
        Barang b10 = new Barang("Blackcurrant", 8000);
        Barang b11 = new Barang("Air Mineral", 5000);

        NodeLL s6 = new NodeLL(b6);
        NodeLL s7 = new NodeLL(b7);
        NodeLL s8 = new NodeLL(b8);
        NodeLL s9 = new NodeLL(b9);
        NodeLL s10 = new NodeLL(b10);
        NodeLL s11 = new NodeLL(b11);

        System.out.print(s6.getBarang());
        System.out.println("     Rp" + s6.getharga() + " = s6");
        System.out.print(s7.getBarang());
        System.out.println("         Rp" + s7.getharga() + " = s7");
        System.out.print(s8.getBarang());
        System.out.println("            Rp" + s8.getharga() + " = s8");
        System.out.print(s9.getBarang());
        System.out.println("             Rp" + s9.getharga() + " = s9");
        System.out.print(s10.getBarang());
        System.out.println("         Rp" + s10.getharga() + " = s10");
        System.out.print(s11.getBarang());
        System.out.println("          Rp" + s11.getharga() + " = s11");

        System.out.println("\n        Lainnya      ");

        Barang b12 = new Barang("Bakmi Ayam", 15000);
        Barang b13 = new Barang("Sop Buntut", 20000);
        Barang b14 = new Barang("Kari Ayam", 18000);
        Barang b15 = new Barang("Rawon", 20000);

        NodeLL s12 = new NodeLL(b12);
        NodeLL s13 = new NodeLL(b13);
        NodeLL s14 = new NodeLL(b14);
        NodeLL s15 = new NodeLL(b15);

        System.out.print(s12.getBarang());
        System.out.println("           Rp" + s12.getharga() + " = s12");
        System.out.print(s13.getBarang());
        System.out.println("           Rp" + s13.getharga() + " = s13");
        System.out.print(s14.getBarang());
        System.out.println("            Rp" + s14.getharga() + " = s14");
        System.out.print(s15.getBarang());
        System.out.println("                Rp" + s15.getharga() + " = s15");

        s1.next = s2;
        s2.next = s8;
        s8.next = s9;

        s4.next = s5;
        s5.next = s11;
        s11.next = s10;

        s12.next = s13;
        s13.next = s6;
        s6.next = s7;

        s3.next = s15;
        s15.next = s8;

        s14.next = s6;

        System.out.println("");
        p1(s1);
        System.out.println("");
        p2(s4);
        System.out.println("");
        p3(s12);
        System.out.println("");
        p4(s3);
        System.out.println("");
        p5(s14);
    }

    public static void pembayaran(String choose, int harga) {
        h = new Harga(jumlah, harga);
        System.out.println("Pesanan " + choose + " dengan Harga Rp." + h.gethasil());
        //        System.out.println("Total : " + h.getharga1());
        System.out.print("\nMasukkan Jumlah Bayar : ");
        System.out.print("Rp.");
        bayar1 = read.nextInt();
        h.insertbayar(bayar1);

        //Jika uang kurang
        if (bayar1 >= harga) {
            System.out.print("Kembalian : Rp." + h.kembalian());
            System.out.println("\nTerima Kasih Telah berbelanja");
        } else if (bayar1 < harga) {
            System.out.println("Uang anda Kurang");
            System.out.println("ingin membatalkan pesanan atau menambah uang bayar? \"b\" atau \"m\"");
            tambah = read.next();
            switch (tambah) {
                case "b":
                    keluarantrian();
                    break;
                case "m":
                    int harga1 = harga - bayar1;
                    System.out.println("Uang Anda kurang " + harga1);
                    System.out.print("Masukkan Jumlah bayar : ");
                    System.out.print("Rp.");
                    bayar2 = read.nextInt();
                    bayar2(bayar2, harga1);
                    break;
                default:
                    invalidmenu();
            }
        } else {
            invalidmenu();
        }
    }

    public static void bayar2(int bayar, int harga) {
        h.insertbayar(bayar);
        if (bayar >= harga) {
            h.insertharga(harga);
            System.out.println("Kembalian : Rp" + h.kembalian());
        } else if (bayar < harga) {
            System.out.println("Uang Anda tetap kurang dan anda dipaksakan keluar antrian");
            keluarantrian();
        } else {
            keluarantrian();
        }
    }
    
    public static void lihatpesanan(){
        que.lihatbrg();
    }
}

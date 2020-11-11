/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan45.cetaknama;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Mencetak Nama
 */

import java.util.Scanner;
public class Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CetakNama printer = new CetakNama();
        CetakNama printer1 = new CetakNama();
        System.out.println("=====Aplikasi Pencetakan Nama======");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak berapa kali ? : ");
        printer.setJmlCetak(scanner.nextInt());
        printer.cetak(printer.getNama());
        printer1.cetak(printer.getJmlCetak(), printer.getNama());
    }
}


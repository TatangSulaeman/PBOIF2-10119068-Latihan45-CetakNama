/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.cetaknama.tugas;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : MEncetak Nama
 */

public class Main {
    public static void main(String []args){
        Scanner inputKeyboard = new Scanner(System.in);
        Printer dataPrinter = new Printer();
        
        String nama;
        int jmlCetak;
        
        System.out.println("=====Aplikasi pencetak Nama=====");
        
        // input nama
        System.out.print("Masukan Nama Anda  : ");
        nama = inputKeyboard.nextLine();
        
        // input jumlah pencetakan
        System.out.print("Mau cetak berapa kali? : ");
        jmlCetak = inputKeyboard.nextInt();
        
        dataPrinter.setNama(nama);
        dataPrinter.setJmlCetak(jmlCetak);
        dataPrinter.cetak(dataPrinter.getNama());
        
        System.out.println("Hasil Cetak : ");
        dataPrinter.cetak(dataPrinter.getJmlCetak(),dataPrinter.getNama());
        
    }
}

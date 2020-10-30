/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program untuk mengubah ke huruf besar dan kecil
 */
public class IF110119005Latihan27HurufBesarKecil {
    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    private static String masukKalimat(){
        System.out.print("Masukkan Kalimat : ");
        return scanner.nextLine();
    }
    private static void tampilanKalimat(String kalimat){
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : ".concat(kalimat.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(kalimat.toLowerCase()));}
    public static void main(String[] args) {
        // TODO code application logic here
        tampilanKalimat(masukKalimat());
        System.out.println("Developed by : Hayin Ananta");
    }
}
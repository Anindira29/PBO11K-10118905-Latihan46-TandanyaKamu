/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan46.tandanyakamu;
import java.util.*;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Perhitungan Umur
 */
public class PBO11K10118905Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
	Age a = new Age(2019);
	System.out.print("Masukan Tahun Lahir Anda : ");
	int i = input.nextInt();
	a.setYearBirth(i);
	System.out.println("");
	System.out.println("==========Hasil Perhitungan Umur==========");
	System.out.println("Tahun lahir anda\t: "+ a.getYearBirth());
	System.out.println("Hari ini tahun\t\t: "+a.getYearNow());
	System.out.println("Umur kamu sampai hari ini adalah "+a.hitungUmur()+" tahun");
	System.out.println("Tandanya kamu"+a.tandanyaKamu(a.hitungUmur()));
    }
    
}

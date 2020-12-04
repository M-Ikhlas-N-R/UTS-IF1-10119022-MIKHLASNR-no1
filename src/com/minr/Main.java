package com.minr;
import java.util.Date;
import java.util.Scanner;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : mengetahui karakter diri melalui umur
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date date = new Date();
        Age jono = new Age(date.getYear());
        System.out.print("Masukkan Tahun Lahir Anda : ");
        jono.setYearBirth(scan.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + jono.getYearBirth());
        System.out.println("Hari ini tahun : " + jono.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+jono.hitungUmur()+" tahun");
        System.out.println("Tandanya Kamu "+jono.tandanyaKamu(jono.hitungUmur()));
    }
}

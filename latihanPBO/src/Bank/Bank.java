/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author LENOVO
 */
public class Bank {
    int saldo;
    int hasil;
    public Bank(int saldo){
        this.saldo = saldo;
    }
    public void simUang(){
        int simpan = 500000;
        hasil = simpan + saldo;
        System.out.println("Simpan uang: Rp. " + simpan);
        System.out.println("Saldo saat ini: Rp. " + hasil);
    }
    public void ambUang(){
        int ambil = 150000;
        hasil = hasil - ambil;
        System.out.println("Ambil uang: Rp. " + ambil);
        System.out.println("Saldo saat ini: Rp. " + hasil);
    }
    public void getSaldo(){
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }
}

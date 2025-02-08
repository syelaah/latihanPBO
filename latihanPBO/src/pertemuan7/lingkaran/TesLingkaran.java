/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.lingkaran;

/**
 *
 * @author sye
 */
public class TesLingkaran {
    public static void main(String[] args) {
        
       Lingkaran l1 = new Lingkaran(1.1);
       System.out.println(l1);
       Lingkaran l2 = new Lingkaran();
       System.out.println(l2);
       
       l1.setRad(2.2);
       System.out.println(l1);
       System.out.println("Jari-jari Lingkaran l: " + l1.getRad());
       
       System.out.printf("Luas lingkaran l: %.2f%n", l1.getLuas());
       System.out.printf("Keliling lingkaran l: %.2f%n", l1.getKeliling());
       
       
    }
}

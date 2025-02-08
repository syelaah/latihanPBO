/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package per6;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class SalamKenal {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukkan Nama Anda: ");
        String nama = masukan.nextLine();
        
        System.out.println("Halo, Salam kenal sdr " + nama + "!");
    }
}

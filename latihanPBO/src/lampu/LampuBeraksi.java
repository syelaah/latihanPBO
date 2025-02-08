/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lampu;

/**
 *
 * @author LENOVO
 */
public class LampuBeraksi {
    public static void main(String[] args) {
        
        Lampu lampuKamar = new Lampu();
        
        System.out.println("Status Lampu Saat Ini: Mati");
        
        lampuKamar.hidupkan(); //hidupkan lampu
        lampuKamar.matikan(); //matikan lampu
        lampuKamar.matikan(); //matikan lampu
        lampuKamar.hidupkan(); //hidupkan Lampu
        lampuKamar.hidupkan(); //hidupkan lampu
    }
}

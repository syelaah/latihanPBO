/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7.lingkaran;

/**
 *
 * @author sye
 */
public class Lingkaran {
    
    private double rad;
    
    public Lingkaran(){
        this.rad = 1.0;
    }
    
    public Lingkaran(double r){
        this.rad = r;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double jari) {
        this.rad = jari;
    }

    public double getLuas() {
        double luas = 3.14 * rad * rad;
        return luas;
    }

    public double getKeliling() {
        double keliling = 2 * 3.14 * rad;
        return keliling;
    }
   
    @Override
    public String toString() {
        return "Lingkaran [Jari-jari = " + rad + "]";
    }
}
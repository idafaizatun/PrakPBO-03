/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobilAku = new Mobil("Honda", "Civic", 2021, "Putih");
        Mobil mobilKamu = new Mobil ("Toyota", "Avanza", 2019, "Hitam");
        
        mobilAku.displayInfo();
        mobilAku.setWarna("Putih");
        mobilAku.startEngine();
        
        mobilKamu.displayInfo();
        mobilKamu.setWarna("Hitam");
        mobilKamu.startEngine();
    }
}

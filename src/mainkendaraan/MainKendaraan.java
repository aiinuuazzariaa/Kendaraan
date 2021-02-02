/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainkendaraan;

/**
 *
 * @author MOKLET-2
 */
    public class MainKendaraan {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
       Kendaraan.kendaraan();
       tipe();   
    }
       static void tipe(){
       System.out.println("Nama Mobil : Avanza");
       System.out.println("Edisi Mobil : Avanza 1.3 E MT");
       System.out.println("Tinggi (mm) : 1695");
       System.out.println("Panjang (mm) : 4190");
       System.out.println("Jarak Sumbu Roda (mm) : 2655");
       System.out.println("Lebar (mm) : 1660");
       System.out.println("Isi Silinder (cc) : 1329");
       System.out.println("Konfigurasi Transmisi : 5 Speed Manual");   
       
       }
    
}

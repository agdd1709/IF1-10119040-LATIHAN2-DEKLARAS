/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deklarasi;

/**
 *
 * @author Acer
 */
public class Deklarasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deeklarasi variable
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberikan nilai ke variable
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan hasil
        System.out.println();
        System.out.println("Isi variable nilai = " + nilaiInt);
        System.out.println("Isi variable PHI = " + PHI);
        System.out.println("Isi variable logika = " + nilaiLogika);
        System.out.println("Isi variable karakter = " + nilaiKarakter);
    }
    
}

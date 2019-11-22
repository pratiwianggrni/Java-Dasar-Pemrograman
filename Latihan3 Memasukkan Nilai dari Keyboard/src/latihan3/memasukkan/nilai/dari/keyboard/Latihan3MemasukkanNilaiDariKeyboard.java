/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3.memasukkan.nilai.dari.keyboard;
import java.util.Scanner;
/**
 *
 * @author Pratiwi Anggraeni Abidin
 */
public class Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
}

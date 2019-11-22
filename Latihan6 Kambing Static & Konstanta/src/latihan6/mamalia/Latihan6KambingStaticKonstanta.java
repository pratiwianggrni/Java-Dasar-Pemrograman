/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6.mamalia;

/**
 *
 * @author Pratiwi Anggraeni Abidin
 */
class Mamalia {
    // Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;
}



class KambingStatic {
    
   // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing);
    }
}
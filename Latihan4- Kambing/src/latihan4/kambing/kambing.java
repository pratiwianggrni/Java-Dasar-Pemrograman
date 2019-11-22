/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.kambing;

/**
 *
 * @author LENOVO
 */
 class Kambing {
     public void tambahKambing() {
         // Deklarasi variabel lokal
         int jumlahKambing = 0;
         
         jumlahKambing = jumlahKambing + 5;
         System.out.println("Jumlah Kambing setelah ditambah: " + 
                          jumlahKambing);
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
}

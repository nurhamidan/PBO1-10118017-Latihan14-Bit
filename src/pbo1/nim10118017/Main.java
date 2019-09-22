package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Melakukan operasi bit pada variabel yang ada kemudian menampilkan hasilnya di layar.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c;
        
        //Menggunakan logika AND.
        c = a & b;
        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);
        
        //Menggunakan logika OR.
        c = a | b;
        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);
        
        //Menggunakan logika XOR.
        c = a ^ b;
        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);
        
        //Menggunakan logika NOT.
        c = ~a;
        /* -61 = 1100 0011 */
        System.out.println("~a = " + c);
        
        //Menggeser bit ke kiri.
        c = a << 2;
        /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);
        
        //Menggeser bit ke kanan.
        c = a >> 2;
        /* 15 = 0000 1111 */
        System.out.println("a >> 2 = " + c);
    }
    
}

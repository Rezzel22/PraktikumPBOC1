/*Nama File     : Coersion.java
 *Deskripsi     : Polimorfisme Ad Hoc tipe Coercion
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 30/04/2026 
 *Lab           : C1*/

public class Coercion { 
    public static void main(String args[]) {
        // Point A
        System.out.println("============ A ============");
        
        int x = 65;
        
        System.out.println("X bentuk integer: " + x);
        System.out.println("X bentuk char: " + (char)x);
        System.out.println("X bentuk real: " + (double)x);

        // Point B
        System.out.println("============ B ============");
        
        double x_real = (double)x;
        System.out.println("X konversi ke real: " + x_real);
        x = (int)x_real;
        System.out.println("X kembali ke int: " + x);
        
        // Point C
        System.out.println("============ C ============");
        String X = "1234";
        String Y = "5678";
        
        System.out.println("String X: " + X);
        System.out.println("String Y: " + Y);
        
        String S = X + Y;
        System.out.println("String S hasil konkat X dan Y: " + S);
        
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Integer Z hasil penjumlahan X dan Y: " + Z);

        // Point D
        System.out.println("============ D ============");
        String P = "12.34";
        String Q = "56.78";
        
        System.out.println("String P: " + P);
        System.out.println("String Q: " + Q);
        
        String R = P + Q;
        System.out.println("String R hasil konkat P dan Q: " + R);
        
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Double D hasil penjumlahan P dan Q: " + D);
        
        // Point E
        System.out.println("============ E ============");
        Integer A = Integer.parseInt(S);

        System.out.println("Integer A hasil konversi S: " + A);

        // Point F
        System.out.println("============ F ============");
        String T = A.toString();

        System.out.println("String T hasil konversi A: " + T);
    }
} 


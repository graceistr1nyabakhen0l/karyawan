import java.util.Scanner;

public class Karyawan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double totalGaji = 0, gajiTerendah = 0, gajiTertinggi = 0;

        for (int i = 1; 1 <= 5; i++) {
            System.out.println(" Masukkan Gaji Karyawan ke- " +i+ " : ");
            double gaji = s.nextDouble();
            totalGaji += gaji;
            if (i == 1 || gaji < gajiTerendah)
                gajiTerendah = gaji;
            if (i == 1 || gaji > gajiTertinggi) 
                gajiTertinggi = gaji;
            } 

            System.out.println(" Total Gaji Selama Sebulan "+totalGaji);
            System.out.println(" Total Gaji Terendah "+gajiTerendah);
            System.out.println(" Total Gaji Tertinggi "+gajiTertinggi);

            s.close();
        }
            
    }

     


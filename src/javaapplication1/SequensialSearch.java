package javaapplication1;
import java.util.Scanner;
public class SequensialSearch {
    public static void main(String[] args) {
        int D[]={30, 20, 7 ,38, 40};
        int N=5; int L,B;
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan data yang dicari =");
        B=baca.nextInt();
        L=0;
        do{
            if (B==D[L]){
                System.out.println("Data Ketemu");
                System.exit(0);
            }
            L=L+1;
        }while(L<N);
        System.out.println("Data Tidak Ketemu");
    }
}
package javaapplication1;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        int D[]={7, 20, 30, 38, 50};
        Scanner input = new Scanner(System.in);
        int B,P,Q,M,N;
        N=5;
        System.out.print("Masukkan data yang dicari =");
        B=input.nextInt();
//        data dimulai dari nol
        P=0; Q=N;
        do{
            M=(int)((P+Q)/2);
            if (B==D[M]){
                System.out.println("Data Ketemu");
                System.exit(0);
            }
            if (B>D[M]){
                P=M+1;
            }
            else Q=M-1;
        }while(!(P>=Q));
        System.out.println("Tidak Ketemu");
    }
}

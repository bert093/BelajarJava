package javaapplication1;
public class SelectionSort {
    public static void main(String[] args) {
        int D[]={30, 20 ,7, 10, 25};
        int N=5; int S,L,P,T;
//        index array dimulai dari 0
        S=0;
        do{
            L=S+1; P=S;
            do{
                if (D[P]>D[L]){
                P=L;
            }
            L=L+1;
            }while(L<N);
            T=D[P]; D[P]=D[S]; D[S]=T;
            S=S+1;
        }while(S!=N);
        for(int i=0; i<N; i++){ //mengubah nilai i menjadi 0
            System.out.println(D[i]); //menampilkan dari array D
        }
    } 
}

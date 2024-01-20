package javaapplication1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Materi3 {
    public static void main(String[] args) {
        
        double alas, tinggi, sisi_miring, keliling;
        
        alas = Double.parseDouble(JOptionPane.showInputDialog(null, "Alas :"));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "tinggi :"));
        
        sisi_miring = Math.sqrt(alas * alas + tinggi);
        keliling = alas + tinggi + sisi_miring;
        
        JOptionPane.showMessageDialog(null, "Alas : " + alas +"\ntinggi :" +
        tinggi+"\nsisi_miring: "+ sisi_miring+"\nkeliling :"
        + keliling, "Segitiga", JOptionPane.INFORMATION_MESSAGE);
    }
}

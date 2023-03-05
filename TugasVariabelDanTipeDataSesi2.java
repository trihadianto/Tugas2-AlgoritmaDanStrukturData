/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.variabel.dan.tipe.data.sesi.pkg2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TugasVariabelDanTipeDataSesi2 {

    /**
     * @param args the command line arguments
     */
public static void main(String [] args){
  int bil1,bil2,hasil,hasil2,hasil3,hasil4,hasil5;
  String op;
   
   Scanner a = new Scanner(System.in);
        System.out.print("Masukan bilangan 1: ");
        bil1 = a.nextInt();
        System.out.print("Masukan bilangan 2 :");
        bil2 = a.nextInt();
        
        System.out.print("Masukan oprator :");
        op = a.next();
        
    switch (op) {
        case "+":
            hasil = bil1 + bil2;
            System.out.println("Hasil nya adalah :" + hasil);
            break;
        case "-":
            hasil2 = bil1 - bil2;
            System.out.println("Hasil nya adalah :" + hasil2);
            break;
        case "/":
            hasil3 = bil1 / bil2;
            System.out.println("Hasil nya adalah :" + hasil3);
            break;
        case "*":
            hasil4 = bil1 * bil2;
            System.out.println("Hasil nya adalah :" + hasil4);
            break;
        case "%":
            hasil5 = bil1 % bil2;
            System.out.println("Hasil nya adalah :" + hasil5);
            break;
        default:
            break;
    }
}
}
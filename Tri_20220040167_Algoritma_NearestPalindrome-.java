import java.util.Scanner;


public class NearestPalindrome {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Nearest Palindrome======");
        System.out.println("Program ini akan meminta input berupa sebuah angka.");
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        int angkaPalindrome = angka;
        while (!ispalindrome(angkaPalindrome)){
            angkaPalindrome++;
        }
        System.out.println("Angka palindrome terdekat dari " + angka + " adalah " + angkaPalindrome);
    }
    
 public static boolean isPalindrome(int angka) {
        int reversedNumber = 0;
        int originalNumber = angka;
        while (angka != 0) {
            int digit = angka % 10;
            reversedNumber = reversedNumber * 10 + digit;
            angka /= 10;
        }
        return originalNumber == reservedNumber;
    }
}
        
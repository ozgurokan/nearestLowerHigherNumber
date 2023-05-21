import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n, number, lowerNumber = 0, higherNumber = 0; // eleman sayısı

        // kullanıcıdan dizinin boyut bilgisi alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Dizideki eleman sayısı: ");
        n = input.nextInt();

        // her elemanla bölme işlemi yapılacağı için double türünde bir liste tanımlanır
        int[] list = new int[n];

        // kullanıcının girdiği dizi boyutu kadar dönecek bir döngü açılır ve her seferinde kullanıdan eleman istenir.
        for (int i = 0; i < n; i++) {
            System.out.print(i + ". indeksteki eleman: ");
            list[i] = input.nextInt();
        }

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        // liste küçükten büyüğe sıralanır
        Arrays.sort(list);

        // büyükten kuüçüğe sıralanmış listeyi döner ve numberda küçük her sayıyı lowerNumber'a eşitler lowerNumber'ın son değeri numberdan bir önceki küçük sayı olur
        // i değeri numberdan büyük olduğu anda higherNumber'a i değerini atar ve döngüyü durdurur.
        for (int i : list) {
            if (i < number) {
                lowerNumber = i;
            }
            if (i > number) {
                higherNumber = i;
                break;
            }
        }

        System.out.println("Girdiğiniz sayıya en yakın küçük sayı: " + lowerNumber);
        System.out.println("Girdiğiniz sayıya en yakın büyük sayı: " + higherNumber);


    }
}